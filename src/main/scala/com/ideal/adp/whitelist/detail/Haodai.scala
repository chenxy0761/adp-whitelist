package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Haodai extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id80", "haodai.com", gen feature("user_info"))
    }
}
