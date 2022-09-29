package com.agalobr.aad_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.agalobr.aad_2022.ut01.ex01.date.SharedPreferenceLocalSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("@dev", "Newactivity")

    }
}