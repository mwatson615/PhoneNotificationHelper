package com.rosebay.phonenotificationhelper

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyManager
import android.util.Log
import android.view.View
import android.widget.Switch
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val phoneManager : TelephonyManager by lazy { createTelephonyManager() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchButton.setOnClickListener(this)

    }

    override fun onClick(v : View) {
        if (switchButton.isChecked) {
            Log.i("switch clicked", ": you selected me")
        }
        else {
            Log.i("switch clicked", ": you deselected me")
        }
    }

    fun setVibrate(selected : Boolean) {

    }

    private fun createTelephonyManager () : TelephonyManager {
        return getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
    }

}
