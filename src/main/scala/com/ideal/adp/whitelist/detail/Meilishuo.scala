package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Meilishuo extends LogicGenerable {
  override def load(): Unit = {
    networkWhitelist("id50", "meilishuo.com", gen feature ("meilishuo_global_key"))
    terminalWhitelist("1121551651", AccountType.IMEI, Field.Url, "social-api.meilishuo.com", gen feature ("imei"))
    terminalWhitelist("-1150909963", AccountType.IMEI, Field.Url, "d.meilishuo.com", gen feature ("_did"))

  }
}
