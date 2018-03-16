package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Xiaojukeji extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1345609291", AccountType.MDN,Field.Url,"as.xiaojukeji.com", gen feature ("phone") )
    terminalWhitelist("-1371403865", AccountType.MDN,Field.Url,"pay.xiaojukeji.com", gen feature ("phone") )
    terminalWhitelist("-1639403737", AccountType.MDN,Field.Url,"poi.map.xiaojukeji.com", gen feature ("phone") )
    terminalWhitelist("-646368607", AccountType.MDN,Field.Url,"mp.xiaojukeji.com", gen feature ("src") )
	}
}