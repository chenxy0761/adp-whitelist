package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Cocounion extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("188088150", AccountType.IDFA,Field.Url,"service.cocounion.com", gen feature ("idfa") )
    terminalWhitelist("-2099182424", AccountType.MAC,Field.Url,"service.cocounion.com", gen feature ("rm") urlDecode())
	}
}