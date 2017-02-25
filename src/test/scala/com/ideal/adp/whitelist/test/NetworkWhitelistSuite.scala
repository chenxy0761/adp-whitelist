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
    private def parserCookie(cookie: String) = Utilities.string2Map(cookie, "; ", "=")
    private def parseQuery(query: String) = Utilities.string2Map(query, "&", "=")

    before {
        url = "www.51tv.com/crrvr?deviceId=860000000000000&cevcr=44rre&zz=860000000000000"
        rawCookie = "yyuid=a%7c%e6%9f%a5%e6%9f%a5%7c%e4%bd%a0%e5%a5%bd; alpin=ooooo"
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