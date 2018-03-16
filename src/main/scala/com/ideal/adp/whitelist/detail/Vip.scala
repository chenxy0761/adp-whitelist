package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Vip extends LogicGenerable {
  override def load(): Unit = {
    val urls = Array("vip.com", "vipstatic.com")
    networkWhitelist("id110", urls, gen feature ("visit_id"))
    networkWhitelist("id111", urls, gen feature ("login_username"))
    networkWhitelist("id112", urls, gen feature ("VipRNAME"))
    networkWhitelist("id113", urls, gen feature ("VipRUID"))

    terminalWhitelist("1001089175", AccountType.MDN, Field.Cookie, "act.vip.com", gen feature ("login_username") regex ())
    terminalWhitelist("1066750497", AccountType.MDN, Field.Cookie, "list.vip.com", gen feature ("login_username") regex ())
    terminalWhitelist("1179476853", AccountType.MDN, Field.Cookie, "list.vip.com", gen feature ("VipRNAME") regex ())
    terminalWhitelist("-1294610443", AccountType.MDN, Field.Cookie, "www.vip.com", gen feature ("VipRNAME") regex ())
    terminalWhitelist("1843778356", AccountType.MDN, Field.Url, "checkout.vip.com", gen feature ("userId") regex ())
    terminalWhitelist("191321781", AccountType.MDN, Field.Cookie, "cart.vip.com", gen feature ("VipRNAME") regex ())
    terminalWhitelist("236961515", AccountType.MDN, Field.Cookie, "act.vip.com", gen feature ("VipRNAME") regex ())
    terminalWhitelist("-30938891", AccountType.MDN, Field.Cookie, "category.vip.com", gen feature ("VipRNAME") regex ())
    terminalWhitelist("-40080479", AccountType.MDN, Field.Cookie, "category.vip.com", gen feature ("login_username") regex ())
    terminalWhitelist("-530482783", AccountType.MDN, Field.Cookie, "www.vip.com", gen feature ("login_username") regex ())
    terminalWhitelist("597050529", AccountType.MDN, Field.Cookie, "checkout.vip.com", gen feature ("login_username") regex ())
    terminalWhitelist("606192117", AccountType.MDN, Field.Cookie, "checkout.vip.com", gen feature ("VipRNAME") regex ())
    terminalWhitelist("675399215", AccountType.MDN, Field.Cookie, "mar.vip.com", gen feature ("login_username") regex ())
    terminalWhitelist("78595425", AccountType.MDN, Field.Cookie, "cart.vip.com", gen feature ("login_username") regex ())
    terminalWhitelist("-88728445", AccountType.MDN, Field.Cookie, "mar.vip.com", gen feature ("VipRNAME") regex ())
    terminalWhitelist("-1460640670", AccountType.MDN, Field.Cookie, "api.union.vip.com", gen feature ("login_username"))
    terminalWhitelist("261458466", AccountType.MDN, Field.Cookie, "fav.vip.com", gen feature ("login_username"))
    terminalWhitelist("1052427530", AccountType.MDN, Field.Cookie, "gensvr.vip.com", gen feature ("login_username"))
    terminalWhitelist("-479266692", AccountType.MDN, Field.Cookie, "mst.vip.com", gen feature ("login_username"))
    terminalWhitelist("1967354346", AccountType.MDN, Field.Cookie, "myopen.vip.com", gen feature ("login_username"))
    terminalWhitelist("-1981779350", AccountType.MDN, Field.Cookie, "n-st.vip.com", gen feature ("login_username"))
    terminalWhitelist("1773085130", AccountType.MDN, Field.Cookie, "pcapi.vip.com", gen feature ("login_username"))
    terminalWhitelist("433981594", AccountType.MDN, Field.Cookie, "share.vip.com", gen feature ("login_username"))
    terminalWhitelist("-1494238676", AccountType.MDN, Field.Cookie, "stock.vip.com", gen feature ("login_username"))
    terminalWhitelist("-1494087794", AccountType.MDN, Field.Cookie, "api.union.vip.com", gen feature ("VipRNAME"))
    terminalWhitelist("-1719711182", AccountType.MDN, Field.Cookie, "click.union.vip.com", gen feature ("VipRNAME"))
    terminalWhitelist("703696718", AccountType.MDN, Field.Cookie, "fav.vip.com", gen feature ("VipRNAME"))
    terminalWhitelist("-1160693450", AccountType.MDN, Field.Cookie, "gensvr.vip.com", gen feature ("VipRNAME"))
    terminalWhitelist("-37028440", AccountType.MDN, Field.Cookie, "mst.vip.com", gen feature ("VipRNAME"))
    terminalWhitelist("-245766634", AccountType.MDN, Field.Cookie, "myopen.vip.com", gen feature ("VipRNAME"))
    terminalWhitelist("2102385814", AccountType.MDN, Field.Cookie, "n-st.vip.com", gen feature ("VipRNAME"))
    terminalWhitelist("1055699190", AccountType.MDN, Field.Cookie, "pcapi.vip.com", gen feature ("VipRNAME"))
    terminalWhitelist("-283404346", AccountType.MDN, Field.Cookie, "share.vip.com", gen feature ("VipRNAME"))
    terminalWhitelist("2083342680", AccountType.MDN, Field.Cookie, "stock.vip.com", gen feature ("VipRNAME"))
  }
}
