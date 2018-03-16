package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Go2yd extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1525206017", AccountType.MAC,Field.Url,"a1.go2yd.com", gen feature ("new_token") subStringX(4,12))
    terminalWhitelist("1970639009", AccountType.IMEI,Field.Url,"a1.go2yd.com", gen feature ("new_token") add(AddUtilities.substr16))
    terminalWhitelist("1992204608", AccountType.MAC,Field.Url,"a1.go2yd.com", gen feature ("deviceid") subStringX(4,12))
	}
}