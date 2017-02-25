package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Bairong extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id146", "bairong.cn", gen feature("_bairong_c_gid"))
    }
}
