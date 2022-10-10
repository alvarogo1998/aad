package com.agalobr.aad_2022.ut01.ex05.date.local

import android.content.SharedPreferences
import com.agalobr.aad_2022.ut01.ex03.domain.News
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
        val userList = mutableListOf<User>()
        sharedPref.all.forEach { entry ->
            val users = gson.fromJson(entry.value as String, User::class.java)
            userList.add(users)
        }
        return userList
    }

    fun findById(userId: Int): User{
        val jsonUser = sharedPref.getString(userId.toString(),"")
        return gson.fromJson(jsonUser, User::class.java)
    }

    fun remove(userId: Int){
        //TODO
    }
}
