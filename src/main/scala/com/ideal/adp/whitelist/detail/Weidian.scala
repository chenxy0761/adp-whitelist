package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Weidian extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1253659946", AccountType.MDN,Field.Cookie,"weidian.com", gen feature ("WD_b_tele") regex())
	}
}