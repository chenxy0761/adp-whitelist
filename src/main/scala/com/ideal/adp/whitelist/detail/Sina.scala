package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Sina extends LogicGenerable {
  override def load(): Unit = {
    val urls = Array("weibo.com", "sina", "sinaimg.cn", "ximalaya.com")
    networkWhitelist("id25", urls, gen feature ("sup"))
    networkWhitelist("id31", urls, gen feature ("sup") urlDecode () stringToMap ("&", "=") find ("nick"))
    networkWhitelist("id30", urls, gen feature ("sup") urlDecode () stringToMap ("&", "=") find ("name") urlDecode ())
    networkWhitelist("id34", urls, gen feature ("sup") urlDecode () stringToMap ("&", "=") find ("uid") urlDecode ())
    networkWhitelist("id32", urls, gen feature ("sus"))
    networkWhitelist("id34", urls, gen -> processSusSid)
    networkWhitelist("id33", urls, gen feature ("subp"))
    networkWhitelist("id34", urls, gen feature ("myuid"))
    networkWhitelist("id30", urls, gen feature ("un"))

    terminalWhitelist("-319026416", AccountType.IMEI, Field.Url, "platform.sina.com.cn", gen feature ("pdps_params") urlDecode () jsonToMap () find ("app") find ("device_id"))
    terminalWhitelist("-2002937858", AccountType.IMEI, Field.Url, "platform.sina.com.cn", gen feature ("token"))
    terminalWhitelist("26186497", AccountType.IMEI, Field.Url, "sax.sina.com.cn", gen feature ("userid"))
  }

  /*    def processSupNick(cookie: String) = processSup(cookie, "nick")
    def processSupName(cookie: String) = URLDecoder.decode(processSup(cookie, "name").getOrElse(""), "utf-8")
    def processSupUid(cookie: String) = URLDecoder.decode(processSup(cookie, "uid").getOrElse(""), "utf-8")
    private def processSup(cookie: String, key: String): Option[String] = {
        val mm = Utilities.string2Map(Some(cookie), "&", "=")
        if (mm.isEmpty) None else mm.get.get(key)
    }*/
  def processSusSid(cookie: String) = {
    val parts = cookie.split("-")
    if (parts.length < 2) None else if (parts(0) != "sid") None else Some(parts(1))
  }
}
