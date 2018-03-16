package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Mtime extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("438999336", AccountType.MDN,Field.Cookie,"api.m.mtime.cn", gen feature ("loginEmail") regex())
	}
}