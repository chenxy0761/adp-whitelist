package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Biddingx extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-313699197", AccountType.IMEI,Field.Url,"ana.masky.biddingx.com", gen feature ("imei") )
    terminalWhitelist("2100852251", AccountType.IMEI,Field.Url,"cm.masky.biddingx.com", gen feature ("mzid") )
	}
}