package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

/**
 * Created by jason on 2017-03-08.
 */
class Weibo extends LogicGenerable{
  override def load(): Unit = {
    terminalWhitelist("-1033901391", AccountType.IMEI, Field.Url, "api.weibo.cn", gen feature("imei"))

  }
}
