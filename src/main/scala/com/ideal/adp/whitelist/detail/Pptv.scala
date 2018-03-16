package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Pptv extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("551845892", AccountType.MDN,Field.Url,"de.as.pptv.com", gen feature ("username") regex())
    terminalWhitelist("1947137899", AccountType.MDN,Field.Url,"cldctrl.mobile.pptv.com", gen feature ("passport") )
    terminalWhitelist("-30093613", AccountType.MDN,Field.Url,"play.api.pptv.com", gen feature ("username") )
    terminalWhitelist("-514698325", AccountType.MDN,Field.Cookie,"apicdn.refinfo.sc.pptv.com", gen feature ("PPName") )
    terminalWhitelist("-314832693", AccountType.MDN,Field.Cookie,"apicdn.sc.pptv.com", gen feature ("PPName") )
    terminalWhitelist("1037896587", AccountType.MDN,Field.Cookie,"api.ddp.vip.pptv.com", gen feature ("PPName") )
    terminalWhitelist("1031108875", AccountType.MDN,Field.Cookie,"cldctrl.mobile.pptv.com", gen feature ("PPName") )
    terminalWhitelist("-81904437", AccountType.MDN,Field.Cookie,"de.as.pptv.com", gen feature ("PPName") )
    terminalWhitelist("-1699686835", AccountType.MDN,Field.Cookie,"e.mobile.pptv.com", gen feature ("PPName") )
    terminalWhitelist("14215083", AccountType.MDN,Field.Cookie,"epg.api.pptv.com", gen feature ("PPName") )
    terminalWhitelist("-1790624917", AccountType.MDN,Field.Cookie,"jp.as.pptv.com", gen feature ("PPName") )
    terminalWhitelist("-1080755645", AccountType.MDN,Field.Cookie,"mtbu.api.pptv.com", gen feature ("PPName") )
    terminalWhitelist("1292443659", AccountType.MDN,Field.Cookie,"panoimage.pptv.com", gen feature ("PPName") )
    terminalWhitelist("-12095189", AccountType.MDN,Field.Cookie,"recommend.pptv.com", gen feature ("PPName") )
    terminalWhitelist("60115307", AccountType.MDN,Field.Cookie,"searchapi.pptv.com", gen feature ("PPName") )
    terminalWhitelist("28357515", AccountType.MDN,Field.Cookie,"sports.mobile.pptv.com", gen feature ("PPName") )
    terminalWhitelist("141786347", AccountType.MDN,Field.Cookie,"v.pptv.com", gen feature ("PPName") )
    terminalWhitelist("-1593128181", AccountType.MDN,Field.Cookie,"way.pptv.com", gen feature ("PPName") )
	}
}