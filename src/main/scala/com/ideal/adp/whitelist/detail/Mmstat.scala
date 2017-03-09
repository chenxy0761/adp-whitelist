package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-08.
 */
class Mmstat extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("1073084903", AccountType.IMEI, Field.Url, "gxb.mmstat.com", gen feature("dim"))

  }
}
