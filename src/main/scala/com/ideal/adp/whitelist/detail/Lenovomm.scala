package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Lenovomm extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1531951609", AccountType.IMEI,Field.Url,"susapi.lenovomm.com", gen feature ("DevID") )
    terminalWhitelist("-559299145", AccountType.IMEI,Field.Url,"susapi.lenovomm.com", gen feature ("dauuid") )
    terminalWhitelist("273647129", AccountType.IMEI,Field.Url,"susapi.lenovomm.com", gen feature ("devid") )
    terminalWhitelist("-267794815", AccountType.IMEI,Field.Url,"susapi.lenovomm.com", gen feature ("sm2") )
    terminalWhitelist("180901824", AccountType.IMEI,Field.Url,"susapi.lenovomm.com", gen feature ("sm1") )
	}
}