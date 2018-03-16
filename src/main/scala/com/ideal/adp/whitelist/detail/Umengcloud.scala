package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Umengcloud extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("400498027", AccountType.MAC,Field.Url,"utop.umengcloud.com", gen feature ("data") urlDecode() jsonToMap() find("c4"))
    terminalWhitelist("490951498", AccountType.IMEI,Field.Url,"utop.umengcloud.com", gen feature ("imei") add(AddUtilities.lstrip) )
	}
}