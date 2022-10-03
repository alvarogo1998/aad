package com.agalobr.aad_2022.ut01.ex02.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.agalobr.aad_2022.R
import com.agalobr.aad_2022.ut01.ex02.date.FirstOpenedLocalSource
import com.agalobr.aad_2022.ut01.ex02.domain.FirstOpened

class Ut01Ex02 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex02)

        initFirstTimeOpened()
    }

    private fun initFirstTimeOpened() {
        val localSource = FirstOpenedLocalSource(this)
        infoAppOpened(localSource.getCustomer())
        localSource.saveCustomer(FirstOpened(false))
    }

    private fun infoAppOpened(firstOpened: FirstOpened) {
        if (firstOpened.isActive){
            Log.d("@dev","Es la primera vez que se habre la aplicacion:${firstOpened.isActive}")
        }else{
            Log.d("@dev","La aplicacion ya se ha abierto mas veces")
        }
    }
}