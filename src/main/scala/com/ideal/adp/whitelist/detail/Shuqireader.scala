package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Shuqireader extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1141271523", AccountType.IMEI,Field.Url,"api10.shuqireader.com", gen feature ("imei") )
	}
}