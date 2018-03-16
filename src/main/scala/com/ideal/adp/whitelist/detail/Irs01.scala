package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Irs01 extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1088256414", AccountType.ANDROIDID,Field.Url,"irs01.com", gen feature ("androidid") notContains("%"))
    terminalWhitelist("-269942537", AccountType.IMEI,Field.Url,"irs01.com", gen feature ("cupid_id") notContains("%") )
    terminalWhitelist("1818763349", AccountType.IMEI,Field.Url,"irs01.com", gen feature ("aqyid") split("_",0) notContains("%") )
    terminalWhitelist("1386775664", AccountType.IDFA,Field.Url,"qq.irs01.com", gen feature ("idfa") notContains("%") len(36,36))
    terminalWhitelist("-1428352528", AccountType.MAC,Field.Url,"irs01.com", gen feature ("mac1") urlDecode() len(17,17))
    terminalWhitelist("159237582", AccountType.MAC,Field.Url,"qq.irs01.com", gen feature ("mac") )
    terminalWhitelist("-130972876", AccountType.IMEI,Field.Url,"qq.irs01.com", gen feature ("imei") notContains("%") )
    terminalWhitelist("-181050644", AccountType.ANDROIDID,Field.Url,"irs01.com?hvt", gen feature ("androidid") notContains("%"))
    terminalWhitelist("-1813271916", AccountType.ANDROIDID,Field.Url,"qq.irs01.com", gen feature ("androidid") notContains("%"))
    terminalWhitelist("1760199626", AccountType.IMEI,Field.Url,"irs01.com", gen feature ("cupid_uid") notContains("%") )
    terminalWhitelist("12463422", AccountType.IMEI,Field.Url,"irs01.com", gen feature ("imei") notContains("%") )
    terminalWhitelist("-47289004", AccountType.ANDROIDID,Field.Url,"irs01.com", gen feature ("aqyid") split("_",1) len(13,16))
    terminalWhitelist("-512831429", AccountType.MAC,Field.Url,"irs01.com", gen feature ("mac") notContains("%") len(12,12))
    terminalWhitelist("-565426622", AccountType.MDN,Field.Url,"irs01.com", gen feature ("dn") regex())
    terminalWhitelist("-700361178", AccountType.IDFA,Field.Url,"irs01.com", gen feature ("idfa") notContains("%") len(36,36))
	}
}