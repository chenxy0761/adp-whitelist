package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Bankcomm extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1074419789", AccountType.MDN,Field.Url,"creditcard.bankcomm.com", gen feature ("mobile") )
    terminalWhitelist("79546825", AccountType.MDN,Field.Url,"creditcard.bankcomm.com", gen feature ("mobile_no") )
	}
}