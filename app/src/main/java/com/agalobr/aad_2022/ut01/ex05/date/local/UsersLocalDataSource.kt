package com.agalobr.aad_2022.ut01.ex05.date.local

import android.content.SharedPreferences
import com.agalobr.aad_2022.ut01.ex05.domain.User
import com.google.gson.Gson

class UsersLocalDataSource (val sharedPref: SharedPreferences){

    private val gson = Gson()

    fun saveUsers(user: User){
        //TODO
        val jsonUsers = gson.toJson(user, User::class.java)

        val edit = sharedPref.edit()
            edit.putString(user.id.toString(), jsonUsers)
            edit.apply()

    }

    fun getUsers(): List<User>{
        //TODO
        return emptyList()
    }

    fun findById(userId: Int): User{
        //TODO return a user
    }

    fun remove(userId: Int){
        //TODO
    }
}