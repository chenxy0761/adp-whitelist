package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Renren extends LogicGenerable {
    override def load(): Unit = {
        val url = "renren.com"
        networkWhitelist("id4", url, gen feature("id"))
        networkWhitelist("id16", url, gen feature("jebe_key"))
    }
}
