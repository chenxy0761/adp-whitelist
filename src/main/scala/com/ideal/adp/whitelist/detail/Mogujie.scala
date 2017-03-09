package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-09.
 */
class Mogujie extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("-114888741", AccountType.MAC, Field.Url, "ipservice.mogujie.com", gen feature("did") urlDecode())

  }
}