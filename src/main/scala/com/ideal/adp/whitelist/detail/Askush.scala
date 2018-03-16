package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Askush extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("2123148754", AccountType.ANDROIDID,Field.Url,"gcapi.askush.cn", gen feature ("ANDROIDID") )
	}
}