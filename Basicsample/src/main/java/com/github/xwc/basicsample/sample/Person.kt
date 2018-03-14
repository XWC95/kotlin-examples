package com.github.xwc.basicsample.sample

/**
 * Created by Administrator on 2018/3/13.
 */
class Person {
    var name: String = ""
        get() = field.toUpperCase()
        set(value) {
            field = "Name: $value"
        }
}