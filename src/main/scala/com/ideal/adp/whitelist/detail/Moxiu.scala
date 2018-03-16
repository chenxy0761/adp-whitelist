package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Moxiu extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("2010994783", AccountType.IMEI,Field.Url,"weather.moxiu.net", gen feature ("imei") )
    terminalWhitelist("-1959690212", AccountType.ANDROIDID,Field.Url,"weather.moxiu.net", gen feature ("androidID") )
    terminalWhitelist("-744431440", AccountType.MAC,Field.Url,"weather.moxiu.net", gen feature ("mac") len(17,17))
	}
}