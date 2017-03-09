package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-09.
 */
class Cmread extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("-1139063431", AccountType.MDN, Field.Cookie, "cm.pos.baidu.com", gen feature("userPhone") regex())

  }
}
