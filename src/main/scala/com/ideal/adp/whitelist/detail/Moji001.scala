package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Moji001 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1754861443", AccountType.MAC,Field.Url,"albs.moji001.com", gen feature ("wifimac") )
    terminalWhitelist("1474834115", AccountType.IMEI,Field.Url,"albs.moji001.com", gen feature ("IMEI") )
	}
}