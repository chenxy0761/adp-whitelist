package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Iqiyi extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id58", "iqiyi.com", gen feature("P00002") urlDecode() jsonToMap() find("uid"))
    }
}
