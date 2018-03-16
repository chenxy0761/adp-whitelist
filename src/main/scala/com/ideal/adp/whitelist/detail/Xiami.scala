package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Xiami extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("77385451", AccountType.IMEI,Field.Url,"spark.api.xiami.com", gen feature ("device_id") )
    terminalWhitelist("402731531", AccountType.IDFA,Field.Url,"spark.api.xiami.com", gen feature ("device_id") len(36,36))
	}
}