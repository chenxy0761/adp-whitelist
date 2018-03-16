package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Puata extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1714584765", AccountType.MAC,Field.Url,"ex.puata.info", gen feature ("mc") urlDecode())
    terminalWhitelist("-2134197805", AccountType.IMEI,Field.Url,"ex.puata.info", gen feature ("device_id") )
	}
}