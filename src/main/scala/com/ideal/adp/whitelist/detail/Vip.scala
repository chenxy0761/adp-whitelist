package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Vip extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("vip.com", "vipstatic.com")
        networkWhitelist("id110", urls, gen feature("visit_id"))
        networkWhitelist("id111", urls, gen feature("login_username"))
        networkWhitelist("id112", urls, gen feature("VipRNAME"))
        networkWhitelist("id113", urls, gen feature("VipRUID"))
    }
}
