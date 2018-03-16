package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Shanzhen extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1888088639", AccountType.MDN,Field.Url,"m.shanzhen.me", gen feature ("phone") )
	}
}