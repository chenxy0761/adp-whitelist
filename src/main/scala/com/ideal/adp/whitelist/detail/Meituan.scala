package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Whitelist._

class Meituan extends LogicGenerable {
    override def load() {
        networkWhitelist("id150", "meituan.com", gen feature("u"))
        networkWhitelist("id151", "meituan.com", gen feature("n"))
        terminalWhitelist("1593487624", AccountType.IMEI,Field.Url,"mc.meituan.net", gen feature ("utm_content")  )
	
    }
}
