package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Gaodun extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-200991877", AccountType.MDN,Field.Url,"laoshi.gaodun.com", gen feature ("phone") )
	}
}