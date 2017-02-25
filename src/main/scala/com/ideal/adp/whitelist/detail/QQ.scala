package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

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
    }

    def formatQQCookie(given: String) = {
        val ret = given.replace("%20", "").replace(" ", "").split("@")
        val res = if (ret.length >= 1) ret(0) else ""
        Some(res.trim()) // 与 C++ 略微有不同
    }
}
