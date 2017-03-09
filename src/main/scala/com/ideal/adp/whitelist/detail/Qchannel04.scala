package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-09.
 */
class Qchannel04 extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("1173114090", AccountType.IMEI, Field.Url, "www.qchannel04.cn", gen feature("did"))

  }
}
