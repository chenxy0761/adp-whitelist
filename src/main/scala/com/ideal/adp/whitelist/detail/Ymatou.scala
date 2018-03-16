package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Ymatou extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1708816829", AccountType.IMEI,Field.Url,"app.ymatou.com", gen feature ("imei") )
    terminalWhitelist("47864300", AccountType.IMEI,Field.Url,"app.ymatou.com", gen feature ("deviceid") )
	}
}