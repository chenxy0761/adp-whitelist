package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-08.
 */
class Cnzz extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("110764795", AccountType.MAC, Field.Url, "z4.cnzz.com", gen feature("r") urlDecode())
  }
}
