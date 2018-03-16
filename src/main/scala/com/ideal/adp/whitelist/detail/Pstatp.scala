package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Pstatp extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-627502590", AccountType.IDFA,Field.Url,"a3.pstatp.com", gen feature ("idfa") )
    terminalWhitelist("-142397798", AccountType.IMEI,Field.Url,"a3.pstatp.com", gen feature ("uuid") )
	}
}