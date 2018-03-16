package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Cmread extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1139063431", AccountType.MDN,Field.Cookie,"wap.cmread.com", gen feature ("userPhone") )
	}
}