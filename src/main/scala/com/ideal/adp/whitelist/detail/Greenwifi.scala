package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Greenwifi extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1749511720", AccountType.MAC,Field.Url,"auth.greenwifi.com.cn", gen feature ("mac") )
	}
}