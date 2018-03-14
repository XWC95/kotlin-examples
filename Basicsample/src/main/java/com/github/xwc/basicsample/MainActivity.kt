package com.github.xwc.basicsample

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.github.xwc.basicsample.sample.Person
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity(), AnkoLogger {


    companion object {
        val log = Logger.getLogger(MainActivity::class.java.name)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        text.text = "你好，世界"

//        val tv = TextView(act)
//        tv.text = "DialogActivity"
//        tv.gravity = Gravity.CENTER
//        tv.setTextColor(Color.parseColor("#87CEEB"))
//        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f)
//        btn1.addView(tv, FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)

        //anko
        val textView: TextView = find(R.id.text)



       // UIThread有一个很不错的一点就是可以依赖于调用者。如果它是被一个Activity调用的，那么如果activity.isFinishing()返回true，则uiThread不会执行，这样就不会在Activity销毁的时候遇到崩溃的情况了。
//        asyncResult{
//            Request("").run()
//            uiThread { longToast("Request performed") }
//        }


        btn1.setOnClickListener {

            startActivity<DialogActivity>("id" to 5)
//            startActivity(intentFor<DialogActivity>("id" to 5).newTask())

//            makeCall("110")
//            makeCall(number) without tel:
//            Send a text	sendSMS(number, [text]) without sms:
//            Browse the web	browse(url)
//            Share some text	share(text, [subject])
//            Send a email	email(email, [subject], [text])

        }

        toast("Hello")

        val p = Person()
        p.name = "PersonName"
        log.info(p.name)


    }


    override fun onStart() {
        super.onStart()
        debug("onStar")
    }

    override fun onRestart() {
        super.onRestart()
        debug("onRestart")
    }

    override fun onResume() {
        super.onResume()
        debug("onResume")
    }

    override fun onStop() {
        super.onStop()
        debug("onStar")
    }

    override fun onPause() {
        super.onPause()
        debug("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        debug("onDestroy")
    }

}


