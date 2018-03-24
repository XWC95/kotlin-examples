package com.github.xwc.basicsample.sample

import java.util.*

/**
 *
 * Created by xwc on 2018/3/13.
 */
open class A(name: String) {
    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun test(x :Int) :Int? {
        return  x
    }

    fun add2(x: Int, y: Int): Int = x + y

    val i = 12 // An Int
    val iHex = 0x0f // 一个十六进制的Int类型
    val l = 3L // A Long
    val d = 3.5 // A Double
    val f = 3.5F // A Float

    val str = "Example"
    val c = str[2] // 这是一个字符'a'
    // 迭代String
    val str2 = "Example"

    fun print() {
        for (c in str2) {
            print(c)
        }
    }
    val f1 = forecast(Date(), 27.5f, "Shiny day")


}