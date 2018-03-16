package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Zongheng extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-910569245", AccountType.MDN,Field.Url,"anduril.platform.zongheng.com", gen feature ("phone") )
	}
}