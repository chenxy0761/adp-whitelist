package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Le extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("199875139", AccountType.MDN,Field.Cookie,"www.le.com", gen feature ("loginname") regex())
    terminalWhitelist("699066855", AccountType.MDN,Field.Cookie,"www.le.com", gen feature ("loginnamecookie") regex())
	}
}