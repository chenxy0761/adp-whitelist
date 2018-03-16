package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Hiapk extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1268159193", AccountType.MAC,Field.Url,"market.hiapk.com", gen feature ("userMac") urlDecode())
    terminalWhitelist("-551062283", AccountType.MAC,Field.Url,"market.hiapk.com", gen feature ("apMac") urlDecode())
    terminalWhitelist("-706183474", AccountType.MAC,Field.Url,"market.hiapk.com", gen feature ("mac") )
	}
}