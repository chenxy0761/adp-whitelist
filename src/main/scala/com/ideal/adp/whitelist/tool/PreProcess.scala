package com.ideal.adp.whitelist.tool

import sun.misc.{BASE64Decoder, BASE64Encoder}

trait PreProcess[T] {
    protected val base64encoder = new BASE64Encoder
    protected val base64decoder = new BASE64Decoder
    def make(line: String): Option[T]
}


