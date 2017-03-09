package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-08.
 */
class Sohu extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("-1074108302", AccountType.MAC, Field.Url, "s.go.sohu.com", gen feature("mac"))
  }
}
