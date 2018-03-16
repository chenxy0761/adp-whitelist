package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Youdao extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-523759219", AccountType.IMEI,Field.Url,"impservice.dictapp.youdao.com", gen feature ("imei") )
    terminalWhitelist("-205643585", AccountType.IMEI,Field.Url,"impservice.dictapp.youdao.com", gen feature ("uid") )
    terminalWhitelist("-1882564102", AccountType.EMAIL,Field.Cookie,"dict.youdao.com", gen feature ("DICT_SESS") split("\\|",3))
    terminalWhitelist("1938730550", AccountType.EMAIL,Field.Cookie,"impservice.dictapp.youdao.com", gen feature ("DICT_SESS") split("\\|",4) contains("@"))
    terminalWhitelist("226794801", AccountType.EMAIL,Field.Url,"dict.youdao.com", gen feature ("userid") urlDecode() contains("@"))
    terminalWhitelist("1878707245", AccountType.IMEI,Field.Url,"dict.youdao.com", gen feature ("imei") )
    terminalWhitelist("-718407857", AccountType.EMAIL,Field.Cookie,"dsp.youdao.com", gen feature ("P_INFO") split("\\|",0))
    terminalWhitelist("-858514788", AccountType.IDFA,Field.Url,"impservice.dictapp.youdao.com", gen feature ("idfa") )
    terminalWhitelist("-719404999", AccountType.MDN,Field.Url,"impservice.mail.youdao.com", gen feature ("email") )
    terminalWhitelist("-795304581", AccountType.MDN,Field.Url,"impservice.mail.youdao.com", gen feature ("p2") )
	}
}