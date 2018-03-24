package com.github.xwc.basicsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.github.xwc.basicsample.adapter.ForecastListAdapter
import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.toast
import java.util.logging.Logger

class RecycleViewActivity : AppCompatActivity() {

    companion object {
        val log = Logger.getLogger(MainActivity::class.java.name)
    }

    private val items = listOf(
            "测试",
            "测试",
            "测试",
            "测试",
            "测试",
            "测试",
            "测试"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = ForecastListAdapter(items)


    }
}
