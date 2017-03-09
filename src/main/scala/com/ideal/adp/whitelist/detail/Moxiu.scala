package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-09.
 */
class Moxiu extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("-1171346155", AccountType.IMEI, Field.Url, "weather.moxiu.net", gen feature("imei"))

  }
}
