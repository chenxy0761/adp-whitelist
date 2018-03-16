package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Mgtv extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("874743850", AccountType.MDN,Field.Cookie,"3img.mgtv.com", gen feature ("loginAccount") )
    terminalWhitelist("114448680", AccountType.MDN,Field.Cookie,"4img.mgtv.com", gen feature ("loginAccount") )
    terminalWhitelist("1814835612", AccountType.MDN,Field.Cookie,"guid.mgtv.com", gen feature ("loginAccount") )
    terminalWhitelist("1133166482", AccountType.MDN,Field.Cookie,"i.mgtv.com", gen feature ("loginAccount") )
    terminalWhitelist("-724187512", AccountType.MDN,Field.Cookie,"pc.api.mgtv.com", gen feature ("loginAccount") )
    terminalWhitelist("-1480171814", AccountType.MDN,Field.Cookie,"pcweb.v1.mgtv.com", gen feature ("loginAccount") )
    terminalWhitelist("510511202", AccountType.MDN,Field.Cookie,"win.v0.mgtv.com", gen feature ("loginAccount") )
    terminalWhitelist("-410021230", AccountType.MDN,Field.Cookie,"www.mgtv.com", gen feature ("loginAccount") )
    terminalWhitelist("-153342354", AccountType.MDN,Field.Url,"rc.mgtv.com", gen feature ("guid") )
	}
}