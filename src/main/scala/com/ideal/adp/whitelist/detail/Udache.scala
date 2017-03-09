package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-08.
 */
class Udache extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("-1026459068", AccountType.MAC, Field.Url, "api.udache.com", gen feature("mac")  urlDecode())
  }
}
