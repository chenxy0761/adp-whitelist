package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A10086 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1277201935", AccountType.MDN,Field.Url,"www.sh.10086.cn", gen feature ("WT.mobile") regex())
    terminalWhitelist("1839080344", AccountType.MDN,Field.Url,"www.sh.10086.cn", gen feature ("telno") regex())
    terminalWhitelist("20870953", AccountType.MDN,Field.Cookie,"www.sh.10086.cn", gen feature ("loginName") regex())
    terminalWhitelist("324813097", AccountType.MDN,Field.Url,"sdc.10086.cn", gen feature ("WT.mobile") regex())
    terminalWhitelist("386059637", AccountType.MDN,Field.Cookie,"www.sh.10086.cn", gen feature ("MEMBER_ID") regex())
    terminalWhitelist("2139011979", AccountType.MDN,Field.Url,"wx.10086.cn", gen feature ("userName") )
    terminalWhitelist("-1372593658", AccountType.MDN,Field.Cookie,"www.sh.10086.cn", gen feature ("CmWebtokenid") )
	}
}