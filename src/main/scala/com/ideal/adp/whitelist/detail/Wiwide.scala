package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Wiwide extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-645291174", AccountType.MAC,Field.Url,"wiportal.wiwide.com", gen feature ("called") )
    terminalWhitelist("-80198032", AccountType.MAC,Field.Url,"wiportal.wiwide.com", gen feature ("mac") )
	}
}