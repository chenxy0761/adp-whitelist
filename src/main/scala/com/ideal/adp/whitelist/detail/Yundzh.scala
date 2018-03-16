package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Yundzh extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-150597276", AccountType.IMEI,Field.Url,"v2.yundzh.com", gen feature ("deviceid") )
	}
}