package com.ideal.adp.whitelist.tool

import java.net.{MalformedURLException, URL}

object UriParser {
    private val LEVEL_DOMAIN_SET = List(".com.cn", ".net.cn", ".org.cn", ".gov.cn", ".com", ".net",
        ".org", ".cn", ".info", ".name", ".biz", ".cc", ".tv", ".mobi", ".hk")

    def getDomain(urlLike: Option[String]) = getHost(urlLike) match {
        case None => None
        case Some(host) => {
            val domains = for( level <- LEVEL_DOMAIN_SET; index = host.lastIndexOf(level)) yield {
                 {
                     if(index != - 1) {
                         val c1 = host.substring(0, index)
                         val i = c1.lastIndexOf(".")
                         if(i == -1) host else host.substring(i, host.length)
                     } else {
                         val parts = host.split("\\.")
                         if (parts.length >= 3) parts(parts.length - 2) + "." + parts(parts.length - 1) else host
                     }
                }
            }
            if(domains.isEmpty) None else Some(domains(0))
        }

    }

    private def findIndex(levelDomain: String, url: String) = {
        url.lastIndexOf(levelDomain)
    }

    def getHost(urlLike: Option[String]) = urlLike match {
        case None => None
        case Some(urlLikely) => {
            val fullUrl = if (urlLikely.indexOf("http://") != 0) "http://" + urlLikely else urlLikely
            try {
                val host = new URL(fullUrl).getHost
                if(host == null || host.isEmpty) None else Some(host)
            } catch {
                case e: MalformedURLException => None
            }
        }
    }

    def getQuery(urlLike: Option[String]) = urlLike match {
        case None => None
        case Some(urlLikely) => {
            val fullUrl = if (urlLikely.indexOf("http://") != 0) "http://" + urlLikely else urlLikely
            try {
                val query = new URL(fullUrl).getQuery
                if(query == null || query.isEmpty) None else Some(query)
            } catch {
                case e: MalformedURLException => None
            }
        }
    }

    def main(args: Array[String]): Unit = {
        val sss = "jjj.baidu.tr/fcueive/rvrr?name=1&uiopn=2deew"
        // println(getHost(Some(sss)))
        println(getDomain(Some(sss)))
    }
}
