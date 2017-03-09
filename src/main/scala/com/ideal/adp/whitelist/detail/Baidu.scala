package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Baidu extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("baidu.com", "nuomi.com", "baidupcs.com", "bdimg.com", "bdstatic.com", "baidustatic.com", "baifubao.com")
        networkWhitelist("id6", urls, gen feature("baiduid"))
        networkWhitelist("id19", urls, gen feature("tiebaid") filter("cb23caae14130a0d384a57f1"))
        networkWhitelist("id73", urls, gen feature("longid"))

        terminalWhitelist("-1022928784", AccountType.MAC, Field.Url, "imageplus.baidu.com", gen feature("cuid"))
        terminalWhitelist("-1126545263", AccountType.IMEI, Field.Url, "cm.pos.baidu.com", gen feature("mzid"))
    }
}
