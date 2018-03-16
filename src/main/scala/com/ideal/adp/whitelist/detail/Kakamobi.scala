package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Kakamobi extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("1010528295", AccountType.ANDROIDID,Field.Url,"ipip.kakamobi.com", gen feature ("_androidId") )
    terminalWhitelist("1128791423", AccountType.MAC,Field.Url,"form.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("1215182363", AccountType.ANDROIDID,Field.Url,"login.wz.kakamobi.com", gen feature ("_androidId") )
    terminalWhitelist("-1285391165", AccountType.IMEI,Field.Url,"cheyouquan.kakamobi.com", gen feature ("_imei") )
    terminalWhitelist("-1303801403", AccountType.ANDROIDID,Field.Url,"busybox.kakamobi.com", gen feature ("_androidId") )
    terminalWhitelist("-1419574211", AccountType.IMEI,Field.Url,"qichezhijia.kakamobi.com", gen feature ("_imei") )
    terminalWhitelist("143462891", AccountType.MAC,Field.Url,"ipip.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("1489647219", AccountType.IMEI,Field.Url,"login.wz.kakamobi.com", gen feature ("_imei") )
    terminalWhitelist("292633122", AccountType.IMEI,Field.Url,"config.kakamobi.com", gen feature ("_imei") )
    terminalWhitelist("1708771357", AccountType.IMEI,Field.Url,"busybox.kakamobi.com", gen feature ("_imei") )
    terminalWhitelist("1735896799", AccountType.MAC,Field.Url,"traffic.wz.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("174168131", AccountType.MAC,Field.Url,"config.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("1787552947", AccountType.ANDROIDID,Field.Url,"traffic.wz.kakamobi.com", gen feature ("_androidId") )
    terminalWhitelist("1982714861", AccountType.MAC,Field.Url,"qichezhijia.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("-2006099851", AccountType.MAC,Field.Url,"query.wz.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("-219805065", AccountType.MAC,Field.Url,"login.wz.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("-230543179", AccountType.IMEI,Field.Url,"query.wz.kakamobi.com", gen feature ("_imei") )
    terminalWhitelist("-239077109", AccountType.IMEI,Field.Url,"traffic.wz.kakamobi.com", gen feature ("_imei") )
    terminalWhitelist("316549365", AccountType.MAC,Field.Url,"update.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("-336991267", AccountType.IMEI,Field.Url,"telepathy.kakamobi.com", gen feature ("_imei") )
    terminalWhitelist("2025834442", AccountType.IMEI,Field.Url,"ipip.kakamobi.com", gen feature ("_imei") )
    terminalWhitelist("-421013524", AccountType.MAC,Field.Url,"update.kakamobi.com", gen feature ("_imei") len(17,17))
    terminalWhitelist("-505008035", AccountType.ANDROIDID,Field.Url,"query.wz.kakamobi.com", gen feature ("_androidId") )
    terminalWhitelist("551724517", AccountType.ANDROIDID,Field.Url,"qichezhijia.kakamobi.com", gen feature ("_androidId") )
    terminalWhitelist("-635067865", AccountType.MAC,Field.Url,"cheyouquan.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("741238891", AccountType.ANDROIDID,Field.Url,"cheyouquan.kakamobi.com", gen feature ("_androidId") )
    terminalWhitelist("-743349235", AccountType.MAC,Field.Url,"busybox.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("783957711", AccountType.ANDROIDID,Field.Url,"config.kakamobi.com", gen feature ("_androidId") )
    terminalWhitelist("-819344307", AccountType.MAC,Field.Url,"telepathy.kakamobi.com", gen feature ("_mac") urlDecode())
    terminalWhitelist("435014356", AccountType.IMEI,Field.Url,"update.kakamobi.com", gen feature ("_imei") )
	}
}