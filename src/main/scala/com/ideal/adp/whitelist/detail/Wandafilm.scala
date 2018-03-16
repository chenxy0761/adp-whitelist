package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Wandafilm extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("554472173", AccountType.MDN,Field.Url,"wap.wandafilm.com", gen feature ("mobile") )
	}
}