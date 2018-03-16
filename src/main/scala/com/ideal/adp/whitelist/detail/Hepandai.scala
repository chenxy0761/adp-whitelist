package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Hepandai extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("287988391", AccountType.MDN,Field.Url,"www.hepandai.com", gen feature ("phone") )
	}
}