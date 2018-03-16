package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Babytree extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1236130171", AccountType.ANDROIDID,Field.Url,"www.babytree.com", gen feature ("android_id") )
	}
}