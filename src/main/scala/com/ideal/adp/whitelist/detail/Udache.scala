package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Udache extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1026459068", AccountType.MAC,Field.Url,"api.udache.com", gen feature ("mac") urlDecode())
    terminalWhitelist("-1375659356", AccountType.MDN,Field.Url,"api.udache.com", gen feature ("phone") regex())
    terminalWhitelist("1898650008", AccountType.IMEI,Field.Url,"api.udache.com", gen feature ("imei") add(AddUtilities.lstrip) )
    terminalWhitelist("-658053339", AccountType.ANDROIDID,Field.Url,"api.udache.com", gen feature ("android_id") )
    terminalWhitelist("972151968", AccountType.MDN,Field.Url,"api.udache.com", gen feature ("phone_num") )
	}
}