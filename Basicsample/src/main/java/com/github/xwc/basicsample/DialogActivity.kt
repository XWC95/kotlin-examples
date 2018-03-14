package com.github.xwc.basicsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.alert

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        alert("message", intent.extras.getInt("id").toString()).show()
    }
}
