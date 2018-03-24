package com.github.xwc.basicsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.TypedValue
import android.view.Gravity
import android.widget.FrameLayout
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

        val tv = TextView(act)
        tv.text = "跳转RecycleView"
        tv.gravity = Gravity.CENTER
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17f)
        btn2.addView(tv, FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)

        //anko
        val textView: TextView = find(R.id.text)



       // UIThread有一个很不错的一点就是可以依赖于调用者。如果它是被一个Activity调用的，那么如果activity.isFinishing()返回true，则uiThread不会执行，这样就不会在Activity销毁的时候遇到崩溃的情况了。
//        asyncResult{
//            Request("").run()
//            uiThread { longToast("Request performed") }
//        }


        btn1.setClickListener {

            startActivity<DialogActivity>("id" to 5)
//            startActivity(intentFor<DialogActivity>("id" to 5).newTask())

//            makeCall("110")
//            makeCall(number) without tel:
//            Send a text	sendSMS(number, [text]) without sms:
//            Browse the web	browse(url)
//            Share some text	share(text, [subject])
//            Send a email	email(email, [subject], [text])
        }

        btn2.setClickListener {
            startActivity<RecycleViewActivity>()
        }

        toast("Hello")

        val p = Person()
        p.name = "PersonName"
        log.info(p.name)


    }


    override fun onStart() {
        super.onStart()
        info("onStar")
    }

    override fun onRestart() {
        super.onRestart()
        info("onRestart")
    }

    override fun onResume() {
        super.onResume()
        info("onResume")
    }

    override fun onStop() {
        super.onStop()
        info("onStar")
    }

    override fun onPause() {
        super.onPause()
        info("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        info("onDestroy")
    }



}


