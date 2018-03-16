package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Miaozhen extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1012928975", AccountType.MAC,Field.Url,"fun.m.cn.miaozhen.com", gen feature ("m7") )
    terminalWhitelist("1402732098", AccountType.IMEI,Field.Url,"tyaqy.m.cn.miaozhen.com", gen feature ("m3") )
    terminalWhitelist("-1919419316", AccountType.IMEI,Field.Url,"fun.m.cn.miaozhen.com", gen feature ("m3") )
    terminalWhitelist("-1920492987", AccountType.MAC,Field.Url,"tyaqy.m.cn.miaozhen.com", gen feature ("m7") )
    terminalWhitelist("1602311249", AccountType.IMEI,Field.Url,"g.cn.miaozhen.com", gen feature ("imei") )
    terminalWhitelist("1297718528", AccountType.IMEI,Field.Url,"g.cn.miaozhen.com", gen feature ("cUDID") )
    terminalWhitelist("-389128425", AccountType.ANDROIDID,Field.Url,"g.cn.miaozhen.com", gen feature ("android_id") )
    terminalWhitelist("-690649874", AccountType.ANDROIDID,Field.Url,"e.cn.miaozhen.com", gen feature ("androidid") )
    terminalWhitelist("-99443971", AccountType.MAC,Field.Url,"g.cn.miaozhen.com", gen feature ("m7") )
	}
}