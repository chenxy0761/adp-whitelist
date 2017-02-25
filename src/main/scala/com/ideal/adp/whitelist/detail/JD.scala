package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.account.AccountType
import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._

class JD extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("jd.com", "360buy.com", "wanggou.com")
        networkWhitelist("id9", urls, gen feature("unick"))
        networkWhitelist("id8", urls, gens feature(Array("pin", "alpin", "_pst")))
        networkWhitelist("id10", urls, gen feature("track"))
        networkWhitelist("id18", urls, gen feature("user-key"))
        networkWhitelist("id28", urls, gen feature("mp"))

        terminalWhitelist("2293", AccountType.MDN, Field.Cookie, "mercury.jd.com/log.gif", gen feature("pwdt_id") split("_p", 0, 2) regexStrict())
        terminalWhitelist("2461", AccountType.MDN, Field.Cookie, "h5.m.jd.com", gen feature("pwdt_id") split("_p", 0, 2) regexStrict())
        terminalWhitelist("2551", AccountType.MDN, Field.Cookie, "in.m.jd.com", gen feature("pwdt_id") split("_p", 0, 2) regexStrict())
        terminalWhitelist("2619", AccountType.MDN, Field.Cookie, "s-nfa.jd.com/bd", gen feature("pin") split("_p", 0, 2) regexStrict())
        terminalWhitelist("jd.mdn.xxx", AccountType.MDN, Field.Cookie, "m.jd.com", gen feature("pt_pin") split("_p", 0, 2) regexStrict())
    }
}
