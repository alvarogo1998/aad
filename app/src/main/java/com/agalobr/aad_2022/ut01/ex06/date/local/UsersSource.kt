package com.agalobr.aad_2022.ut01.ex06.date.local

import android.content.SharedPreferences
import com.agalobr.aad_2022.ut01.ex06.domain.Users
import com.google.gson.Gson

class UsersSource (val sharedPref: SharedPreferences) {
    private val gson = Gson()

    fun saveUsers(users: List<Users>) {
        users.forEach {
            saveUser(it)
        }
    }

    fun saveUser(user: Users){
        val jsonUsers = gson.toJson(user, Users::class.java)
        val edit = sharedPref.edit()
        edit.putString(user.id.toString(), jsonUsers)
        edit.apply()
    }

    fun getUsers(): List<Users>{
        val users = mutableListOf<Users>()
        sharedPref.all.forEach { entry ->
            users.add( gson.fromJson(entry.value as String, Users::class.java))
        }
        return users
    }

}