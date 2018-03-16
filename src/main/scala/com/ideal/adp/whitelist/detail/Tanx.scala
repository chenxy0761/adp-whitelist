package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Tanx extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("130023097", AccountType.MAC,Field.Url,"ope.tanx.com", gen feature ("pvid") subStringX(-1,12))
	}
}