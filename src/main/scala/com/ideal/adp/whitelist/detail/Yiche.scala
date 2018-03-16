package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Yiche extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("801946442", AccountType.IMEI,Field.Url,"api.ycapp.yiche.com", gen feature ("deviceid") )
    terminalWhitelist("-73565250", AccountType.IMEI,Field.Url,"log.ycapp.yiche.com", gen feature ("deviceId") )
    terminalWhitelist("1495967646", AccountType.IMEI,Field.Url,"log.ycapp.yiche.com", gen feature ("deviceid") )
    terminalWhitelist("890797414", AccountType.ANDROIDID,Field.Url,"log.ycapp.yiche.com", gen feature ("androidId") )
	}
}