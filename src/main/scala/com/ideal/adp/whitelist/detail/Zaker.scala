package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.account.AccountType
import com.ideal.adp.whitelist.Whitelist._

/**
 * Created by jason on 2017-03-08.
 */
class Zaker extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("1016674735", AccountType.IDFA, Field.Url, "sns.myzaker.com", gen feature("_idfa"))
    terminalWhitelist("-1162497018", AccountType.IMEI, Field.Url, "stat.myzaker.com", gen feature("_udid"))
  }
}
