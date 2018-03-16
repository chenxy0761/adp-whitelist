package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Veryzhun extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1960309296", AccountType.MDN,Field.Url,"app.veryzhun.com", gen feature ("mobile") regex())
	}
}