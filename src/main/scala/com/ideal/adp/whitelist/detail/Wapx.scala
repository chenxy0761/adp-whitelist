package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Wapx extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("914649381", AccountType.IMEI,Field.Url,"ads.wapx.cn", gen feature ("udid") )
	}
}