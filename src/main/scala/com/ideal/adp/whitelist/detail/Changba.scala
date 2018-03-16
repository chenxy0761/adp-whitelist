package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Changba extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1472747618", AccountType.MAC,Field.Url,"vapi.changba.com", gen feature ("macaddress") urlDecode())
    terminalWhitelist("1778834614", AccountType.MAC,Field.Url,"api.changba.com", gen feature ("macaddress") urlDecode())
    terminalWhitelist("-1248960745", AccountType.IMEI,Field.Url,"api.changba.com", gen feature ("imei") )
    terminalWhitelist("-671432574", AccountType.MAC,Field.Url,"timeline.api.changba.com", gen feature ("macaddress") urlDecode())
    terminalWhitelist("-863445950", AccountType.MAC,Field.Url,"gapi.changba.com", gen feature ("macaddress") urlDecode())
	}
}