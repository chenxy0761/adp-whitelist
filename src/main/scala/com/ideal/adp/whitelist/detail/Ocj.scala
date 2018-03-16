package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Ocj extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("856772259", AccountType.IDFA,Field.Cookie,"cdnimg.ocj.com.cn", gen feature ("idfa") )
    terminalWhitelist("-89868655", AccountType.MDN,Field.Cookie,"cdnimg.ocj.com.cn", gen feature ("loginid") regex())
	}
}