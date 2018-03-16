package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Admaster extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("278887064", AccountType.ANDROIDID,Field.Url,"v.admaster.com.cn", gen feature ("ANDROIDID") )
    terminalWhitelist("-392707163", AccountType.ANDROIDID,Field.Url,"v.admaster.com.cn", gen feature ("android_id") )
	}
}