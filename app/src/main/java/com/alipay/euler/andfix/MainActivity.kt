package com.alipay.euler.andfix

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alipay.euler.andfix.test.A
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val TAG = "euler"

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, A.a("good"))
        Log.e(TAG, "" + A().b("s1", "s2"))
        Log.e(TAG, "" + A().getI())
    }

    override fun onDestroy() {
        super.onDestroy()
        android.os.Process.killProcess(android.os.Process.myPid())
    }
}
