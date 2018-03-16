package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Qidian extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1644161052", AccountType.MDN,Field.Cookie,"4g.if.qidian.com", gen feature ("stat_sessid") )
    terminalWhitelist("-96081290", AccountType.MDN,Field.Cookie,"ios4g.if.qidian.com", gen feature ("stat_sessid") )
	}
}