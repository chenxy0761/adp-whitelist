package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Youku extends LogicGenerable {
    override def load(): Unit = {
        val url = "youku.com"
        networkWhitelist("id60", url, gen feature("__ysuid"))
        networkWhitelist("id61", url, gen feature("ykss"))
        networkWhitelist("id62", url, gen feature("u"))
    }
}
