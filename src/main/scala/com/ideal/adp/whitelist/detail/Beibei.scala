package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Beibei extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1681549253", AccountType.MAC,Field.Url,"sapi.beibei.com", gen feature ("usermac") urlDecode())
    terminalWhitelist("-659080228", AccountType.MAC,Field.Url,"sapi.beibei.com", gen feature ("u_mac") urlDecode())
	}
}