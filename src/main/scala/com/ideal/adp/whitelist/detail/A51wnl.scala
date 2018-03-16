package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A51wnl extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("513620609", AccountType.IDFA,Field.Url,"ad.51wnl.com", gen feature ("idfa") len(36,36))
	}
}