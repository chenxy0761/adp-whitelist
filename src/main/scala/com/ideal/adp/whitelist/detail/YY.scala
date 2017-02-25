package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class YY extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("yy.com", "duowan.com")
        networkWhitelist("id55", urls, gen feature("yyuid"))
        networkWhitelist("id56", urls, gen feature("username"))

        val urls2 = Array("huya.com", "5153.com", ".100.com", "1931.com", "kuaikuai", "5253.com")
        networkWhitelist("id55", urls2, gen feature("yyuid"))
    }
}
