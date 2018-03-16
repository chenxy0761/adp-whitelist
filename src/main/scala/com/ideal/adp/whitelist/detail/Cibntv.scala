package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Cibntv extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("2068846083", AccountType.IMEI,Field.Url,"mcgi.play.cp81.ott.cibntv.net", gen feature ("device_id") )
    terminalWhitelist("1934847523", AccountType.IMEI,Field.Url,"sdkconfig.play.cp81.ott.cibntv.net", gen feature ("imei") )
	}
}