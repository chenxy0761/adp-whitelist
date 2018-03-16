package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Qq extends LogicGenerable {
    override def load(): Unit = {
        // 自站点
        val urls = Array("qq.com", "qpic.cn", "qlogo.cn", "qzone.com", "gtimg.cn", "qzoneapp.com",
        "pengyou.com", "weiyun.com", "soso.com", "twsapp.com", "tenpay.com", "imqq.com",
        "qqopenapp.com", "qcloud.com", "myqcloud.com")
        networkWhitelist("id5", urls, gen feature("o_cookie") replace("%20", "") replace(" ", "") split("@", 0))
        networkWhitelist("id20", urls, gens feature(Array("uin", "pt2gguin", "ptui_loginuin", "p_uin")) replace("%20", "") replace(" ", "") split("@", 0))
        networkWhitelist("id21", urls, gen feature("qm_username") replace("%20", "") replace(" ", "") split("@", 0))
        networkWhitelist("id40", urls, gen feature("skey"))
        networkWhitelist("id41", urls, gen feature("qm_sid"))
        networkWhitelist("id42", urls, gen feature("vkey"))
        networkWhitelist("id43", urls, gen feature("qqmail_alias") split(";", 0))

        // 其它站点
        val urls2 = Array("3366.com", "paipai.com", "yixun.com", "51buy.com", "sogou.com", "myapp.com", "kuyoo.com")
        networkWhitelist("id5", urls2, gen feature("o_cookie") replace("%20", "") replace(" ", "") split("@", 0))
        networkWhitelist("id20", urls2, gens feature(Array("pt2gguin", "ptui_loginuin")) replace("%20", "") replace(" ", "") split("@", 0))
        networkWhitelist("id43", urls2, gen feature("qqmail_alias") split(";", 0))

        terminalWhitelist("-1249734795", AccountType.IMEI,Field.Url,"w.inews.qq.com", gen feature ("devid") )
    terminalWhitelist("1057529556", AccountType.IMEI,Field.Url,"r.cnews.qq.com", gen feature ("devid") )
    terminalWhitelist("1103660724", AccountType.MAC,Field.Url,"mcgi.v.qq.com", gen feature ("mac") urlDecode())
    terminalWhitelist("320606348", AccountType.IMEI,Field.Cookie,"c.isdspeed.qq.com", gen feature ("imei") )
    terminalWhitelist("1107009462", AccountType.IDFA,Field.Url,"mcgi.v.qq.com", gen feature ("idfa") )
    terminalWhitelist("-86137688", AccountType.IMEI,Field.Url,"xwapp.auto.qq.com", gen feature ("devid") add(AddUtilities.lstrip) )
    terminalWhitelist("-1160544028", AccountType.ANDROIDID,Field.Url,"upmobile.v.qq.com", gen feature ("device_id") notContains("%") len(16,16))
    terminalWhitelist("-1268691409", AccountType.IDFA,Field.Url,"logic.content.qq.com", gen feature ("imei") len(36,36))
    terminalWhitelist("562294094", AccountType.IMEI,Field.Url,"qq.com", gen feature ("imei") notContains("%") len(14,15) )
    terminalWhitelist("1316287761", AccountType.ANDROIDID,Field.Url,"appsupport.qq.com", gen feature ("android_id") )
    terminalWhitelist("2076917955", AccountType.IMEI,Field.Url,"bksdkconfig.video.qq.com", gen feature ("imei") )
    terminalWhitelist("1414828537", AccountType.IMEI,Field.Url,"w.inews.qq.com", gen feature ("mideviceid") split("_",0) )
    terminalWhitelist("1544314041", AccountType.MAC,Field.Url,"like.video.qq.com", gen feature ("mta") len(17,17))
    terminalWhitelist("-1560289852", AccountType.MAC,Field.Url,"bksdkconfig.video.qq.com", gen feature ("mac") urlDecode())
    terminalWhitelist("-1780140820", AccountType.IMEI,Field.Url,"wise.qq.com", gen feature ("devid") )
    terminalWhitelist("1342581396", AccountType.IMEI,Field.Url,"qq.com", gen feature ("device_id") notContains("%") len(14,15) )
    terminalWhitelist("1297744239", AccountType.IMEI,Field.Url,"mapvectors.map.qq.com", gen feature ("imei") )
    terminalWhitelist("1735650083", AccountType.IMEI,Field.Url,"logic.content.qq.com", gen feature ("imei") )
    terminalWhitelist("-2057743644", AccountType.MAC,Field.Url,"sdkconfig.video.qq.com", gen feature ("mac") urlDecode())
    terminalWhitelist("-1897254023", AccountType.IMEI,Field.Url,"mcgi.v.qq.com", gen feature ("device_id") )
    terminalWhitelist("235032069", AccountType.ANDROIDID,Field.Url,"w.inews.qq.com", gen feature ("android_id") )
    terminalWhitelist("-235873628", AccountType.MAC,Field.Url,"w.cnews.qq.com", gen feature ("mac") urlDecode())
    terminalWhitelist("-57320989", AccountType.IMEI,Field.Url,"sdkconfig.video.qq.com", gen feature ("imei") )
    terminalWhitelist("273248612", AccountType.MAC,Field.Url,"v.gdt.qq.com", gen feature ("mac") urlDecode())
    terminalWhitelist("-307516463", AccountType.EMAIL,Field.Cookie,"i.mail.qq.com", gen feature ("qqmail_alias") )
    terminalWhitelist("-370569394", AccountType.ANDROIDID,Field.Url,"btrace.qq.com", gen feature ("androidid") )
    terminalWhitelist("-444703380", AccountType.MAC,Field.Url,"wise.qq.com", gen feature ("mac") urlDecode())
    terminalWhitelist("-1609727956", AccountType.IMEI,Field.Url,"w.inews.qq.com", gen feature ("hwdeviceid") split("_",0) )
    terminalWhitelist("-1248571552", AccountType.IMEI,Field.Url,"qq.com", gen feature ("devid") notContains("%") len(14,15) )
    terminalWhitelist("1442676221", AccountType.IMEI,Field.Url,"commdata.v.qq.com", gen feature ("device_id") )
    terminalWhitelist("-525195690", AccountType.IDFA,Field.Url,"upmobile.v.qq.com", gen feature ("device_id") notContains("%") len(36,36))
    terminalWhitelist("562797572", AccountType.MAC,Field.Url,"r.cnews.qq.com", gen feature ("mac") urlDecode())
    terminalWhitelist("-134074445", AccountType.IMEI,Field.Url,"mcgi.v.qq.com", gen feature ("imei") )
    terminalWhitelist("61934644", AccountType.IMEI,Field.Url,"w.cnews.qq.com", gen feature ("devid") )
    terminalWhitelist("-1677573637", AccountType.MDN,Field.Url,"chong.qq.com", gen feature ("OutUid") )
	}

    def formatQQCookie(given: String) = {
        val ret = given.replace("%20", "").replace(" ", "").split("@")
        val res = if (ret.length >= 1) ret(0) else ""
        Some(res.trim()) // 与 C++ 略微有不同
    }
}
