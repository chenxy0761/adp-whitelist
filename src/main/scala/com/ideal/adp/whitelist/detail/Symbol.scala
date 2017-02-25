package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Symbol extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("baifendian.com", "tcl.com", "huawei.com")
        networkWhitelist("id94", urls, gen feature("bfdid"))
        networkWhitelist("id95", urls, gen feature("bfdid"))
        networkWhitelist("id94", urls, gen feature("bfd_g"))
        networkWhitelist("id96", urls, gen feature("bfd_g"))
    }
}
