package com.ideal.adp.whitelist.account

import com.ideal.adp.whitelist.account.AccountType.AccountType
import com.ideal.adp.whitelist.tool.UriParser
import com.ideal.adp.whitelist.Field.Field
import com.ideal.adp.whitelist.LogicDefine.Logic
import com.ideal.adp.whitelist.{Field, Simulation}

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

// 目前仅有上海一个省份，所以直接简单处理，后续这里可以扩展
class AccountResolver(ruleDb: mutable.Map[Field, mutable.Map[String, mutable.Map[String, mutable.Set[(Logic, (AccountType, String, String))]]]]) {

    private def internalResolve(cache: Option[mutable.Map[String, mutable.Map[String, mutable.Set[(Logic, (AccountType, String, String))]]]], domain: String, url: String, raw: String, kvFunction: (String => mutable.Map[String, String]), field: Field) = {
        // 1. 根据url，求出host，查找 whitelist 库的缓存，缩小 whitelist 的范围                                        accountId, ruleIdX
        // val track = new Track()
        val track = new TerminalTrack()
        //val start = System.currentTimeMillis()
        val logic2type: Option[Array[(Logic, (AccountType, String, String))]] = if(cache.isEmpty) None else cache.get.get(domain) match {
            case None => None
            case url2logics: Option[mutable.Map[String, Logic]] => {
                // 2, 遍历 url2logic，寻找匹配的logic
                var logicArray = ArrayBuffer[(Logic, (AccountType, String, String))]()
                url2logics.get.foreach( elem => {
                    if(url.contains(elem._1)) logicArray ++= elem._2
                })
                if(logicArray.size == 0) None else Some(logicArray.toArray[(Logic, (AccountType, String, String))])
            }
        }

        // 3. 执行找到的logic，尝试获取账号（互联网账号版，与原adp互联网prepare输出相同：output注重对于账号数量的值）
        /*val res = mutable.Map[Account, Int]()
        if(!logic2type.isDefined) None else {
            logic2type.get.foreach( e => {
                val acType = e._2._1
                val acId = e._2._2
                val ruleIdx = e._2._3
                track.use(ruleIdx, acId) // use ruleIdX
                val r = new Simulation(raw, kvFunction, e._1).run()
                if ( r == null) None else if (r.isInstanceOf[String]) {
                    track.success(ruleIdx)
                    Utilities.addToCountMap(res, Account.account(acId, acType, r.asInstanceOf[String]), 1) }
                    else None
            })
        }*/
        // 3. 执行找到的logic，尝试获取账号（终端账号版：output注重单账号的白名单情况）
        if(!logic2type.isDefined) None else {
            logic2type.get.foreach( e => {
                // val acType = e._2._1
                // val acId = e._2._2
                // val ruleIdX = e._2._3
                track.use(e._2)
                val r = new Simulation(raw, kvFunction, e._1).run()
                if ( r == null) None else if (r.isInstanceOf[String]) {
                    val ruleIdx = e._2._3
                    track.success(ruleIdx, r.asInstanceOf[String])
                    // Utilities.addToCountMap(res, Account.account(acId, acType, r.asInstanceOf[String]), 1)
                } else None
            })
        }

        //track.updateCost(System.currentTimeMillis() - start)
        Some(track)
    }

    def resolve(url: String, rawCookie: Option[String], parseCookie: (String => mutable.Map[String, String]), rawQuery: Option[String], parseQuery: (String => mutable.Map[String, String])): Option[TerminalTrack] = {
        val track = new Track()
        UriParser.getDomain(Some(url)) match {
            case None => None
            case Some(domain) => {
                // 尝试解析cookie信息
                val accountByCookie = if(rawCookie.isDefined)
                    internalResolve(ruleDb.get(Field.Cookie), domain, url, rawCookie.get, parseCookie, Field.Url) else None

                // 尝试解析query信息
                val accountByQuery = if(rawQuery.isDefined)
                    internalResolve(ruleDb.get(Field.Url), domain, url, rawQuery.get, parseQuery, Field.Cookie) else None

                (accountByCookie, accountByQuery) match {
                    case (None, None) => None
                    case (Some(d1), Some(d2)) => Some(d1.combine(d2))
                    case (None, Some(d)) => Some(d)
                    case (Some(d), None) => Some(d)
                }
            }
        }
    }

/*    def resolve(url: String, cookie: Option[mutable.Map[String, String]], query: Option[mutable.Map[String, String]]): (Option[mutable.Map[Account, Int]], Track) = {
        UriParser.getDomain(Some(url)) match {
            case None => (None, new Track())
            case Some(domain) => {
                // 尝试解析cookie信息
                val accountByCookie = if(cookie.isDefined)
                    internalResolve(ruleDb.get(Field.Cookie), domain, url, cookie.get) else (None, new Track())

                // 尝试解析query信息
                val accountByQuery = if(query.isDefined)
                    internalResolve(ruleDb.get(Field.Url), domain, url, query.get) else (None, new Track())

                (Utilities.combineCountMap(accountByCookie._1, accountByQuery._1), accountByCookie._2.combine(accountByQuery._2))
            }
        }
    }*/
}

/**
  * 一条记录经过 resolve_account 执行的轨迹，
  * 包含：这条记录涉及多少条whitelist，每条whitelist最终是否成功找到account
  * 注意：这个Track没有保存追后找到的账号的值
  */
class Track extends Serializable {
    var _data = mutable.Map[String, (Boolean, String)]() // <ruleIdX, is_success, accountType>
    //var cost: Long = 0 // Unit: ms

    def use(ruleIdx: String, accountId: String) = _data += (ruleIdx -> (false, accountId))
    def success(ruleIdx: String) = _data.get(ruleIdx) match {
        case None => throw new IllegalArgumentException("Internal Error: Cannot find the key:" + ruleIdx)
        case Some(d) => _data.update(ruleIdx, (true, d._2))
    }
    //def updateCost(spent: Long) = cost += spent

    def combine(that: Track): Track = {
        val tr = new Track()
        tr._data = _data ++ that._data
        //tr.cost = cost + that.cost
        tr
    }
}

/**
  * 记录了：当使用白名单库解析某条记录时，经过 resolve_account 执行的轨迹
  * 包含：这条记录涉及多少次whitelist-attempt，每次attempt使用的ruleIdx、它最终是否成功找到account以及找到的account值
  */
class TerminalTrack extends Serializable {
    var _data = mutable.Map[String, (Boolean, AccountType, String)]() // <ruleIdX, is_success, accountType, value>

    def use(e: Tuple3[AccountType, String, String]) = _data += (e._3 -> (false, e._1, ""))

    def success(ruleIdx: String, value: String) = _data.get(ruleIdx) match {
        case None => throw new IllegalArgumentException("Internal Error: Cannot find the key:" + ruleIdx)
        case Some(d) => _data.update(ruleIdx, (true, d._2, value))
    }

    def combine(that: TerminalTrack) = {
        val tr = new TerminalTrack()
        tr._data = _data ++ that._data
        tr
    }

    override def toString: String = {
        if(_data.isEmpty) "Empty\n" else _data.map(x => {
            if(x._2._1)
                "successed ruleid: %s, type: %s, value: %s".format(x._1, x._2._2.toString, x._2._3)
            else
                "failed ruleid: %s, type: %s".format(x._1, x._2._2.toString)
        }).mkString("\n")
    }
}
