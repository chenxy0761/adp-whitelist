package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Lvmama extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-809962639", AccountType.IMEI,Field.Url,"api3g2.lvmama.com", gen feature ("udid") )
    terminalWhitelist("-1389283148", AccountType.IMEI,Field.Url,"api3g2.lvmama.com", gen feature ("deviceToken") )
    terminalWhitelist("2013583120", AccountType.IDFA,Field.Url,"api3g2.lvmama.com", gen feature ("lvidfa") )
	}
}