package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Eclicks extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-353504879", AccountType.MDN,Field.Url,"chaweizhang.eclicks.cn", gen feature ("telephone") )
	}
}