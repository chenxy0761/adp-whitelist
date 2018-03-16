package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Bytedance extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-697324234", AccountType.IMEI,Field.Url,"dm.bytedance.com", gen feature ("uuid") )
	}
}