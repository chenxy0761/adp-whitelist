package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Anjuke extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1921340011", AccountType.MDN,Field.Url,"api.anjuke.com", gen feature ("broker_phone") )
    terminalWhitelist("100011214", AccountType.IMEI,Field.Url,"api.anjuke.com", gen feature ("i") )
	}
}