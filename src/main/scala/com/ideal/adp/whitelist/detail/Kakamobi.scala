package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-08.
 */
class Kakamobi extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("1010528295", AccountType.ANDROIDID, Field.Url, "ipip.kakamobi.com", gen feature("_androidId"))
    terminalWhitelist("1128791423", AccountType.MAC, Field.Url, "form.kakamobi.com", gen feature("_mac") urlDecode())
  }
}