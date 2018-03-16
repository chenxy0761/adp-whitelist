package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Vivo extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-32303119", AccountType.IMEI,Field.Url,"weather.vivo.com.cn", gen feature ("imei") )
    terminalWhitelist("-1496682303", AccountType.MDN,Field.Url,"point.vivo.com.cn", gen feature ("userName") )
	}
}