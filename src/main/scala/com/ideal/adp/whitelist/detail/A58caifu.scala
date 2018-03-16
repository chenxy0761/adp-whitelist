package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A58caifu extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("414456457", AccountType.MDN,Field.Url,"www.58caifu.cn", gen feature ("mobilePhone") )
	}
}