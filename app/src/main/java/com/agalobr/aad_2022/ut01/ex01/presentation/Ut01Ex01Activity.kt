package com.agalobr.aad_2022.ut01.ex01.presentation

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.agalobr.aad_2022.R
import com.agalobr.aad_2022.ut01.ex01.date.PreferenceLocalSource
import com.agalobr.aad_2022.ut01.ex01.date.SharedPreferenceLocalSource
import com.agalobr.aad_2022.ut01.ex01.domain.Customer

class Ut01Ex01Activity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_ut01ex01)
Log.d("@dev", "Newactivity")
        initSharedPreferences()
        initPreferences()
    }

    private fun initSharedPreferences(){
        //val spCustomer: SharedPreferenceLocalSource = SharedPreferenceLocalSource(this)
        val spCustomer = SharedPreferenceLocalSource(this)
        spCustomer.saveCustomer(
            Customer(1, "Customer1", "Surname1", true))

        ContextCompat.getColor(this, R.color.black)

        val newCustomer = spCustomer.getCustomer()
        Log.d("@dev", "Customer: $newCustomer")
    }
    private fun initPreferences(){
        val spCustomer = PreferenceLocalSource(this)
        spCustomer.saveCustomer(
            Customer(1, "Customer1", "Surname1", true))

        val newCustomer = spCustomer.getCustomer()
        Log.d("@dev", "Customer: $newCustomer")
    }
}