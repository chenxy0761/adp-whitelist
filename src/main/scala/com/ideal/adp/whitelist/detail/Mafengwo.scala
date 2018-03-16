package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Mafengwo extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-1552362488", AccountType.MAC,Field.Cookie,"server.mafengwo.cn", gen feature ("__openudid") len(17,17))
    terminalWhitelist("288210828", AccountType.MAC,Field.Cookie,"mapi.mafengwo.cnhttps", gen feature ("__openudid") len(17,17))
    terminalWhitelist("-348792002", AccountType.MAC,Field.Cookie,"www.mafengwo.cn", gen feature ("__openudid") len(17,17))
    terminalWhitelist("373481192", AccountType.MAC,Field.Cookie,"www.mafengwo.cnhttps", gen feature ("__openudid") len(17,17))
    terminalWhitelist("-523483128", AccountType.MAC,Field.Cookie,"mapi.mafengwo.cn", gen feature ("__openudid") len(17,17))
	}
}