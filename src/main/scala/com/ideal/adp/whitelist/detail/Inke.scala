package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Inke extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1949957990", AccountType.IDFA,Field.Url,"service.inke.com", gen feature ("idfa") )
	}
}