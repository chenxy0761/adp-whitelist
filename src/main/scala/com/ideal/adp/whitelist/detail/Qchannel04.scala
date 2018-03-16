package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Qchannel04 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1194747754", AccountType.IMEI,Field.Url,"www.qchannel04.cn", gen feature ("did") )
	}
}