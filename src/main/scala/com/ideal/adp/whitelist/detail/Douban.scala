package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Douban extends LogicGenerable {
    override def load(): Unit = {
        val url = "douban.com"
        networkWhitelist("id26", url, gen feature("dbcl2"))
        networkWhitelist("id23", url, gen feature("dbc12") replace("\"", "") splitComfort(":", 0, 2))
        networkWhitelist("id24", url, gen feature("dbc12") replace("\"", "") splitComfort(":", 1, 2))
        networkWhitelist("id27", url, gen feature("ue") replace("\"", ""))
    }
}
