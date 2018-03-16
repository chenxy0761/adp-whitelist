package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Qunar extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("506089569", AccountType.IMEI,Field.Url,"touch.qunar.com", gen feature ("uid") )
    terminalWhitelist("652419364", AccountType.MDN,Field.Url,"user.qunar.com", gen feature ("username") regex())
	}
}