package com.ideal.adp.whitelist.tool

import scala.collection.mutable

object Utilities {

    def string2Map(given: String, sep1: String, sep2: String): mutable.Map[String, String] = {
        val res = mutable.Map[String, String]()
        for(x <- given.split(sep1); parts = x.split(sep2, 2); if(parts.length == 2)) {
            res += (parts(0) -> parts(1))
        }
        res
    }

    // 本方法是原地操作，given 必须非空
    def addToCascadingSetMap[A, B, C](given: mutable.Map[A, mutable.Map[B, mutable.Set[C]]], elemKey0: A, elemKey1: B, elemVal: C): Boolean = {
        if(given == null)
            throw new IllegalArgumentException("Given map cannot be null!")
        given.get(elemKey0) match {
            case None => {
                val inner = mutable.Map[B, mutable.Set[C]]()
                given += (elemKey0 -> inner)
                addToSetMap(inner, elemKey1, elemVal)
            }
            case Some(o) => addToSetMap(o, elemKey1, elemVal)
        }
    }

    // 本方法是原地操作，given 必须非空
    def addToSetMap[A, B](given: mutable.Map[A, mutable.Set[B]], elemKey: A, elemVal: B): Boolean = {
        if(given == null)
            throw new IllegalArgumentException("Given map cannot be null!")
        given.get(elemKey) match {
            case None => {
                given += (elemKey -> mutable.Set(elemVal))
                true
            }
            case Some(o) => {
                if(o.contains(elemVal)) false else {
                    o += elemVal
                    true
                }
            }
        }
    }

    // 本方法是原地操作，given 必须非空
    def addToMap[A, B, C](given: mutable.Map[A, mutable.Map[B, C]], elemKey0: A, elemKey: B, elemVal: C): Boolean = {
        if(given == null)
            throw new IllegalArgumentException("Given map cannot be null!")
        given.get(elemKey0) match {
            case None => {
                val inner = mutable.Map[B, C](elemKey -> elemVal)
                given += (elemKey0 -> inner)
                true
            }
            case Some(o) => {
                o.get(elemKey) match {
                    case None => o += (elemKey -> elemVal); true
                    case _ => false //
                }
            }
        }
    }

    def addToMap[A, B, C, D](given: mutable.Map[A, mutable.Map[B, mutable.Set[(C, D)]]], elemKey0: A, elemKey: B, elemVal0: C, elemVal1: D): Boolean = addToCascadingSetMap(given, elemKey0, elemKey, (elemVal0, elemVal1))

    def addToCascading2Map[A, B, C, D, E](given: mutable.Map[A, mutable.Map[B, mutable.Map[C, mutable.Set[(D, E)]]]], elemKey0: A, elemKey1: B, elemKey: C, elemVal0: D, elemVal1: E): Boolean = {
        if(given == null) {
            throw new IllegalArgumentException("Given map cannot be null!")
        }
        given.get(elemKey0) match {
            case None => {
                val inner = mutable.Map[B, mutable.Map[C, mutable.Set[(D, E)]]]()
                addToMap(inner, elemKey1, elemKey, elemVal0, elemVal1)
                given += (elemKey0 -> inner)
                true
            }
            case Some(h) => {
                addToMap(h, elemKey1, elemKey, elemVal0, elemVal1)
            }
        }
    }

    def addToCountMap[T](data: mutable.Map[T, Int], key: T, count: Int): Unit = {
        if(data == null) {
            throw new IllegalArgumentException("Cannot add element into an empty collection.")
        }
        data.get(key) match {
            case None => data += (key -> count)
            case Some(x) => data.put(key, x + count)
        }
    }

    def addToCountMap[T](data: mutable.Map[T, Long], key: T, count: Long): Unit = {
        if(data == null) {
            throw new IllegalArgumentException("Cannot add element into an empty collection.")
        }
        data.get(key) match {
            case None => data += (key -> count)
            case Some(x) => data.put(key, x + count)
        }
    }

    /**
      * 非原地操作，原始数据不变
      * @param data1
      * @param data2
      * @tparam T
      * @return
      */
    def combineCountMap[T](data1: Option[mutable.Map[T, Int]], data2: Option[mutable.Map[T, Int]]): Option[mutable.Map[T, Int]] = data1 match {
        case None => data2 match {
            case None => None
            case Some(data2x) => Some(mutable.Map[T, Int]() ++ data2x)
        }
        case Some(data1x) => data2 match {
            case None => Some(mutable.Map[T, Int]() ++ data1x)
            case Some(data2x) => {
                val r = mutable.Map[T, Int]()
                data1x.foreach( e => addToCountMap(r, e._1, e._2) )
                data2x.foreach( e => addToCountMap(r, e._1, e._2) )
                Some(r)
            }
        }
    }

    def isOctNumber(str: String) = !str.exists(x => x < 48 || x > 57)

    def isHexNumber(str: String) = !str.exists(x => x < 48 || x > 103 || (x > 57 && x < 65) || (x > 70 && x < 97))

}
