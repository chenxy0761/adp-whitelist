package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Letv extends LogicGenerable {
    override def load(): Unit = {
        val url = "letv.com"
        networkWhitelist("id64", url, gen feature("ssouid"))
        networkWhitelist("id65", url, gen feature("sso_nickname"))
        networkWhitelist("id66", url, gen feature("ark_uuid"))

        terminalWhitelist("1000197319", AccountType.MDN, Field.Cookie, "ark.letv.com", gen feature("loginnamecookie") regex())
        terminalWhitelist("110929252", AccountType.MAC, Field.Url, "ark.letv.com", gen feature("mac") urlDecode())
    }
}
