package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Cootekservice extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1028700173", AccountType.MDN,Field.Url,"ws2.cootekservice.com", gen feature ("other_phone") add(AddUtilities.lstrip) regex())
    terminalWhitelist("-1541980900", AccountType.MDN,Field.Url,"ws2.cootekservice.com", gen feature ("contactname") regex())
	}
}