package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Gentags extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1788176629", AccountType.ANDROIDID,Field.Url,"imp.gentags.net", gen feature ("android_id") )
	}
}