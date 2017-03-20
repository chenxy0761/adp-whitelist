package com.ideal.adp.whitelist

import com.ideal.adp.whitelist.account.AccountType
import com.ideal.adp.whitelist.detail._
import com.ideal.adp.whitelist.account.AccountType.AccountType

object MethodType extends Enumeration {
    type MethodType = Value
    val LIB_FEATURE, LIB_FIND, LIB_FILTER, LIB_URLDECODE, LIB_URLENCODE, LIB_REGEX, LIB_REGEX_STRICT, LIB_SPLIT, LIB_SPLIT_COMFORT, LIB_REPLACE,
    LIB_STRING_TO_MAP, LIB_JSON_TO_MAP, LIB_LOWER_CASE, LIB_LEN, LIB_SUBSTRING, LIB_REVERSE, LIB_CONTAINS, LIB_NOT_CONTAINS,
    LIB_FORMAT,
    CUSTOM = Value
}

object TerminalRegex {
    val IMEI = ("""[0-9a-fA-F]{15}""".r, 15)
    val IMSI = ("""4600[0-3]{1}[0-9]{10}""".r, 15)
    val MDN = ("""[1][3578][0-9]{9}""".r, 11)
    val MAC = ("""([0-9A-Fa-f]{2}[-|:]){5}[0-9A-Fa-f]{2}""".r, 17)
    val IDFA = ("""[A-Za-z0-9]{8}-([A-Za-z0-9]{4}-){3}[A-Za-z0-9]{12}""".r, 36)
    val ANDROID_ID = ("""[A-Za-z0-9]{10,40}""".r, -1)

    val TYPE_TO_REGEX_MAP = Map(AccountType.IMEI -> IMEI, AccountType.IMSI -> IMSI, AccountType.MDN -> MDN,
        AccountType.MAC -> MAC, AccountType.IDFA -> IDFA, AccountType.ANDROIDID -> ANDROID_ID)

    def find(accountType: AccountType) = TYPE_TO_REGEX_MAP.get(accountType)
}

class BaseLibrary(accountType: AccountType*) {
    def load(): Unit = {
        /*new AutoHome().load()
        new Baidu().load()
        new Bairong().load()
        new Behe().load()
        new BitAuto().load()
        new Ctrip().load()
        new Dangdang().load()
        new Dianping().load()
        new Douban().load()
        new Haodai().load()
        new I163().load()
        new I360().load()
        new Iqiyi().load()
        new JD().load()
        new Jumei().load()
        new Letv().load()
        new Meilishuo().load()
        new Meituan().load()
        new QQ().load()
        new Renren().load()
        new Renrendai().load()
        new Rong360().load()
        new Sina().load()
        new Symbol().load()
        new Taobao().load()
        new Vip().load()
        new YHD().load()
        new Youku().load()
        new YY().load()
        new Tmp().load()*/
        //new Temp().load()
        //new SelFunc().load()
        new Temp2().load()
    }
}
