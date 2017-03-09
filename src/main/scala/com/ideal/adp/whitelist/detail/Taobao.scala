package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Taobao extends LogicGenerable {
    override def load(): Unit = {
        val urls = Array("taobao.com", "tmall.com", "mmstat.com", "tanx.com", "cnzz.com", "alibaba.com",
            "1688.com", "alipay.com", "aliyun.com", "etao.com", "alimama.com", "juhuasuan.com", "alitrip.com",
            "alisoft.com", "tmall.hk", "laiwang.com", "95095.com", "cainiao.com", "alicdn.com", "alibado.com",
            "alibabagroup.com", "tbcdn.cn", "taobaocdn.com", "linezing.com")
        networkWhitelist("id1", urls, gens feature(Array("tracknick", "_nk_")))
        networkWhitelist("id1", urls, gen feature("_w_tb_nick") urlDecode() add(unicodeToUtf8) urlEncode())
        networkWhitelist("id3", urls, gen feature("cna"))

        networkWhitelist("id3", Array("amap.com", "wrating.com"), gen feature("cna"))
        networkWhitelist("id90", "alipay.com", gen feature("iw.userid") split(";", 0))

        // 网盟账号
        networkWhitelist("id52", "m3guo.com", gen feature("CNZZDATA1594368") stringToMap("&", "=") find("cnzz_eid"))

        terminalWhitelist("-1032151963", AccountType.MAC, Field.Url, "strip.taobaocdn.com", gen feature("ps_id"))
        terminalWhitelist("-1107478357", AccountType.IMEI, Field.Url, "w.m.taobao.com", gen feature("device_id"))

    }

    /**
      * 未测试
      * @param given
      * @return
      */
    def unicodeToUtf8(given: String) = {
        if (given.length < 2) Some(given)
        else {
            val start_with_u = if (given.substring(0, 2) == "\\u") true else false
            val symbols = given.split("\\u")
            val res = new StringBuilder
            for ( i <- 0 until symbols.length) {
                if (symbols(i).length < 4) res ++= symbols(i)
                else if (i == 0 && (! start_with_u)) res ++= symbols(i)
                else if (symbols(i).length >= 4) {
                    val uniSeg = symbols(i).substring(0, 4)
                    val tailSeg = symbols(i).substring(4, symbols(i).length - 4)
                    val cc0 = fromHex(uniSeg(2)) * 16 + uniSeg(3)
                    val cc1 = fromHex(uniSeg(0)) * 16 + uniSeg(1)

                    val cr = Array[Char](4)
                    cr(0) = (0xE0 | ((cc1 & 0xF0) >> 4)).toChar
                    cr(1) = ((0x80 | ((cc1 & 0x0F) << 2)) + ((cc0 & 0xC0) >> 6)).toChar
                    cr(2) = (0x80 | (cc0 & 0x3F)).toChar
                    cr(3) = 0

                    res ++= new String(cr)
                    res ++= tailSeg
                }
            }
            Some(res.toString())
        }
    }

    private def fromHex(x: Char) = if(Character.isDigit(x)) x-'0' else x-'A'+10

}
