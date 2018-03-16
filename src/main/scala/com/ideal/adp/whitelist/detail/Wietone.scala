package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Wietone extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1215158962", AccountType.MAC,Field.Url,"portal.wietone.com", gen feature ("mac") )
    terminalWhitelist("-1650321976", AccountType.MAC,Field.Url,"portal.wietone.com:80", gen feature ("mac") )
	}
}