package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Youyuan extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1654898857", AccountType.MDN,Field.Url,"youyuan.com", gen feature ("MOBILE") )
	}
}