package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Meituan extends LogicGenerable {
    override def load() {
        networkWhitelist("id150", "meituan.com", gen feature("u"))
        networkWhitelist("id151", "meituan.com", gen feature("n"))
    }
}
