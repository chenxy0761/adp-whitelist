package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Camera360 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1091741332", AccountType.IMEI,Field.Url,"dispatcher.camera360.com", gen feature ("deviceId") )
	}
}