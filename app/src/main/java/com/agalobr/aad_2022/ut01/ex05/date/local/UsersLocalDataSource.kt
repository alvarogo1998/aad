package com.agalobr.aad_2022.ut01.ex05.date.local

import android.content.SharedPreferences
import com.agalobr.aad_2022.ut01.ex05.domain.User
import com.google.gson.Gson


class UsersLocalDataSource (val sharedPref: SharedPreferences){

    private val gson = Gson()

    fun saveUsers(users: List<User>) {
        users.forEach {
            saveUser(it)
        }
    }
    fun saveUser(user: User){
        val jsonUsers = gson.toJson(user, User::class.java)
        val edit = sharedPref.edit()
        edit.putString(user.id.toString(), jsonUsers)
        edit.apply()
    }

    fun getUsers(): List<User>{
        val users = mutableListOf<User>()
        sharedPref.all.forEach { entry ->
            users.add( gson.fromJson(entry.value as String, User::class.java))
        }
        return users
    }

    fun findById(userId: Int): User?{
        val user: String? = sharedPref.getString(userId.toString(), null)
        return user?.let {
            gson.fromJson(it, User::class.java)
        }
    }

    fun remove(removeUserId: Int){
        sharedPref.edit().remove(removeUserId.toString())
    }
}
