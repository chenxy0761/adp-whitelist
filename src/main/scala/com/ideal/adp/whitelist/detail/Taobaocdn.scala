package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Taobaocdn extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1032151963", AccountType.MAC,Field.Url,"strip.taobaocdn.com", gen feature ("ps_id") subStringX(-1,12))
	}
}