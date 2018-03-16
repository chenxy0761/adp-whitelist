package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Bytecdn extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1656484824", AccountType.IDFA,Field.Url,"a3.bytecdn.cn", gen feature ("idfa") )
    terminalWhitelist("-633849442", AccountType.IDFA,Field.Url,"a6.bytecdn.cn", gen feature ("idfa") )
	}
}