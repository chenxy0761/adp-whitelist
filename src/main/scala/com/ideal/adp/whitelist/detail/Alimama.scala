package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Alimama extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("306378758", AccountType.IDFA,Field.Url,"afpssp.alimama.com", gen feature ("idfa") )
	}
}