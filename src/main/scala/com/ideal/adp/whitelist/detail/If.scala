package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-08.
 */
class If extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("1020918665", AccountType.IMEI, Field.Url, "if", gen feature("aqyid") split("_", 0))
    terminalWhitelist("-1099304170", AccountType.IMEI, Field.Url, "if", gen feature("qyid"))
  }
}
