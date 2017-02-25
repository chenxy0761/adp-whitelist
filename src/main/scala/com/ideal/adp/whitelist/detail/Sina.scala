package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Sina extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("weibo.com", "sina", "sinaimg.cn", "ximalaya.com")
        networkWhitelist("id25", urls, gen feature("sup"))
        networkWhitelist("id31", urls, gen feature("sup") urlDecode() stringToMap("&", "=") find("nick"))
        networkWhitelist("id30", urls, gen feature("sup") urlDecode() stringToMap("&", "=") find("name") urlDecode())
        networkWhitelist("id34", urls, gen feature("sup") urlDecode() stringToMap("&", "=") find("uid") urlDecode())
        networkWhitelist("id32", urls, gen feature("sus"))
        networkWhitelist("id34", urls, gen -> processSusSid)
        networkWhitelist("id33", urls, gen feature("subp"))
        networkWhitelist("id34", urls, gen feature("myuid"))
        networkWhitelist("id30", urls, gen feature("un"))
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
        if (parts.length < 2) None else if(parts(0) != "sid") None else Some(parts(1))
    }
}
