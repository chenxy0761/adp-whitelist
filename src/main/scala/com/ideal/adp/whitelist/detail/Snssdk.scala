package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Snssdk extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1023357254", AccountType.IDFA,Field.Url,"is.snssdk.com", gen feature ("idfa") )
    terminalWhitelist("-244973610", AccountType.IMEI,Field.Url,"i.snssdk.com", gen feature ("uuid") )
    terminalWhitelist("7015926", AccountType.IMEI,Field.Url,"temai.snssdk.com", gen feature ("uuid") )
    terminalWhitelist("1810501984", AccountType.IDFA,Field.Url,"isub.snssdk.com", gen feature ("idfa") )
    terminalWhitelist("-1855563760", AccountType.IDFA,Field.Url,"lf.snssdk.com", gen feature ("idfa") notContains("%") len(36,36))
    terminalWhitelist("-1898646810", AccountType.IDFA,Field.Url,"ichannel.snssdk.com", gen feature ("idfa") )
    terminalWhitelist("705981471", AccountType.IMEI,Field.Cookie,"is.snssdk.com", gen feature ("uuid") )
    terminalWhitelist("2085230404", AccountType.MAC,Field.Url,"ic.snssdk.com", gen feature ("mac") urlDecode())
    terminalWhitelist("-1225529354", AccountType.IMEI,Field.Url,"ic.snssdk.com", gen feature ("uuid") )
    terminalWhitelist("46598401", AccountType.IDFA,Field.Url,"ic.snssdk.com", gen feature ("idfa") len(36,36))
    terminalWhitelist("457962079", AccountType.IMEI,Field.Cookie,"i.snssdk.com", gen feature ("uuid") )
    terminalWhitelist("-14197697", AccountType.IMEI,Field.Cookie,"ic.snssdk.com", gen feature ("uuid") )
    terminalWhitelist("-505350186", AccountType.IMEI,Field.Url,"is.snssdk.com", gen feature ("uuid") )
	}
}