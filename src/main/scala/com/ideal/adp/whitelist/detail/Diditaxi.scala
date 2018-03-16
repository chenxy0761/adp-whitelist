package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Diditaxi extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1156247630", AccountType.MAC,Field.Url,"conf.diditaxi.com.cn", gen feature ("mac") )
    terminalWhitelist("1268746412", AccountType.MDN,Field.Url,"imall.diditaxi.com.cn", gen feature ("phone") regex())
    terminalWhitelist("-1271221085", AccountType.ANDROIDID,Field.Url,"api.diditaxi.com.cn", gen feature ("android_id") )
    terminalWhitelist("-1415891068", AccountType.MDN,Field.Url,"conf.diditaxi.com.cn", gen feature ("phone") regex())
    terminalWhitelist("1532018278", AccountType.MDN,Field.Url,"api.diditaxi.com.cn", gen feature ("phone") regex())
    terminalWhitelist("1577190373", AccountType.ANDROIDID,Field.Url,"common.diditaxi.com.cn", gen feature ("android_id") )
    terminalWhitelist("1651041902", AccountType.MAC,Field.Url,"common.diditaxi.com.cn", gen feature ("mac") )
    terminalWhitelist("-182559100", AccountType.MDN,Field.Url,"static.diditaxi.com.cn", gen feature ("phone") regex())
    terminalWhitelist("-1881989153", AccountType.MDN,Field.Url,"api.diditaxi.com.cn", gen feature ("usr") )
    terminalWhitelist("-2006451740", AccountType.MDN,Field.Url,"common.diditaxi.com.cn", gen feature ("phone") regex())
    terminalWhitelist("-282350024", AccountType.IMEI,Field.Url,"common.diditaxi.com.cn", gen feature ("imei")  regex())
    terminalWhitelist("-237044608", AccountType.MDN,Field.Url,"api.diditaxi.com.cn", gen feature ("d_phone") )
    terminalWhitelist("26332102", AccountType.MAC,Field.Url,"api.diditaxi.com.cn", gen feature ("mac") urlDecode())
    terminalWhitelist("-357308540", AccountType.MAC,Field.Url,"common.diditaxi.com.cn", gen feature ("mac") urlDecode())
    terminalWhitelist("-577991354", AccountType.IMEI,Field.Url,"notice.diditaxi.com.cn", gen feature ("imei") )
    terminalWhitelist("669100677", AccountType.ANDROIDID,Field.Url,"notice.diditaxi.com.cn", gen feature ("android_id") )
    terminalWhitelist("742952206", AccountType.MAC,Field.Url,"notice.diditaxi.com.cn", gen feature ("mac") )
    terminalWhitelist("-1298995590", AccountType.IMEI,Field.Url,"api.diditaxi.com.cn", gen feature ("imei")  regex())
    terminalWhitelist("792362663", AccountType.MDN,Field.Url,"notice.diditaxi.com.cn", gen feature ("phone") )
    terminalWhitelist("-1803644241", AccountType.MDN,Field.Url,"api.diditaxi.com.cn", gen feature ("searchid") add(AddUtilities.substr12))
	}
}