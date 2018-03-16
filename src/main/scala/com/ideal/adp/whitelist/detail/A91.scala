package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A91 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-114359168", AccountType.IDFA,Field.Url,"tq.91.com", gen feature ("idfa") )
    terminalWhitelist("1632629522", AccountType.ANDROIDID,Field.Url,"tq.91.com", gen feature ("androidid") )
    terminalWhitelist("297247785", AccountType.IMEI,Field.Url,"tq.91.com", gen feature ("imei") )
	}
}