package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Feiniu extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1399989694", AccountType.MDN,Field.Cookie,"www.feiniu.com", gen feature ("th5_username") )
	}
}