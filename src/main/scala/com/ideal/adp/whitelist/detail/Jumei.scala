package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Jumei extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("jumei.com", "jmstatic.com")
        networkWhitelist("id120", urls, gen feature("cookie_uid"))
        networkWhitelist("id121", urls, gen feature("uid"))
        networkWhitelist("id122", urls, gen feature("nickname"))
    }
}
