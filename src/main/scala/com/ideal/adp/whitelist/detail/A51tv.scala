package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A51tv extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("5527596", AccountType.IMEI,Field.Url,"w.51tv.com", gen feature ("deviceId") )
    terminalWhitelist("-396805381", AccountType.MAC,Field.Url,"w.51tv.com", gen feature ("usercode") len(17,17))
    terminalWhitelist("998161420", AccountType.IMEI,Field.Url,"w.51tv.com", gen feature ("deviceid") )
    terminalWhitelist("-856984512", AccountType.MAC,Field.Url,"w.51tv.com", gen feature ("mac") notContains("@") len(17,17))
    terminalWhitelist("951548829", AccountType.MAC,Field.Url,"w.51tv.com", gen feature ("username") len(17,17))
	}
}