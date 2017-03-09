package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-09.
 */
class Pps extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("-1154029627", AccountType.IMEI, Field.Url, "api.msg.pps.tv", gen feature("cupid_uid"))
  }
}
