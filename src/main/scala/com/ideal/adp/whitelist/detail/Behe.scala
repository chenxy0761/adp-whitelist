package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Behe extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id99", "behe.com", gen feature("bhuid"))
    }
}
