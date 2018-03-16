package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Mmstat extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("275370061", AccountType.IMEI,Field.Url,"gxb.mmstat.com", gen feature ("dim") )
    terminalWhitelist("2144698714", AccountType.IDFA,Field.Url,"gm.mmstat.com", gen feature ("idfa") )
    terminalWhitelist("-705614322", AccountType.MDN,Field.Url,"gm.mmstat.com", gen feature ("nick") )
	}
}