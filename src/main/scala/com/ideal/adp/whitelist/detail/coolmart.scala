package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Coolmart extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1373308923", AccountType.MAC,Field.Url,"tp.coolmart.net.cn", gen feature ("mac") )
    terminalWhitelist("-1127328061", AccountType.IMEI,Field.Url,"tp.coolmart.net.cn", gen feature ("imei") )
	}
}