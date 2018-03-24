package com.github.xwc.basicsample

import com.github.xwc.basicsample.sample.list
import junit.framework.Assert
import org.junit.Test

/**
 * Created by xwc on 2018/3/15.
 */
class MyAppTest {

    @Test
    fun MyTest(){
        Assert.assertEquals(6, list.last { it % 2 == 0 })
    }
}