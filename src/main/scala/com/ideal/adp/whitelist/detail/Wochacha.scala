package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Wochacha extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("156386949", AccountType.IMEI,Field.Url,"android.wochacha.com", gen feature ("udid") )
    terminalWhitelist("-2067467420", AccountType.MAC,Field.Url,"android.wochacha.com", gen feature ("mac") urlDecode())
	}
}