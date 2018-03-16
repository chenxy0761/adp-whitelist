package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Exands extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1518292626", AccountType.MAC,Field.Url,"cdn.exands.com", gen feature ("mac") )
    terminalWhitelist("-1849428584", AccountType.MAC,Field.Url,"cdn.exands.com", gen feature ("client_MAC") urlDecode())
	}
}