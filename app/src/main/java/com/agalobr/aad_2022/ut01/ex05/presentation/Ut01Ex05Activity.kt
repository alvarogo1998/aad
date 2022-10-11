package com.agalobr.aad_2022.ut01.ex05.presentation

import android.content.Context

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.agalobr.aad_2022.R
import com.agalobr.aad_2022.ut01.ex05.date.UserRepository
import com.agalobr.aad_2022.ut01.ex05.date.local.UsersLocalDataSource
import com.agalobr.aad_2022.ut01.ex05.date.remote.UsersRemoteDataSource

class Ut01Ex05Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex05)

        init()
    }
    private fun init(){
        //Obtain all users from data layer
        val userRepository = UserRepository(
            UsersLocalDataSource(this.getPreferences(MODE_PRIVATE)),
            UsersRemoteDataSource()
        )

        val users = userRepository.getUsers()
        Log.d("@dev","Users: $users")

        val userById =userRepository.getUserById(3)
        Log.d("@dev", "User: $userById")

        val removeById =userRepository.removeUser(2)
        Log.d("@dev", "User: $removeById")
    }
}