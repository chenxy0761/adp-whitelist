package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Cnzz extends LogicGenerable {
    override def load(): Unit = {
        terminalWhitelist("110764795", AccountType.MAC, Field.Url, "z4.cnzz.com", gen feature ("r") urlDecode() stringToMap("&", "=") find ("usermac"))
        terminalWhitelist("2142213933", AccountType.MAC, Field.Url, "q14.cnzz.com", gen feature ("r") urlDecode() stringToMap("&", "=") find ("usermac"))
        terminalWhitelist("-304892483", AccountType.IMEI, Field.Url, "z11.cnzz.com", gen feature ("r") urlDecode() stringToMap("&", "=") find ("mac") add (AddUtilities.substrTail))
        terminalWhitelist("464413221", AccountType.ANDROIDID, Field.Url, "atk.gxb.cnzz.com", gen feature ("android_id"))
        terminalWhitelist("1770467352", AccountType.IMEI, Field.Url, "z11.cnzz.com", gen feature ("r") urlDecode() stringToMap("&", "=") find ("imei"))
        terminalWhitelist("81653192", AccountType.MAC, Field.Url, "z11.cnzz.com", gen feature ("r") urlDecode() stringToMap("&", "=") find ("mac") subStringX(-1, 12))
    }
}