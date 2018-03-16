package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Myzaker extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1016674735", AccountType.IDFA,Field.Url,"sns.myzaker.com", gen feature ("_idfa") )
    terminalWhitelist("1769471694", AccountType.IMEI,Field.Url,"stat.myzaker.com", gen feature ("_udid") )
    terminalWhitelist("1502222851", AccountType.MAC,Field.Url,"adm.myzaker.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("573379286", AccountType.IMEI,Field.Url,"ggs.myzaker.com", gen feature ("_udid") )
    terminalWhitelist("1967386244", AccountType.IMEI,Field.Url,"adm.myzaker.com", gen feature ("_udid") )
    terminalWhitelist("1267225966", AccountType.IMEI,Field.Url,"bgstat.myzaker.com", gen feature ("_udid") )
    terminalWhitelist("-1265689824", AccountType.IMEI,Field.Url,"sns.myzaker.com", gen feature ("_udid") )
    terminalWhitelist("2022371822", AccountType.IMEI,Field.Url,"iphone.myzaker.com", gen feature ("_udid") )
    terminalWhitelist("705325515", AccountType.IDFA,Field.Url,"adm.myzaker.com", gen feature ("_idfa") )
	}
}