package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.LogicDefine.Logic
import com.ideal.adp.whitelist.account.AccountType
import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._

import scala.xml.Null

class JD extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("jd.com", "360buy.com", "wanggou.com")
        networkWhitelist("id9", urls, gen feature("unick"))
        networkWhitelist("id8", urls, gens feature(Array("pin", "alpin", "_pst")))
        networkWhitelist("id10", urls, gen feature("track"))
        networkWhitelist("id18", urls, gen feature("user-key"))
        networkWhitelist("id28", urls, gen feature("mp"))

        terminalWhitelist("-2011145323", AccountType.MAC, Field.Cookie, "www.jd.com", gen feature("pre_session") split("\|", 0) split("-", 1))
        terminalWhitelist("1091417597", AccountType.MAC, Field.Url, "api.m.jd.com", gen feature("uuid"))
        terminalWhitelist("-112114109", AccountType.MDN, Field.Cookie, "s-nfa.jd.com", gen feature("pin") regex())
        terminalWhitelist("-1955922913", AccountType.MAC, Field.Cookie, "sale.jd.com", gen feature("pre_session") split("\|", 0) split("-", 1))

    }
    //先判断是否包含例如os=android,如果有就进行取值，没有不取值
    def preCheck(): Logic ={
        var client = gen feature("client")
        if ("android".equals(client.toString)) {
            gen feature("uuid") split("-", 1)
        }
        None
    }
}
