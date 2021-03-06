package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Iqiyi extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id58", "iqiyi.com", gen feature("P00002") urlDecode() jsonToMap() find("uid"))

        terminalWhitelist("1016675178", AccountType.IDFA, Field.Url, "iface.iqiyi.com", gen feature("_androidId") )
        terminalWhitelist("-1030137109", AccountType.MDN, Field.Cookie, "ifacelog.iqiyi.com", gen feature("P000email"))
        terminalWhitelist("-1051135605", AccountType.IMEI, Field.Url, "iface2.iqiyi.com", gen feature("device_id"))
        terminalWhitelist("1081765012", AccountType.IMEI, Field.Url, "suggest.video.qiyi.com", gen feature("cupid_uid"))
        terminalWhitelist("-1150230773", AccountType.IMEI, Field.Url, "api.t.iqiyi.com", gen feature("cupid_uid"))
    }
}
