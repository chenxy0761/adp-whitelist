package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Dianping extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id130", "dianping.com", gen feature("ua"))
    }
}
