package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Hiido extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1127513524", AccountType.MDN,Field.Url,"ylog.hiido.com", gen feature ("guid") )
	}
}