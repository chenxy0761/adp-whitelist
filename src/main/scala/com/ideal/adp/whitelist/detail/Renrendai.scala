package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Renrendai extends LogicGenerable {
    override def load(): Unit = {
        val url = "renrendai.com"
        networkWhitelist("id75", url, gen feature("ag_fid"))
        networkWhitelist("id76", url, gen feature("jforumUserInfo"))
        networkWhitelist("id77", url, gen feature("jforumUserInfo") split(";", 0))
    }
}
