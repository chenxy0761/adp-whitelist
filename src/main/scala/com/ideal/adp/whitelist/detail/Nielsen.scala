package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Nielsen extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-449156898", AccountType.ANDROIDID,Field.Url,"t.cr-nielsen.com", gen feature ("ANDROIDID") len(13,16))
	}
}