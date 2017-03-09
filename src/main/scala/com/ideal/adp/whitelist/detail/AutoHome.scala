package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class AutoHome extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id160", "autohome.com", gen feature("autouserid"))

        terminalWhitelist("-1030176395", AccountType.IDFA, Field.Url, "adnewnc.app.autohome.com.cn", gen feature("idfa"))

    }

}
