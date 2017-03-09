package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class QQ extends LogicGenerable {
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

        terminalWhitelist("1002337215", AccountType.IMEI, Field.Url, "w.inews.qq.com", gen feature("devid"))
        //terminalWhitelist()

        terminalWhitelist("1057529556", AccountType.IMEI, Field.Url, "r.cnews.qq.com", gen feature("devid"))
        terminalWhitelist("1103660724", AccountType.MAC, Field.Url, "mcgi.v.qq.com", gen feature("mac"))
        terminalWhitelist("-1104344824", AccountType.IMEI, Field.Cookie, "c.isdspeed.qq.com", gen feature("imei"))
        terminalWhitelist("1107009462", AccountType.IDFA, Field.Url, "mcgi.v.qq.com", gen feature("idfa"))
        terminalWhitelist("1141876332", AccountType.IMEI, Field.Url, "xwapp.auto.qq.com", gen feature("devid"))
        terminalWhitelist("-1160544028", AccountType.ANDROIDID, Field.Url, "upmobile.v.qq.com", gen feature("device_id"))
    }

    def formatQQCookie(given: String) = {
        val ret = given.replace("%20", "").replace(" ", "").split("@")
        val res = if (ret.length >= 1) ret(0) else ""
        Some(res.trim()) // 与 C++ 略微有不同
    }
}
