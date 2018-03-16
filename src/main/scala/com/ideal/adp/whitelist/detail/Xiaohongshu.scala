package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Xiaohongshu extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("176108259", AccountType.IDFA,Field.Url,"www.xiaohongshu.com", gen feature ("deviceId") )
	}
}