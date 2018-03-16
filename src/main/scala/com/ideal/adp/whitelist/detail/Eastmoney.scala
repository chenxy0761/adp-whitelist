package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Eastmoney extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1410387034", AccountType.MDN,Field.Cookie,"guba.eastmoney.com", gen feature ("pu") regex())
	}
}