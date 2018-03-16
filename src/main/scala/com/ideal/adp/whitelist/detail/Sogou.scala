package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Sogou extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("2138702570", AccountType.EMAIL,Field.Url,"api.apt.k.sogou.com", gen feature ("uid") )
    terminalWhitelist("-386857298", AccountType.MDN,Field.Url,"api.apt.k.sogou.com", gen feature ("uid") split("@",0) regex())
    terminalWhitelist("-619530696", AccountType.EMAIL,Field.Url,"k.sogou.com", gen feature ("uid") len(1,42))
    terminalWhitelist("1855428363", AccountType.IMEI,Field.Url,"config.push.sogou.com", gen feature ("udid") )
    terminalWhitelist("780764795", AccountType.MDN,Field.Url,"k.sogou.com", gen feature ("uid") subStringX(0,11) regex())
    terminalWhitelist("-1134617397", AccountType.MDN,Field.Cookie,"k.sogou.com", gen feature ("ppid") )
	}
}