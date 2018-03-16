package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Kaola extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-336906065", AccountType.EMAIL,Field.Cookie,"sp.kaola.com", gen feature ("P_INFO") split("\\|",0))
	}
}