package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Dangdang extends LogicGenerable {
    override def load(): Unit = {
        val url = "dangdang.com"
        networkWhitelist("id100", url, gen feature("ddoy"))
        networkWhitelist("id101", url, gen feature("ddoy") urlDecode() stringToMap("&", "=") find("email"))
        networkWhitelist("id103", url, gen feature("ddoy") urlDecode() stringToMap("&", "=") find("uname"))
    }
}
