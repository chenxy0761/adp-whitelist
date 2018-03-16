package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A51y5 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("474368512", AccountType.MAC,Field.Url,"wifiapi02.51y5.net", gen feature ("bssid") )
	}
}