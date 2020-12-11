package com.aavn.sessions

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Sessions : AppCompatActivity(), OnDataPass {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessions)
    }
    override fun onDataPass(data: String) {
        val intent = intent
        intent.putExtra("data", data)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}