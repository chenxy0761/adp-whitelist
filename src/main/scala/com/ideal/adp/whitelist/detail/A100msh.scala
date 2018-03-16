package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A100msh extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-539256178", AccountType.MAC,Field.Url,"w21.100msh.com", gen feature ("mac") )
	}
}