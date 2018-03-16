package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class A10jqka extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1093952276", AccountType.MDN,Field.Url,"eq.10jqka.com.cn", gen feature ("userid") regex())
    terminalWhitelist("-511968938", AccountType.IMEI,Field.Url,"stat.10jqka.com.cn", gen feature ("uuid") )
    terminalWhitelist("-1357591286", AccountType.MDN,Field.Cookie,"stat.10jqka.com.cn", gen feature ("u_name") regex())
    terminalWhitelist("1512127369", AccountType.MDN,Field.Cookie,"stat.10jqka.com.cn", gen feature ("escapename") regex() regex())
    terminalWhitelist("161176010", AccountType.MDN,Field.Cookie,"eq.10jqka.com.cn", gen feature ("u_name") regex())
    terminalWhitelist("-1717643709", AccountType.MDN,Field.Url,"eq.10jqka.com.cn", gen feature ("account") regex())
    terminalWhitelist("-2101279807", AccountType.MDN,Field.Cookie,"eq.10jqka.com.cn", gen feature ("escapename") regex())
	}
}