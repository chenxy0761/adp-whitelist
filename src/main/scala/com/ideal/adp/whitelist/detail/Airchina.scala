package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Airchina extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1115304874", AccountType.MDN,Field.Url,"www.airchina.com.cn", gen feature ("moblePhone") )
	}
}