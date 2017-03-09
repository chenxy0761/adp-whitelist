package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Vip extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("vip.com", "vipstatic.com")
        networkWhitelist("id110", urls, gen feature("visit_id"))
        networkWhitelist("id111", urls, gen feature("login_username"))
        networkWhitelist("id112", urls, gen feature("VipRNAME"))
        networkWhitelist("id113", urls, gen feature("VipRUID"))

        terminalWhitelist("1001089175", AccountType.MDN, Field.Cookie, "act.vip.com", gen feature("login_username") regex())
        terminalWhitelist("1066750497", AccountType.MDN, Field.Cookie, "list.vip.com", gen feature("login_username") regex())
        terminalWhitelist("1179476853", AccountType.MDN, Field.Cookie, "list.vip.com", gen feature("VipRNAME") regex())
    }
}
