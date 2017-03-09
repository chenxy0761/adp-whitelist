package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-09.
 */
class Lenovomm extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("-1160037445", AccountType.IMEI, Field.Url, "susapi.lenovomm.com", gen feature("DevID"))
  }
}
