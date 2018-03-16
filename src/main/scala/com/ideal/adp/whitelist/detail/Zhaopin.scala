package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Zhaopin extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1229775183", AccountType.MDN,Field.Cookie,"cnt.zhaopin.com", gen feature ("JSloginnamecookie") )
    terminalWhitelist("-2040358955", AccountType.MDN,Field.Cookie,"www.zhaopin.com", gen feature ("JSloginnamecookie") )
	}
}