package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Pps extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-555274321", AccountType.IMEI,Field.Url,"api.msg.pps.tv", gen feature ("cupid_uid") )
	}
}