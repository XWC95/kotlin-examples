package com.github.xwc.basicsample.sample

import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

/**
 * Created by xwc on 2018/3/13.
 */
class B(name: String) : A(name) {

    fun add3(x: Int, y: Int): Int = add2(x, y)

    val x = arrayListOf<String>("", "", "")
    val intList = 1
    var days = 1
    val specialValues = 1..2
    val res = if (x.size >= days) x else null

    //    val z = if(condition) x else y
    fun testWhen(view: View) {
        when (view) {
            is TextView -> view.setText("I'm a TextView")
            is EditText -> view.setText("I'm a TextView")
            is ViewGroup -> view.visibility = View.VISIBLE
            else -> view.visibility = View.GONE
        }
    }

    val cost = when (intList) {
        in 1..10 -> "cheap"
        in 10..100 -> "regular"
        in 100..1000 -> "expensive"
        in specialValues -> "special value!"
        else -> "not rated"
    }

    fun testFor() {
        for (item in x) {
            print(item)
        }

        for (index in 0..x.size - 1) {
            val view = x.get(index)
            val a = i + index
        }
    }

    fun testWhile(){
        while(days > 0){
            days--
        }
        do{
            val y = days
        } while (y != null)
    }




}