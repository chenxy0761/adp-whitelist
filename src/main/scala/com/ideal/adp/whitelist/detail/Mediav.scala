package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-09.
 */
class Mediav extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("-1120916064", AccountType.MAC, Field.Url, "show.m.mediav.com", gen feature("amc") urlDecode())
  }
}