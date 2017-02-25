package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Letv extends LogicGenerable {
    override def load(): Unit = {
        val url = "letv.com"
        networkWhitelist("id64", url, gen feature("ssouid"))
        networkWhitelist("id65", url, gen feature("sso_nickname"))
        networkWhitelist("id66", url, gen feature("ark_uuid"))
    }
}
