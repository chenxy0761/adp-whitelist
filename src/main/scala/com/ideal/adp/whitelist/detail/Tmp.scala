package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.account.AccountType
import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._

class Tmp extends LogicGenerable {
    override def load(): Unit = {
        val url = "51tv.com"
/*        networkWhitelist("id133", url, gen feature("AHeadUserInfo"))
        networkWhitelist("id134", url, gen feature("CtripUserInfo"))
        networkWhitelist("id135", url, gen feature("AHeadUserInfo") stringToMap("&", "=") find("U"))
        networkWhitelist("id135", url, gen feature("CtripUserInfo") stringToMap("&", "=") find("U"))
        networkWhitelist("id136", url, gen feature("AHeadUserInfo") stringToMap("&", "=") find("UserName"))
        networkWhitelist("id136", url, gen feature("CtripUserInfo") stringToMap("&", "=") find("UserName"))*/

        terminalWhitelist("tid33", AccountType.IMEI, Field.Url, url, gen feature("deviceId") jsonToMap() find("im") add(len1415)) //
        terminalWhitelist("tid34", AccountType.IMEI, Field.Url, url, gen feature("zz") filter("000000000000000") add(len1415)) //

    }

    def len1415(str: String) = if (str.length == 14 || str.length == 15) Some(str) else None
}
