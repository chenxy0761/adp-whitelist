package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Adsage extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1986747468", AccountType.MAC,Field.Url,"track.adsage.com", gen feature ("uid") urlDecode() len(17,17))
    terminalWhitelist("-92354615", AccountType.MAC,Field.Cookie,"track.adsage.com", gen feature ("cookie_uid") )
	}
}