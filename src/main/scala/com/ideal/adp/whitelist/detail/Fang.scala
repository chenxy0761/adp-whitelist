package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Fang extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1129392298", AccountType.MDN,Field.Url,"soufunapp.3g.fang.com", gen feature ("searchdata") regex())
    terminalWhitelist("1791423748", AccountType.MDN,Field.Url,"client.3g.fang.com", gen feature ("phone") regex())
    terminalWhitelist("-460637702", AccountType.MDN,Field.Url,"soufunapp.3g.fang.com", gen feature ("mobile") regex())
    terminalWhitelist("-513270546", AccountType.MDN,Field.Url,"soufunapp.3g.fang.com", gen feature ("phone") regex())
    terminalWhitelist("-490144561", AccountType.MDN,Field.Url,"js.ub.fang.com", gen feature ("p") regex())
	}
}