package com.agalobr.aad_2022.ut01.ex05.presentation

<<<<<<< HEAD
import android.content.Context
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
            UsersLocalDataSource(getPreferences(Context.MODE_PRIVATE)),
            UsersRemoteDataSource()
        )
        val users = userRepository.getUsers()
=======
            UsersLocalDataSource(),
            UsersRemoteDataSource()
        )
        val users = userRepository.getUser()
>>>>>>> origin/master
        Log.d("@dev","Users: $users")
    }
}