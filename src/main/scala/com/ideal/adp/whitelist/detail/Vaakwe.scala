package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Vaakwe extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("2128891376", AccountType.MDN,Field.Url,"i.vaakwe.com", gen feature ("mobile") regex())
	}
}