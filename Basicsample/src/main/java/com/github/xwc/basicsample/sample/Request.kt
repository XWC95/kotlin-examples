package com.github.xwc.basicsample.sample

import android.util.Log
import java.net.URL

/**
 * Created by Administrator on 2018/3/13.
 */
class Request(val url: String) {
    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}