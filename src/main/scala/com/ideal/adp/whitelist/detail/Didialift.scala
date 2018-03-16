package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Didialift extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("394294261", AccountType.ANDROIDID,Field.Url,"api.didialift.com", gen feature ("android_id") )
    terminalWhitelist("118610739", AccountType.IMEI,Field.Url,"api.didialift.com", gen feature ("imei") )
	}
}