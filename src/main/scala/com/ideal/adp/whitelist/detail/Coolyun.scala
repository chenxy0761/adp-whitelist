package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Coolyun extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1164140523", AccountType.IMEI,Field.Url,"tj.coolyun.com", gen feature ("uid") )
    terminalWhitelist("225070219", AccountType.MAC,Field.Url,"tj.coolyun.com", gen feature ("uid") len(17,17))
    terminalWhitelist("-819573405", AccountType.IMEI,Field.Url,"tj.coolyun.com", gen feature ("imei") )
	}
}