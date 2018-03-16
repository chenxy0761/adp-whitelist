package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Tudou extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1673794554", AccountType.IDFA,Field.Url,"api.3g.tudou.com", gen feature ("idfa") )
    terminalWhitelist("-1768407709", AccountType.IMEI,Field.Url,"api.3g.tudou.com", gen feature ("imei") )
    terminalWhitelist("-1971935346", AccountType.MAC,Field.Url,"api.3g.tudou.com", gen feature ("mac") )
    terminalWhitelist("-2054735024", AccountType.MDN,Field.Url,"api.3g.tudou.com", gen feature ("mobile") regex())
    terminalWhitelist("-322598398", AccountType.IDFA,Field.Url,"dm.api.3g.tudou.com", gen feature ("idfa") )
    terminalWhitelist("1321847859", AccountType.IMEI,Field.Url,"ad.api.3g.tudou.com", gen feature ("imei") )
    terminalWhitelist("-461368522", AccountType.IDFA,Field.Url,"ad.api.3g.tudou.com", gen feature ("idfa") )
    terminalWhitelist("-747696332", AccountType.MAC,Field.Url,"ad.api.3g.tudou.com", gen feature ("mac") urlDecode())
	}
}