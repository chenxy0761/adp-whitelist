package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Ifeng extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1277515953", AccountType.MDN,Field.Cookie,"api.3g.ifeng.com", gen feature ("IF_USER") )
    terminalWhitelist("1705243927", AccountType.MDN,Field.Cookie,"api.newad.ifeng.com", gen feature ("IF_USER") )
    terminalWhitelist("1113182195", AccountType.MDN,Field.Cookie,"games.ifeng.com", gen feature ("IF_USER") )
    terminalWhitelist("-1799756881", AccountType.MDN,Field.Cookie,"iis1.deliver.ifeng.com", gen feature ("IF_USER") )
    terminalWhitelist("1451651951", AccountType.MDN,Field.Cookie,"news.ifeng.com", gen feature ("IF_USER") )
    terminalWhitelist("-1690076145", AccountType.MDN,Field.Cookie,"stadig.ifeng.com", gen feature ("IF_USER") )
    terminalWhitelist("-573373457", AccountType.MDN,Field.Cookie,"vcis.ifeng.com", gen feature ("IF_USER") )
    terminalWhitelist("-880515639", AccountType.MDN,Field.Cookie,"v.ifeng.com", gen feature ("IF_USER") )
	}
}