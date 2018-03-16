package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Alicdn extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1222115737", AccountType.MAC,Field.Url,"g.alicdn.com", gen feature ("usermac") urlDecode())
    terminalWhitelist("397002361", AccountType.MAC,Field.Url,"g.alicdn.com", gen feature ("clientMac") urlDecode())
    terminalWhitelist("-895853795", AccountType.MAC,Field.Url,"g.alicdn.com", gen feature ("gw_mac") urlDecode())
	}
}