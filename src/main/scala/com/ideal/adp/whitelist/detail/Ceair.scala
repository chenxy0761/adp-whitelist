package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Ceair extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-567453962", AccountType.MDN,Field.Cookie,"www.ceair.com", gen feature ("ffpno") regex())
	}
}