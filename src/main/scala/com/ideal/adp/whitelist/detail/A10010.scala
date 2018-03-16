package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A10010 extends LogicGenerable { 
  override def load(): Unit = { 
    terminalWhitelist("-1712072718", AccountType.MDN,Field.Cookie,"m.client.10010.com", gen feature ("u_account") regex())
    terminalWhitelist("-1843282568", AccountType.MDN,Field.Cookie,"m.client.10010.com", gen feature ("c_mobile") )
    terminalWhitelist("-1404590129", AccountType.MDN,Field.Url,"m.10010.com", gen feature ("desmobile") )
	}
}