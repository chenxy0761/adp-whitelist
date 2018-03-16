package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Ganji extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("772715952", AccountType.MDN,Field.Url,"www.ganji.com", gen feature ("phone") regex())
	}
}