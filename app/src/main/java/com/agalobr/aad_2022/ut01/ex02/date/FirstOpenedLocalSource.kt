package com.agalobr.aad_2022.ut01.ex02.date

import android.content.Context
import com.agalobr.aad_2022.R
import com.agalobr.aad_2022.ut01.ex02.domain.FirstOpened

const val KEY_IS_FIRST_OPENED = "is_first_opened"

class FirstOpenedLocalSource (context: Context){

    val sharedPref = context.getSharedPreferences(
        context.getString(R.string.preference_ut01ex02), Context.MODE_PRIVATE)

    fun saveCustomer(customer: FirstOpened){
        val editor = sharedPref.edit()
        editor.apply{
            putBoolean(KEY_IS_FIRST_OPENED, customer.isActive)
            apply()
        }
    }
    fun getCustomer(): FirstOpened{
        return FirstOpened(
            sharedPref.getBoolean(KEY_IS_FIRST_OPENED, true)
        )
    }
}