package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class BitAuto extends LogicGenerable {
    override def load(): Unit = {
        val url = "bitauto.com"
        networkWhitelist("id123", url, gen feature("userid"))
        networkWhitelist("id124", url, gen feature("username"))
        networkWhitelist("id125", url, gen feature("CIGDCID"))
    }
}
