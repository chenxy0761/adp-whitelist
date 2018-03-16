package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A52shangou extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("614239454", AccountType.MDN,Field.Cookie,"imgsize.52shangou.com", gen feature ("redcat_user_mobile") )
	}
}