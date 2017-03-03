package com.ideal.adp.whitelist

import com.ideal.adp.whitelist.account.{AccountResolver, AccountType}
import com.ideal.adp.whitelist.account.AccountType.AccountType
import com.ideal.adp.whitelist.Field.Field
import com.ideal.adp.whitelist.LogicDefine.Logic
import com.ideal.adp.whitelist.tool.{UriParser, Utilities}

import scala.collection.mutable

object Field extends Enumeration {
    type Field = Value
    val Url, Cookie, Referer, Body, Ua = Value
}

/**
  * 白名单体系：
  *
  * 一.账号白名单系统介绍
  * 1.基础项
  * ruleId：规则id：全局rule唯一标识
  * accountId：账号id：全局account唯一标识
  * accountType：账号类型：该条白名单可以解析出的账号类型
  * url：URL：该条白名单的url值
  * field：Field：该条白名单的解析字段
  * logic：Logic：该条白名单的账号解析逻辑
  *
  * 注意：一条白名单主要有2 种表达方式：ruleId  <---> (accountId，url，field，logic)
  *       即：每个ruleId 可以唯一指定一条白名单；或者一组(accountId，url，field，logic) 也可以唯一指定一条白名单
  *       白名单不支持序列化
  *
  * 2.扩展项
  * （1）Audit体系
  * Dimension：[ruleId]
  * Measure：[dubious attempt]   [successful attempt]
  *
  * 二.互联网账号白名单系统
  * 1.基础项
  * ruleId：由系统内部自动生成
  * accountId：由人员手工指定
  * accountType：AccountType.NETWORK
  * url：由人员手工指定
  * field：由人员手工指定
  * logic：由人员手工指定
  *
  * 2.扩展项
  * （1）Audit体系
  * Dimension：[Account]
  * Measures：[Total Record]  [Match Record]  [Unique Account]
  * （2）返回值
  * [ruleId]:[accountValue]
  *
  * 三.终端账号白名单系统
  * 1.基础项
  * ruleId：由人员手工指定
  * accountType：由人员手工指定，可选：AccountType.IMEI ...
  * accountId：由系统根据accountType自定生成
  * url：由人员手工指定
  * field：由人员手工指定
  * logic：由人员手工指定
  *
  */
object Whitelist {
    val cache = mutable.Map[Field, mutable.Map[String, mutable.Map[String, mutable.Set[(Logic, (AccountType, String, String))]]]]() // Field, host, url, <logic, accountId, ruleIdX>
    val ruleToAccount = mutable.Map[String, String]()
    val accountToRule = mutable.Map[String, mutable.Set[String]]()

    //【基础】白名单构造函数
    // 每一条白名单都会被cache到一个多级Map中，以方便使用
    def whitelist(ruleId: String, accountId: String, accountType: AccountType, url: String, field: Field.Field, logic: Logic): Boolean = {
        val domain = UriParser.getDomain(Some(url))
        // 互联网账号白名单由系统统一生成ruleid，规则：[AccountType].[accountId].[logic].[domain]
        val ruleIdX = if(accountType == AccountType.NETWORK) List(accountType.toString, accountId, String.valueOf(LogicDefine.signature(logic)), domain.get).mkString(".") else ruleId
        domain match {
            case None => false
            case Some(d) => {
                if(ruleToAccount.get(ruleIdX).isEmpty) {
                    ruleToAccount += (ruleIdX -> accountId)
                    Utilities.addToSetMap(accountToRule, accountId, ruleIdX)
                    Utilities.addToCascading2Map(cache, field, d, url, logic, (accountType, accountId, ruleIdX))
                } else
                    throw new IllegalArgumentException("Duplicated ruleid:[" + ruleIdX + "]")
            }
        }
    }

    //【基础】互联网白名单构造函数
    def networkWhitelist(accountId: String, url: String, generator: LogicDefine.LogicGenerator, forget: Boolean): Boolean = {
        val added = whitelist("", accountId, AccountType.NETWORK, url, Field.Cookie, generator.logic)
        if(!added) println(accountId + " added failed.")
        if (forget) generator.release()
        added
    }
    //【推荐】互联网白名单构造函数，适用于构造单条互联网白名单
    def networkWhitelist(accountId: String, url: String, generator: LogicDefine.LogicGenerator): Boolean = networkWhitelist(accountId, url, generator, true)
    //【推荐】互联网白名单构造函数，适用于logic 衍生多条白名单
    def networkWhitelist(accountId: String, url: String, gens: LogicDefine.MultiLogicGenerator): List[Boolean] = for(gen <- gens.make()) yield networkWhitelist(accountId, url, gen)
    //【推荐】互联网白名单构造函数，适用于url 衍生多条白名单
    def networkWhitelist(accountId: String, urls: Array[String], generator: LogicDefine.LogicGenerator): List[Boolean] = {
        val res = for(url <- urls) yield networkWhitelist(accountId, url, generator, false)
        generator.release()
        res.toList
    }
    //【推荐】互联网白名单构造函数，适用于url 和 logic 分别衍生多条白名单
    def networkWhitelist(accountId: String, urls: Array[String], gens: LogicDefine.MultiLogicGenerator): List[Boolean] = {
        val res = for(gen <- gens.make()) yield networkWhitelist(accountId, urls, gen)
        gens.release()
        res.flatten(List[Boolean])
    }

    //【基础】终端白名单构造函数
    def terminalWhitelist(ruleId: String, accountType: AccountType, field: Field, url: String, generator: LogicDefine.LogicGenerator, forget: Boolean): Boolean = {
        val accountId = (accountType, ruleId, url) match {
            case (AccountType.IMEI, _, _) => "imei"
            case (AccountType.IMSI, _, _) => "imsi"
            case (AccountType.MDN, _, _) => "mdn"
            case (AccountType.ANDROIDID, _, _) => "android_id"
            case (AccountType.IDFA, _, _) => "idfa"
            case (AccountType.MAC, _, _) => "mac"
            case _ => throw new IllegalArgumentException("Internal error: ruleId = [" + ruleId
              + "], url = [" + url + "], it's accountType = [" + accountType + "] does not belong to the TerminalType, " +
              "please validate the AccountType.")
        }

        // logic动态改写
        val logicX = if(generator.logic.isEmpty) throw new IllegalArgumentException("Internal error: logic is null " +
          "while retrieving the ruleId = [" + ruleId + "], url = [" + url + "].") else
            for(x <- generator.logic) yield {
                (x._1, x._2, accountType) match {
                    case (MethodType.LIB_REGEX, _, acType) => {
                        val regexet = TerminalRegex.find(acType) match {
                            case None => throw new IllegalArgumentException("Internal error: Cannot find the regex for the type:" + acType.toString)
                            case Some(r) => r
                        }
                        (MethodType.LIB_REGEX, regexet)
                    }
                    case (MethodType.LIB_REGEX_STRICT, _, acType) => {
                        println("hahaha" + acType.toString)
                        val regexet = TerminalRegex.find(acType) match {
                            case None => throw new IllegalArgumentException("Internal error: Cannot find the regex for the type:" + acType.toString)
                            case Some(r) => r
                        }
                        (MethodType.LIB_REGEX_STRICT, regexet)
                    }
                    case (a, b, _) => (a, b)
                    case _ => throw new IllegalArgumentException("Internal error: Unknown logic type!")
                }
            }

        val added = whitelist(ruleId, accountId, accountType, url, field, logicX)
        if(!added) println(accountId + " added failed.")
        if (forget) generator.release()
        added
    }
    //【推荐】终端白名单构造函数，适用于构造单条终端白名单
    def terminalWhitelist(ruleId: String, accountType: AccountType, field: Field, url: String, generator: LogicDefine.LogicGenerator): Boolean =
        terminalWhitelist(ruleId, accountType, field, url, generator, true)

    def main(args: Array[String]): Unit = {
        def parserCookie(cookie: String) = Utilities.string2Map(cookie, "; ", "=")
        def parseQuery(query: String) = Utilities.string2Map(query, "&", "=")

        val url = "www.51tv.com/crrvr?deviceId={ \"firstName\":\"Bill\" , \"im\":\"860000000000000\" }&cevcr=44rre&zz=860000000000000"
        val rawCookie = "yyuid=a%7c%e6%9f%a5%e6%9f%a5%7c%e4%bd%a0%e5%a5%bd; alpin=ooooo"
        new BaseLibrary(AccountType.NETWORK).load()

        val r = new AccountResolver(Whitelist.cache).resolve(url, Some(rawCookie), parserCookie, UriParser.getQuery(Some(url)), parseQuery)
        r match {
            case None => None
            case (Some(track)) => println(track)
        }
    }
}
