package com.ideal.adp.whitelist.test

import com.ideal.adp.whitelist.account.{AccountResolver, AccountType}
import com.ideal.adp.whitelist.account.AccountType._
import com.ideal.adp.whitelist.tool.{UriParser, Utilities}
import org.scalatest.{BeforeAndAfter, FunSuite}

import scala.collection.mutable
import com.ideal.adp.whitelist.LogicDefine._
import com.ideal.adp.whitelist.{BaseLibrary, Whitelist}

class NetworkWhitelistSuite extends FunSuite with BeforeAndAfter {

    var url: String = _
    var rawCookie: String = _
    var cache: Option[mutable.Map[String, mutable.Map[String, mutable.Set[(Logic, AccountType)]]]] = _
    private def parserCookie(cookie: String) = {
        val res = mutable.Map[String, String]()
        for(x <- cookie.split(";"); parts = x.split("=", 2); if(parts.length == 2)) {
            res += (parts(0).trim -> parts(1))
        }
        res
    }
    private def parseQuery(query: String) = Utilities.string2Map(query, "&", "=")

    before {
        url = "http://ossweb-img.qq.com/images/clientpop/msgcenter/lol/send_json_lean_list.json?rid=0.39027754310518503\taHR0cDovL2xvbC5xcS5jb20vYWN0L2EyMDE1MDcwM21zZy9pbmRleC5odG0/em9uZWlkPTE0"
        rawCookie = "RK=XBvnXSrvXq; eas_sid=g174t8Q8k398h4o7N0f6J0Q4d0; LW_uid=y1n4u8F8e4t3q43103w5s7Z3x8; ptisp=ctc; ptcz=b0f5743a1e90f918b5b50e952f34556fb516c862d560722dada5a7b151c0e666; pt2gguin=o0381315486; uin=o0381315486; skey=@N3RFhk3ig; IED_LOG_INFO2=userUin%3D381315486%26nickName%3D%2525E5%2525B0%25258F%2525E9%2525B2%25259C%2525E8%252582%252589%2525E4%2525B8%2525B6%26userLoginTime%3D1488651489; LW_sid=71Y4X8f8f695N1N4F8i9u8h1h5; pgv_pvid=8181822302; pgv_info=pgvReferrer=http://qt.qq.com/zhibo/lol_live.html&ssid=s9073689536"
        new BaseLibrary(AccountType.NETWORK).load()
        // cache = Whitelist.cache.get(Field.Cookie)
    }

    test("test network-whitelist") {
        val r = new AccountResolver(Whitelist.cache).resolve(url, Some(rawCookie), parserCookie, UriParser.getQuery(Some(url)), parseQuery)
        r match {
            case None => None
            case (Some(track)) => println(track)
        }
    }

/*    test("test terminal-whitelist") {
        val r =
    }*/

}