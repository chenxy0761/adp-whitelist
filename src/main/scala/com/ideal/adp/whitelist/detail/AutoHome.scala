package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class AutoHome extends LogicGenerable {
    override def load(): Unit = {
        networkWhitelist("id160", "autohome.com", gen feature("autouserid"))
    }

}
