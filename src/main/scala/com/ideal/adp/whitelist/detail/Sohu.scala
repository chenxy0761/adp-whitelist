package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Sohu extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("301528740", AccountType.MDN,Field.Url,"mb.hd.sohu.com.cn", gen feature ("passport") urlDecode() subStringX(0,11) regex())
    terminalWhitelist("645534265", AccountType.EMAIL,Field.Url,"mb.hd.sohu.com.cn", gen feature ("passport") urlDecode() contains("@"))
    terminalWhitelist("-1340233178", AccountType.IMEI,Field.Url,"mb.hd.sohu.com.cn", gen feature ("pid") )
	}
}