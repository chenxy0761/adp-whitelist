package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Adsmogo extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-422933972", AccountType.IMEI,Field.Url,"cfg.adsmogo.org", gen feature ("imei") )
    terminalWhitelist("652888052", AccountType.MAC,Field.Url,"cfg.adsmogo.org", gen feature ("mac") )
	}
}