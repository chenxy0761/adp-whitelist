package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Baixing extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("21478189", AccountType.MDN,Field.Url,"www.baixing.com", gen feature ("mobile") )
	}
}