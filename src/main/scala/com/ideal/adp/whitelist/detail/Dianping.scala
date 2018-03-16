package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Dianping extends LogicGenerable {
  override def load(): Unit = {
    networkWhitelist("id130", "dianping.com", gen feature ("ua"))
    terminalWhitelist("1128085531", AccountType.MDN, Field.Url, "m.dianping.com", gen feature ("mobile"))
    terminalWhitelist("1578006309", AccountType.MAC, Field.Url, "mapi.dianping.com", gen feature ("wifimac"))
    terminalWhitelist("1599107464", AccountType.IDFA, Field.Url, "mapi.dianping.com", gen feature ("idfa"))
    terminalWhitelist("1958083610", AccountType.ANDROIDID, Field.Url, "mapi.dianping.com", gen feature ("androidid"))
    terminalWhitelist("-20354394", AccountType.MDN, Field.Url, "www.dianping.com", gen feature ("phoneNo"))
    terminalWhitelist("-1156884447", AccountType.IMEI, Field.Url, "mapi.dianping.com", gen feature ("imei"))
    terminalWhitelist("641068929", AccountType.MDN, Field.Cookie, "www.dianping.com", gen feature ("ua") regex ())
    terminalWhitelist("-1908116852", AccountType.IMEI, Field.Url, "m.api.dianping.com", gen feature ("deviceid"))
    terminalWhitelist("810484952", AccountType.MDN, Field.Cookie, "catdot.dianping.com", gen feature ("ua"))
    terminalWhitelist("194924362", AccountType.MDN, Field.Cookie, "hls.dianping.com", gen feature ("ua"))
    terminalWhitelist("1877833888", AccountType.MDN, Field.Cookie, "mlog.dianping.com", gen feature ("ua"))
    terminalWhitelist("-104604332", AccountType.MDN, Field.Url, "meishi.dianping.com", gen feature ("phoneNo"))
  }
}
