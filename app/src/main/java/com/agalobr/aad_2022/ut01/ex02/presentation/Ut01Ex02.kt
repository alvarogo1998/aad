package com.agalobr.aad_2022.ut01.ex02.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.agalobr.aad_2022.R

class Ut01Ex02 : AppCompatActivity() {

    var isFirstOpened = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex02)

        Log.d("@dev", "Aplicacion abierta: $isFirstOpened")

        isFirstOpened = true

        var variable = 1
        if (variable == 1){

        }else{

        }
    }
}