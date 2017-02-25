package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Ctrip extends LogicGenerable {
    override def load(): Unit = {
        val url = "ctrip.com"
        networkWhitelist("id133", url, gen feature("AHeadUserInfo"))
        networkWhitelist("id134", url, gen feature("CtripUserInfo"))
        networkWhitelist("id135", url, gen feature("AHeadUserInfo") stringToMap("&", "=") find("U"))
        networkWhitelist("id135", url, gen feature("CtripUserInfo") stringToMap("&", "=") find("U"))
        networkWhitelist("id136", url, gen feature("AHeadUserInfo") stringToMap("&", "=") find("UserName"))
        networkWhitelist("id136", url, gen feature("CtripUserInfo") stringToMap("&", "=") find("UserName"))
    }
}
