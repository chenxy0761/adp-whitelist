package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Hiwemeet extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-730545309", AccountType.IMEI,Field.Url,"adapi.hiwemeet.com", gen feature ("imei") )
    terminalWhitelist("2135309710", AccountType.MAC,Field.Url,"adapi.hiwemeet.com", gen feature ("mac") )
    terminalWhitelist("-345733626", AccountType.IDFA,Field.Url,"adapi.hiwemeet.com", gen feature ("idfa") )
	}
}