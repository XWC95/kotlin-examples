package com.github.xwc.basicsample.sample

import org.jetbrains.annotations.Nullable

/**
 * Created by Administrator on 2018/3/20.
 */
class C {
    var a: Int? = null
    fun test(a: Int) {

        this.a = a
        a!!.toString()
    }
    val test = NullTest()
    val myObject: Any = test.getObject()!!
}


