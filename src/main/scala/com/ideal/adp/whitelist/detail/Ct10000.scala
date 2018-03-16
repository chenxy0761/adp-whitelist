package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Ct10000 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1606068821", AccountType.IMEI,Field.Url,"wlan.ct10000.com", gen feature ("aqyid") split("_",0) notContains("%") )
    terminalWhitelist("-228043435", AccountType.MAC,Field.Url,"wlan.ct10000.com", gen feature ("mac") urlDecode() len(17,17))
    terminalWhitelist("238772522", AccountType.ANDROIDID,Field.Url,"wlan.ct10000.com", gen feature ("aqyid") split("_",1) len(13,16))
    terminalWhitelist("-777363255", AccountType.IMEI,Field.Url,"wlan.ct10000.com", gen feature ("device_id") )
	}
}