package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Umtrack extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("975266590", AccountType.MAC,Field.Url,"log.umtrack.com", gen feature ("mac") urlDecode() len(1,16))
	}
}