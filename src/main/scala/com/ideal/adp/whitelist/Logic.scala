package com.ideal.adp.whitelist

import MethodType.MethodType
import com.ideal.adp.whitelist.account.AccountType.AccountType

import scala.collection.mutable.ListBuffer
import scala.util.matching.Regex

object LogicDefine {
    type Logic = List[(MethodType, Any)]

    def logicGenerator(logic: Logic) = new LogicGenerator(logic)
    def logicGenerator() = new LogicGenerator(Nil)
    def multiLogicGenerator() = new MultiLogicGenerator()

    class LogicGenerator(private var rules: Logic) {
        var logic = if(rules.isEmpty) List() else rules // Logic can be acquired from the outside

        private def add (ag: Logic, methodType: MethodType, unknown: => Any): Logic =
            if (ag.isEmpty) ((methodType, unknown) :: ag) else ag.head :: add(ag.tail, methodType, unknown)

        //add custom method
        def -> [A, B](func0: => A => B): LogicGenerator = insert(MethodType.CUSTOM, func0)
        def add[A, B](func0: => A => B): LogicGenerator = ->(func0)

        private def insert[A, B] (methodType: MethodType, unknown: => Any) = {
            logic = add(logic, methodType, unknown)
            this
        }

        def feature(key: String) = insert(MethodType.LIB_FEATURE, key) // speed up the feature-finding process
        def find[A, B](key: A) = insert(MethodType.LIB_FIND, key)
        def filter(key: String) = insert(MethodType.LIB_FILTER, key)
        def urlDecode() = insert(MethodType.LIB_URLDECODE, None)
        def urlEncode() = insert(MethodType.LIB_URLENCODE, None)
        def regex() = insert(MethodType.LIB_REGEX, None) // 仅限于终端白名单logic使用，以允许动态添加regex
        def regex(regexet: (Regex, Int)) = insert(MethodType.LIB_REGEX, regexet)
        def regex(regexet: Regex, len: Int) = insert(MethodType.LIB_REGEX, (regexet, len))
        def regexStrict() = insert(MethodType.LIB_REGEX_STRICT, None) // 仅限于终端白名单logic使用，以允许动态添加regex
        def regexStrict(regexet: (Regex, Int)) = insert(MethodType.LIB_REGEX_STRICT, regexet)
        def regexStrict(regexet: Regex, len: Int) = insert(MethodType.LIB_REGEX_STRICT, (regexet, len))
        def split(delimiter: String, index: Int, minLen: Int = -1) = insert(MethodType.LIB_SPLIT, (delimiter, index, minLen))
        def splitComfort(delimiter: String, index: Int, len: Int) = insert(MethodType.LIB_SPLIT_COMFORT, (delimiter, index, len))
        def replace(oldSub: String, newSub: String) = insert(MethodType.LIB_REPLACE, (oldSub, newSub))
        def stringToMap(sep1: String, sep2: String) = insert(MethodType.LIB_STRING_TO_MAP, (sep1, sep2))
        def jsonToMap() = insert(MethodType.LIB_JSON_TO_MAP, None)
        def toLowerCase() = insert(MethodType.LIB_LOWER_CASE, None)
        def len(min: Int, max: Int) = insert(MethodType.LIB_LEN, (min, max))
        def subStringX(index: Int, len: Int) = insert(MethodType.LIB_SUBSTRING, (index, len))
        def reverse() = insert(MethodType.LIB_REVERSE, None)
        def contains(key: String) = insert(MethodType.LIB_CONTAINS, key)
        def notContains(key: String) = insert(MethodType.LIB_NOT_CONTAINS, key)
        def format(acType: AccountType) = insert(MethodType.LIB_FORMAT, acType)
        def release() = logic = Nil

    }

    /**
      * 函数分为2类：
      * 强数量一致性：对 N 有一定要求，可以位于Logic链的开头
      * 弱数量一致性：对 N 没有要求，必须位于Logic链的中间或末尾
      */
    class MultiLogicGenerator {
        private val gens: ListBuffer[LogicGenerator] = ListBuffer()
        private var N: Int = -1

        // 强数量一致性
        def feature(keys: Array[String]) = {
            if (N < 0) {
                N = keys.length
                for(i <- 0 until N) {
                    gens += LogicDefine.logicGenerator()
                }
            }
            if (N != keys.length) throw new IllegalArgumentException("Cannot apply find[] function, " +
              "because of unexpected generators' number: " + keys + " as expected:" + N)
            for(i <- 0 until N) {
                gens(i) feature(keys(i))
            }
            this
        }

        // 弱数量一致性
        def find[A, B](key: A) = {err();for (i <- 0 until N) gens(i).find(key);this}
        def filter(key: String) = {err();for (i <- 0 until N) gens(i).filter(key);this}
        def urlDecode() = {err();for (i <- 0 until N) gens(i).urlDecode();this}
        def urlEncode() = {err();for (i <- 0 until N) gens(i).urlEncode();this}
        def regex(regexet: (Regex, Int)) = {err();for (i <- 0 until N) gens(i).regex(regexet);this}
        def regex(regexet: Regex, len: Int) = {err();for (i <- 0 until N) gens(i).regex(regexet, len);this}
        def regexStrict(regexet: (Regex, Int)) = {err();for (i <- 0 until N) gens(i).regexStrict(regexet);this}
        def regexStrict(regexet: Regex, len: Int) = {err();for (i <- 0 until N) gens(i).regexStrict(regexet, len);this}
        def split(delimiter: String, index: Int) = {err();for (i <- 0 until N) gens(i).split(delimiter, index);this}
        def splitComfort(delimiter: String, index: Int, len: Int) = {err();for(i <- 0 until N) gens(i).splitComfort(delimiter, index, len);this}
        def replace(oldSub: String, newSub: String) = {err();for(i <- 0 until N) gens(i).replace(oldSub, newSub);this}
        def stringToMap(sep1: String, sep2: String) = {err();for(i <- 0 until N) gens(i).stringToMap(sep1, sep2);this}
        def jsonToMap() = {err();for(i <- 0 until N) gens(i).jsonToMap();this}

        def add[A, B](func0: => A => B) = {err();for (i <- 0 until N) gens(i).add(func0);this}

        private def err() = {
            if (N < 0) throw new IllegalArgumentException("Cannot apply the function, " +
              "because of the undetermined logic chain number")
        }

        def make() = {err();gens.toList}

        def release() = {
            gens.clear()
            N = -1
        }
    }

    def md5Hash(text:String):String =
        java.security.MessageDigest.getInstance("MD5").digest(text.getBytes()).map(0xFF & _).map{"%02x".format(_)}.foldLeft(""){_+_}
    def signature(logic: Logic) = if(logic.isEmpty) "" else {
        var res = ""
        for( o <- logic.map(x => {
            val o1 = md5Hash(x._1.toString())
            val o2 = if(x._2 == None) "" else md5Hash(x._2.toString)
            md5Hash(o1 + o2)
        })) {
            res = md5Hash(res + o)
        }
        res
    }
}

