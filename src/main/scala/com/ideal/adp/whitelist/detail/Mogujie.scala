package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Mogujie extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-114888741", AccountType.MAC,Field.Url,"ipservice.mogujie.com", gen feature ("did") contains("mac") add(AddUtilities.lstrip))
    terminalWhitelist("1882532004", AccountType.IMEI,Field.Url,"ipservice.mogujie.com", gen feature ("did") )
	}
}