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

        terminalWhitelist("-1022928784", AccountType.MAC,Field.Url,"imageplus.baidu.com", gen feature ("cuid") )
    terminalWhitelist("570785635", AccountType.IMEI,Field.Url,"cm.pos.baidu.com", gen feature ("mzid") )
    terminalWhitelist("-1180880864", AccountType.IMEI,Field.Url,"hm.baidu.com", gen feature ("u") urlDecode() stringToMap("&","=") find("mac") add(AddUtilities.substrTail))
    terminalWhitelist("1343290382", AccountType.MAC,Field.Url,"loc.map.baidu.com", gen feature ("mac") urlDecode())
    terminalWhitelist("-1400974010", AccountType.IDFA,Field.Url,"log.waimai.baidu.com", gen feature ("idfa") )
    terminalWhitelist("1133759069", AccountType.IMEI,Field.Url,"api.map.baidu.com", gen feature ("im") )
    terminalWhitelist("181867979", AccountType.IMEI,Field.Url,"m.baidu.com", gen feature ("imei") )
    terminalWhitelist("-1495956879", AccountType.MAC,Field.Url,"m.baidu.com", gen feature ("clientmac") )
    terminalWhitelist("-316984385", AccountType.IMEI,Field.Url,"nsclick.baidu.com", gen feature ("c_openudid") )
    terminalWhitelist("-1949815987", AccountType.MAC,Field.Url,"pos.baidu.com", gen feature ("udi") )
    terminalWhitelist("-1952596954", AccountType.MAC,Field.Url,"m.baidu.com", gen feature ("mac") )
    terminalWhitelist("1391583297", AccountType.IMEI,Field.Url,"api.map.baidu.com", gen feature ("imei") )
    terminalWhitelist("1970071167", AccountType.MDN,Field.Url,"m.baidu.com", gen feature ("phone") )
    terminalWhitelist("-2075356967", AccountType.IMEI,Field.Url,"blcs.waimai.baidu.com:8066", gen feature ("cuid") split("\\|",1) reverse())
    terminalWhitelist("-1089933125", AccountType.IMEI,Field.Url,"hm.baidu.com", gen feature ("u") urlDecode() stringToMap("&","=") find("imei"))
    terminalWhitelist("1818621397", AccountType.IMEI,Field.Url,"v.map.baidu.com", gen feature ("im") )
    terminalWhitelist("-390618087", AccountType.MAC,Field.Url,"imageplus.baidu.com", gen feature ("clid") )
    terminalWhitelist("70409067", AccountType.MAC,Field.Url,"hm.baidu.com", gen feature ("u") urlDecode() stringToMap("&","=") find("mac") subStringX(-1,12))
    terminalWhitelist("108866531", AccountType.IMEI,Field.Url,"hm.baidu.com", gen feature ("su") urlDecode() stringToMap("&","=") find("mac") add(AddUtilities.substrTail))
    terminalWhitelist("-1015694658", AccountType.IMEI,Field.Url,"hm.baidu.com", gen feature ("su") urlDecode() stringToMap("&","=") find("imei"))
    terminalWhitelist("610964800", AccountType.MAC,Field.Url,"hm.baidu.com", gen feature ("su") urlDecode() stringToMap("&","=") find("mac") subStringX(-1,12))
    terminalWhitelist("2090626563", AccountType.MDN,Field.Url,"api.map.baidu.com", gen feature ("address") )
    }
    /*def getValue(line: String): Option[String] ={
        val value = Utilities.string2Map(line, "&", "=").get("mac")
        if () {

        }
        val len = value.size
        val endIndex = len - 12
    }*/

}
