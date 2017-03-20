package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType
class T14020721732 extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("1036859558", AccountType.MDN, Field.Url, "140.207.217.32", gen feature("phoneno") regex())

  }
}
