package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Fanli extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1340219081", AccountType.MDN,Field.Cookie,"fun.fanli.com", gen feature ("prousername") subStringX(0,11) regex())
    terminalWhitelist("-2083106695", AccountType.MDN,Field.Cookie,"ubt0.fanli.com", gen feature ("prousernameutf") regex())
    terminalWhitelist("-436169438", AccountType.MDN,Field.Cookie,"fun.fanli.com", gen feature ("prousernameutf") subStringX(0,11) regex())
    terminalWhitelist("497451058", AccountType.MDN,Field.Cookie,"ubt0.fanli.com", gen feature ("prousername") regex())
	}
}