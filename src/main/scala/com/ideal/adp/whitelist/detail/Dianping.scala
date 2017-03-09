package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Dianping extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id130", "dianping.com", gen feature("ua"))

        terminalWhitelist("1128085531", AccountType.MDN, Field.Url, "m.dianping.com", gen feature("mobile") regex())
    }
}
