package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-08.
 */
class coolmart extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("1083858681", AccountType.MAC, Field.Url, "tp.coolmart.net.cn", gen feature("mac"))
  }
}
