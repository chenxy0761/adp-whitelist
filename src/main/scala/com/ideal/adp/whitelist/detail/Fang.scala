package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-09.
 */
class Fang extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("1129392298", AccountType.MDN, Field.Url, "soufunapp.3g.fang.com", gen feature("searchdata") regex())
  }
}
