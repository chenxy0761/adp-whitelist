package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Weibo extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1284137956", AccountType.MDN,Field.Cookie,"www.weibo.com", gen feature ("un") regex())
    terminalWhitelist("1291777227", AccountType.MDN,Field.Url,"weibo.com", gen feature ("value") regex())
    terminalWhitelist("132002862", AccountType.EMAIL,Field.Cookie,"widget.weibo.com", gen feature ("un") contains("@"))
    terminalWhitelist("-214527918", AccountType.MDN,Field.Cookie,"weibo.com", gen feature ("un") regex())
    terminalWhitelist("543634382", AccountType.EMAIL,Field.Cookie,"s.alitui.weibo.com", gen feature ("un") contains("@"))
    terminalWhitelist("-575073398", AccountType.EMAIL,Field.Cookie,"weibo.com", gen feature ("un") contains("@"))
    terminalWhitelist("87382712", AccountType.EMAIL,Field.Cookie,"www.weibo.com", gen feature ("un") contains("@"))
    terminalWhitelist("-930555666", AccountType.MDN,Field.Cookie,"widget.weibo.com", gen feature ("un") regex())
    terminalWhitelist("-99049507", AccountType.MDN,Field.Cookie,"s.alitui.weibo.com", gen feature ("un") )
	}
}