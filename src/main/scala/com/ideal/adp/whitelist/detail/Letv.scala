package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Letv extends LogicGenerable {
  override def load(): Unit = {
    val url = "letv.com"
    networkWhitelist("id64", url, gen feature ("ssouid"))
    networkWhitelist("id65", url, gen feature ("sso_nickname"))
    networkWhitelist("id66", url, gen feature ("ark_uuid"))

    terminalWhitelist("1000197319", AccountType.MDN, Field.Cookie, "ark.letv.com", gen feature ("loginnamecookie") regex ())
    terminalWhitelist("110929252", AccountType.MAC, Field.Url, "ark.letv.com", gen feature ("mac") urlDecode ())
    terminalWhitelist("1145718633", AccountType.IMEI, Field.Url, "ark.letv.com", gen feature ("d"))
    terminalWhitelist("-1091785007", AccountType.IMEI, Field.Url, "dynamic.user.app.m.letv.com", gen feature ("imei"))
    terminalWhitelist("1344958595", AccountType.MDN, Field.Cookie, "apple.www.letv.com", gen feature ("loginname") regex ())
    terminalWhitelist("-784310141", AccountType.IMEI, Field.Url, "dynamic.app.m.letv.com", gen feature ("imei"))
    terminalWhitelist("1511398098", AccountType.MAC, Field.Url, "dc.letv.com", gen feature ("auid") urlDecode () len (12, 17))
    terminalWhitelist("-762971833", AccountType.IMEI, Field.Url, "apple.www.letv.com", gen feature ("uuid") split ("_", 0))
    terminalWhitelist("167063331", AccountType.MDN, Field.Cookie, "ark.letv.com", gen feature ("loginname") regex ())
    terminalWhitelist("1824503847", AccountType.MDN, Field.Cookie, "apple.www.letv.com", gen feature ("loginnamecookie") regex ())
    terminalWhitelist("-1826113987", AccountType.MAC, Field.Url, "apple.www.letv.com", gen feature ("wmac"))
    terminalWhitelist("1934991595", AccountType.MDN, Field.Cookie, "dc.letv.com", gen feature ("loginname") regex ())
    terminalWhitelist("-2042016313", AccountType.MAC, Field.Url, "apple.www.letv.com", gen feature ("mac") len (12, 12))
    terminalWhitelist("2067822019", AccountType.MDN, Field.Cookie, "selector.webp2p.letv.com", gen feature ("loginname") regex ())
    terminalWhitelist("-2095880345", AccountType.MDN, Field.Cookie, "selector.webp2p.letv.com", gen feature ("loginnamecookie") regex ())
    terminalWhitelist("-2105459939", AccountType.MAC, Field.Url, "ark.letv.com", gen feature ("wmac"))
    terminalWhitelist("-1699185281", AccountType.IMEI, Field.Url, "ark.letv.com", gen feature ("im"))
    terminalWhitelist("-36295967", AccountType.IDFA, Field.Url, "api.mob.app.letv.com", gen feature ("devid") len (36, 36))
    terminalWhitelist("376432045", AccountType.IDFA, Field.Url, "apple.www.letv.com", gen feature ("device_id") len (36, 36))
    terminalWhitelist("-408260822", AccountType.MAC, Field.Url, "dc.letv.com", gen feature ("mac") urlDecode () len (12, 17))
    terminalWhitelist("621893519", AccountType.MDN, Field.Cookie, "dc.letv.com", gen feature ("loginnamecookie") regex ())
    terminalWhitelist("-2025840161", AccountType.IMEI, Field.Url, "apple.www.letv.com", gen feature ("im"))
    terminalWhitelist("852286925", AccountType.MAC, Field.Url, "api.platform.letv.com", gen feature ("macaddr") urlDecode ())
  }
}
