package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class I163 extends LogicGenerable {
    override def load(): Unit = {
        val url = "163.com"
        networkWhitelist("id140", url, gen feature("P_INFO"))
        networkWhitelist("id141", url, gen feature("P_INFO") split("\\|", 0))

        terminalWhitelist("1062854511", AccountType.EMAIL, Field.Cookie, "auto.163.com", gen feature("P_INFO") split("\|", 0))

    }
}
