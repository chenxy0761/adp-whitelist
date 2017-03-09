package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-08.
 */
class MIaozhen extends LogicGenerable{
  override def load(): Unit = {

    terminalWhitelist("1012928975", AccountType.MAC, Field.Url, "fun.m.cn.miaozhen.com", gen feature("m7"))
  }
}
