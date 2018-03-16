package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Dianhua extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("885251771", AccountType.IMEI,Field.Url,"apis.dianhua.cn", gen feature ("uid") )
    terminalWhitelist("244102856", AccountType.MDN,Field.Url,"apis.dianhua.cn", gen feature ("tel") add(AddUtilities.lstrip) regex())
	}
}