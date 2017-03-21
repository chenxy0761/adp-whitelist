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
        url = "api.m.taobao.com/crrvr?ttid=android%40umeng&t=1488927237&imei=umeng&appKey=umeng%3A521add8956240b94130047c2&v=4.0&sign=ebb02e6a3329be358e069b0df5ff3895&data=%7B%22new_device%22%3A%22true%22%2C%22old_device_id%22%3A%22ApANLhG7x3ZOofTTV3fwgEjsGbB6aKDkoxvvXguFYTdT%22%2C%22c1%22%3A%22Lenovo+A320    t%22%2C%22c2%22%3A%22umeng%22%2C%22device_global_id%22%3A%22Vs7YD5UMdXQDAES3wsPo18tN%22%2C%22c0%22%3A%22Lenovo%22%2C%22c6%22%3A%22350f7f27e685e967%22%2C%22package_name%22%3A%22com.ziipin.homeinn%22%2C%22c5%22%3A%220123456789ABCDEF%22%2C%22app_version%22%3A%225.8%22%2C%22sdk_version%22%3A20160215%2C%22c4%22%3Anull%2C%22c3%22%3A%22umeng%22%7D&api=mtop.push.device.createAndRegister&imsi=umeng"
        rawCookie = "client=android; =a%7c%e6%9f%a5%e6%9f%a5%7c%e4%bd%a0%e5%a5%bd; pin=18999999999"
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