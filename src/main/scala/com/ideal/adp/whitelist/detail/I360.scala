package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class I360 extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id67", "360.cn", gen feature("__huid"))
    }
}
