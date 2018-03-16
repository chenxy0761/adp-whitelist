package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Toutiao extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1903898250", AccountType.IMEI,Field.Url,"dm.toutiao.com", gen feature ("uuid") )
    terminalWhitelist("172148621", AccountType.IMEI,Field.Cookie,"toutiao.com", gen feature ("uuid") )
    terminalWhitelist("-1012939068", AccountType.IMEI,Field.Url,"toutiao.com", gen feature ("uuid") )
	}
}