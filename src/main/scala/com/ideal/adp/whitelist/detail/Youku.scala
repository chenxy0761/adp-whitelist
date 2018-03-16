package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Youku extends LogicGenerable {
  override def load(): Unit = {
    val url = "youku.com"
    networkWhitelist("id60", url, gen feature ("__ysuid"))
    networkWhitelist("id61", url, gen feature ("ykss"))
    networkWhitelist("id62", url, gen feature ("u"))

    terminalWhitelist("-1543634185", AccountType.IMEI, Field.Url, "a.play.api.3g.youku.com", gen feature ("imei"))
    terminalWhitelist("-103971436", AccountType.MDN, Field.Cookie, "hd.api.mobile.youku.com", gen feature ("k") regex ())
    terminalWhitelist("-1040632284", AccountType.MAC, Field.Url, "das.api.mobile.youku.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("-1063407606", AccountType.MAC, Field.Url, "val.atm.youku.com", gen feature ("mac"))
    terminalWhitelist("-1300513962", AccountType.MAC, Field.Url, "user-mobile.youku.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("-1590598012", AccountType.MAC, Field.Url, "push.m.youku.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("-1667878319", AccountType.MAC, Field.Url, "a.play.api.3g.youku.com", gen feature ("mac") urlDecode () filter ("1"))
    terminalWhitelist("1682908155", AccountType.MDN, Field.Cookie, "user-mobile.youku.com", gen feature ("k") add (AddUtilities.lstrip) regex ())
    terminalWhitelist("-1698790284", AccountType.MAC, Field.Url, "ad.api.3g.youku.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("1724708342", AccountType.IDFA, Field.Url, "ad.api.3g.youku.com", gen feature ("idfa"))
    terminalWhitelist("-1759978978", AccountType.MDN, Field.Cookie, "hd.api.mobile.youku.com", gen feature ("u") regex ())
    terminalWhitelist("176436148", AccountType.MAC, Field.Url, "detail.api.mobile.youku.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("-1844147421", AccountType.IMEI, Field.Url, "user.api.3g.youku.com", gen feature ("imei"))
    terminalWhitelist("-1338909283", AccountType.IMEI, Field.Url, "hd.api.mobile.youku.com", gen feature ("imei"))
    terminalWhitelist("1910122258", AccountType.MAC, Field.Url, "down.api.mobile.youku.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("191439749", AccountType.MDN, Field.Cookie, "user-mobile.youku.com", gen feature ("u") add (AddUtilities.lstrip) regex ())
    terminalWhitelist("1982051970", AccountType.IDFA, Field.Url, "val.atm.youku.com", gen feature ("idfa"))
    terminalWhitelist("370753907", AccountType.IMEI, Field.Url, "ad.api.3g.youku.com", gen feature ("imei"))
    terminalWhitelist("2140674982", AccountType.IMEI, Field.Url, "push.m.youku.com", gen feature ("imei"))
    terminalWhitelist("-277515740", AccountType.MAC, Field.Url, "user.api.3g.youku.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("400320670", AccountType.MAC, Field.Url, "hd.api.mobile.youku.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("-408866908", AccountType.MAC, Field.Url, "api.mobile.youku.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("1719189439", AccountType.IMEI, Field.Url, "api.mobile.youku.com", gen feature ("im"))
    terminalWhitelist("461700756", AccountType.IMEI, Field.Url, "user-mobile.youku.com", gen feature ("imei"))
    terminalWhitelist("1866636419", AccountType.IMEI, Field.Url, "val.atm.youku.com", gen feature ("im"))
    terminalWhitelist("562192084", AccountType.IDFA, Field.Url, "user-mobile.youku.com", gen feature ("idfa"))
    terminalWhitelist("-651511162", AccountType.IMEI, Field.Url, "rec.api.gamex.mobile.youku.com", gen feature ("imei"))
    terminalWhitelist("-666551838", AccountType.IDFA, Field.Url, "i.play.api.3g.youku.com", gen feature ("idfa"))
    terminalWhitelist("-688429370", AccountType.IDFA, Field.Url, "api.mobile.youku.com", gen feature ("idfa"))
    terminalWhitelist("-146810205", AccountType.IMEI, Field.Url, "api.mobile.youku.com", gen feature ("imei"))
    terminalWhitelist("-855171164", AccountType.MAC, Field.Url, "rec.api.gamex.mobile.youku.com", gen feature ("mac") urlDecode ())
  }
}
