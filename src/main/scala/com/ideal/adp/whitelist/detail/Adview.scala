package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Adview extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1185070152", AccountType.IMEI,Field.Url,"bid.adview.cn", gen feature ("ud") )
	}
}