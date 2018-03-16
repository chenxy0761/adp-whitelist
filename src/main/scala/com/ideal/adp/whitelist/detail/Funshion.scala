package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Funshion extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1306919489", AccountType.IMEI,Field.Url,"stat.funshion.net", gen feature ("imei_id") )
    terminalWhitelist("-369028291", AccountType.ANDROIDID,Field.Url,"stat.funshion.net", gen feature ("android_id") )
	}
}