package com.ideal.adp.whitelist

import java.net.{URLDecoder, URLEncoder}

import com.ideal.adp.whitelist.tool.Utilities
import com.ideal.adp.whitelist.LogicDefine.Logic
import com.ideal.adp.whitelist.account.AccountType
import com.ideal.adp.whitelist.account.AccountType.AccountType

import scala.collection.mutable
import scala.util.matching.Regex
import org.json4s._
import org.json4s.jackson.JsonMethods._

class Simulation(raw: String, kvFunction: (String => mutable.Map[String, String]), private val rules: Logic, safe: Boolean) {
    val logic = rules
    val datax = raw
    val kvFunc = kvFunction
    var currentData: Option[Any] = if(raw == null || raw.isEmpty) None else Some(datax)

    def this(raw: String, kvFunction: (String => mutable.Map[String, String]), rules: Logic) = this(raw, kvFunction, rules, false)

    def run(): Any = {
        val tmp = if(logic.isEmpty) None else {
            for( (methodType, c) <- logic; if (currentData.isDefined)) {
                val curData = currentData.get
                (methodType, c, curData) match {
                    case (_, _, null) => currentData = None
                    case (MethodType.CUSTOM, func: (Any => Option[Any]), dt: Any) => {
                        try {
                            currentData = func(dt)
                        } catch {
                            case ex: Exception => {
                                ex.printStackTrace()
                                currentData = None
                            }
                        }
                    }
                    // speed up the feature-finding process
                    case (MethodType.LIB_FEATURE, key: String, dt: String) => currentData = if (! dt.contains(key)) None else kvFunc(dt).get(key)
                    case (MethodType.LIB_FIND, key: String, dt: mutable.Map[String, Any]) => currentData = dt.get(key)
                    case (MethodType.LIB_FIND, key: String, dt: Map[String, Any]) => currentData = dt.get(key)
                    case (MethodType.LIB_FILTER, key: String, dt: String) => currentData = if(dt == key) None else Some(dt)
                    case (MethodType.LIB_URLDECODE, None, dt: String) => currentData =
                        try {
                            Some(URLDecoder.decode(dt, "utf-8"))
                        } catch {
                            case ex: Exception => Some(dt)
                        }
                    case (MethodType.LIB_URLENCODE, None, dt: String) => currentData = {
                        try {
                            Some(URLEncoder.encode(dt, "utf-8"))
                        } catch {
                            case ex: Exception => None
                        }
                    }
                    case (MethodType.LIB_REGEX, regexet: Tuple2[Regex, Int], dt: String) => {
                        val mask = regexet._1.findAllIn(dt).toArray
                        currentData = if(mask.isEmpty) None /*else if (mask.size == 1) Some(mask(0))*/ else Some(mask(0))
                    }
                    case (MethodType.LIB_REGEX_STRICT, regexet: Tuple2[Regex, Int], dt: String) => {
                        currentData = if(regexet._2 != dt.length) None else {
                            val mask = regexet._1.findAllIn(dt).toArray
                            if(mask.isEmpty) None /*else if (mask.size == 1) Some(mask(0))*/ else Some(mask(0))
                        }
                    }
                    case (MethodType.LIB_SPLIT, delimext: Tuple3[String, Int, Int], dt: String) => {
                        val parts = dt.split(delimext._1, -1)
                        currentData = if (delimext._3 >= 1 && parts.length != delimext._3) None else
                            if (parts.length < (delimext._2 + 1)) None else
                            if(parts(delimext._2).trim() == "") None else Some(parts(delimext._2).trim())
                    }
                    case (MethodType.LIB_SPLIT_COMFORT, delimext: Tuple3[String, Int, Int], dt: String) => {
                        val parts = dt.split(delimext._1, delimext._3)
                        currentData = if(delimext._3 <= delimext._2) None else if(parts.length != delimext._3) None else
                            if(parts(delimext._2).trim() == "") None else Some(parts(delimext._2).trim())
                    }
                    case (MethodType.LIB_REPLACE, substance: Tuple2[String, String], dt: String) => currentData = Some(dt.replace(substance._1, substance._2))
                    case (MethodType.LIB_STRING_TO_MAP, seps: Tuple2[String, String], dt: String) => currentData = Some(Utilities.string2Map(dt, seps._1, seps._2))
                    case (MethodType.LIB_JSON_TO_MAP, None, dt: String) => currentData = {
                        implicit val formats = org.json4s.DefaultFormats
                        val mm = try {
                            Extraction.extract[Map[String, Any]](parse(dt))
                        } catch {
                            case ex: Exception => Map[String, Any]()
                        }
                        if(mm.isEmpty) None else Some(mm)
                    }
                    case (MethodType.LIB_LOWER_CASE, None, dt: String) => currentData = Some(dt.toLowerCase())
                    case (MethodType.LIB_LEN, lens: Tuple2[Int, Int], dt: String) => currentData =
                        if(dt.length >= lens._1 && dt.length <= lens._2) Some(dt) else None
                    case (MethodType.LIB_SUBSTRING, tmp: Tuple2[Int, Int], dt: String) => currentData = {
                        if(tmp._1 >= 0 && dt.length >= tmp._1 + tmp._2 + 1) Some(dt.substring(tmp._1, tmp._1 + tmp._2 + 1))
                        else if(tmp._1 < 0 && dt.length >= Math.abs(tmp._1) + tmp._2) Some(dt.substring(dt.length - Math.abs(tmp._1) - tmp._2 + 1, dt.length - Math.abs(tmp._1) + 1))
                        else None
                    }
                    case (MethodType.LIB_REVERSE, None, dt: String) => currentData = Some(dt.reverse)
                    case (MethodType.LIB_CONTAINS, key: String, dt: String) => currentData = if(dt.contains(key)) Some(dt) else None
                    case (MethodType.LIB_NOT_CONTAINS, key: String, dt: String) => currentData = if(dt.contains(key)) None else Some(dt)

                    // 1.判断[长度15位 10进制；长度14位 16进制]
                    // 2.转小写
                    case (MethodType.LIB_FORMAT, AccountType.IMEI, dt: String) => currentData = {
                        if(dt.length == 14 && Utilities.isHexNumber(dt)) Some(dt.toLowerCase)
                        else if(dt.length == 15 && Utilities.isOctNumber(dt)) Some(dt.toLowerCase)
                        else None
                    }

                    case (MethodType.LIB_FORMAT, AccountType.MAC, dt: String) => currentData = {
                        val dtx = if(dt.contains("%")) {
                            val tmp = try {
                                Some(URLDecoder.decode(dt, "utf-8"))
                            } catch {
                                case ex: Exception => None
                            }
                            tmp match {
                                case None => None
                                case Some(d) => if(d.length != 17) None else Some(d)
                            }
                        } else Some(dt)
                        val dtx2 = dtx match {
                            case None => None
                            case Some(d) => if(d.length == 17) Some(d.replaceAll("[" + d.charAt(2) + "]", "")) else Some(d)
                        }
                        dtx2 match {
                            case None => None
                            case Some(d) => if(d.length == 12 && Utilities.isHexNumber(d)) Some(d.toLowerCase) else None
                        }
                    }

                    case (MethodType.LIB_FORMAT, AccountType.IDFA, dt: String) => currentData = if(dt.length == 36) Some(dt.toLowerCase) else None
                    case (MethodType.LIB_FORMAT, AccountType.ANDROIDID, dt: String) => currentData = if(dt.length >=10 && dt.length <=40) Some(dt.toLowerCase) else None
                    // case (MethodType.LIB_FORMAT, AccountType.MDN, dt: String) => currentData =
                    case _ => throw new IllegalArgumentException("Not the valid method type! Its info: MethodType=" + methodType + ", givenConference=" + c + ", currentData=" + curData)
                }
            }
            currentData
        }
        tmp match {
            case None => null
            case Some(res) => res
            case _ => tmp
        }
    }

}
