package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Appvipshop extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1546756945", AccountType.MDN,Field.Url,"mapi.appvipshop.com", gen feature ("user_name") regex())
    terminalWhitelist("1569140894", AccountType.MDN,Field.Url,"mapi.appvipshop.com", gen feature ("username") regex())
    terminalWhitelist("-1829817154", AccountType.MAC,Field.Url,"mapi.appvipshop.com", gen feature ("mac") urlDecode())
    terminalWhitelist("2102249975", AccountType.IMEI,Field.Url,"sc.appvipshop.com", gen feature ("imei") )
    terminalWhitelist("562992040", AccountType.MDN,Field.Url,"sc.appvipshop.com", gen feature ("userid") regex())
    terminalWhitelist("-574996935", AccountType.MDN,Field.Url,"mapi.appvipshop.com", gen feature ("login_id") regex())
	}
}