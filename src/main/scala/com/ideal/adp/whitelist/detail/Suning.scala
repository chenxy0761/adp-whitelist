package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Suning extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1182215947", AccountType.MDN,Field.Cookie,"ju.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("1198242383", AccountType.MDN,Field.Cookie,"api.m.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("-120609193", AccountType.MDN,Field.Cookie,"member.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("1257860819", AccountType.MDN,Field.Cookie,"favorite.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("146876532", AccountType.IMEI,Field.Url,"th.suning.com", gen feature ("dev_id") )
    terminalWhitelist("-1435106961", AccountType.MDN,Field.Cookie,"tuijian.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("-1829051589", AccountType.MDN,Field.Cookie,"search.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("231132879", AccountType.MDN,Field.Cookie,"www.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("249363359", AccountType.MDN,Field.Cookie,"shop.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("-416194501", AccountType.MDN,Field.Cookie,"shopping.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("-611710147", AccountType.MDN,Field.Cookie,"sale.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("-1519556216", AccountType.IMEI,Field.Url,"tuijian.suning.com", gen feature ("c") )
    terminalWhitelist("-960347997", AccountType.MDN,Field.Cookie,"th.suning.com", gen feature ("idsLoginUserIdLastTime") regex())
    terminalWhitelist("2017900156", AccountType.MDN,Field.Cookie,"f.m.suning.com", gen feature ("idsLoginUserIdLastTime") )
    terminalWhitelist("1509947324", AccountType.MDN,Field.Cookie,"m.suning.com", gen feature ("idsLoginUserIdLastTime") )
    terminalWhitelist("2007602396", AccountType.MDN,Field.Cookie,"pas.suning.com", gen feature ("idsLoginUserIdLastTime") )
    terminalWhitelist("-18394788", AccountType.MDN,Field.Cookie,"product.m.suning.com", gen feature ("idsLoginUserIdLastTime") )
    terminalWhitelist("952372604", AccountType.MDN,Field.Cookie,"res.m.suning.com", gen feature ("idsLoginUserIdLastTime") )
	}
}