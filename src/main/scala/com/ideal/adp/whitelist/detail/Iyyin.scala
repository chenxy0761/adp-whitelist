package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Iyyin extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("387802182", AccountType.IDFA,Field.Url,"so.ard.iyyin.com", gen feature ("idfa") )
	}
}