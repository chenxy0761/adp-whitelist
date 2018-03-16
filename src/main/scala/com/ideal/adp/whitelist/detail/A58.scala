package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A58 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1038987675", AccountType.MDN,Field.Url,"verifycode.58.com", gen feature ("tel_number") regex())
	}
}