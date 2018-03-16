package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Mediav extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1120916064", AccountType.MAC,Field.Url,"show.m.mediav.com", gen feature ("mac") urlDecode())
    terminalWhitelist("125948682", AccountType.IMEI,Field.Url,"show.m.mediav.com", gen feature ("imei") )
    terminalWhitelist("1567161820", AccountType.ANDROIDID,Field.Url,"show.m.mediav.com", gen feature ("androidid") )
	}
}