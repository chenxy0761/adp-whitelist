package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Meilishuo extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id50", "meilishuo.com", gen feature("meilishuo_global_key"))
    }
}
