package com.aavn.sessions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Sessions : AppCompatActivity(), OnDataPass {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessions)
    }
    override fun onDataPass(data: String) {
        Log.d("LOG","hello " + data)
    }
}