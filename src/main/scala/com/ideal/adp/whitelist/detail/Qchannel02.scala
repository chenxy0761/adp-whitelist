package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Qchannel02 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1271502958", AccountType.IMEI,Field.Url,"www.qchannel02.cn", gen feature ("did") )
	}
}