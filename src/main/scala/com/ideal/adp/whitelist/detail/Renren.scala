package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Renren extends LogicGenerable {
  override def load(): Unit = {
    val url = "renren.com"
    networkWhitelist("id4", url, gen feature ("id"))
    networkWhitelist("id16", url, gen feature ("jebe_key"))

    terminalWhitelist("-1751943255", AccountType.MDN, Field.Cookie, "xray.jebe.renren.com", gen feature ("ln_uact") regex ())
    terminalWhitelist("-633147267", AccountType.EMAIL, Field.Cookie, "xray.jebe.renren.com", gen feature ("ln_uact") contains ("@"))
  }
}
