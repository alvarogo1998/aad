package com.agalobr.aad_2022.ut01.ex06.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.agalobr.aad_2022.R
import com.agalobr.aad_2022.ut01.ex06.date.local.UsersSource
import com.agalobr.aad_2022.ut01.ex06.domain.Address
import com.agalobr.aad_2022.ut01.ex06.domain.Company
import com.agalobr.aad_2022.ut01.ex06.domain.Geo
import com.agalobr.aad_2022.ut01.ex06.domain.Users

class Ut01Ex06Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex05)

        init()
    }
    private fun init(){
        val usersSource = UsersSource(
            getPreferences(Context.MODE_PRIVATE)
        )
        val user1 = Users(1, "User1", "Username1", "1111@email.com", Address("street1", "suite1","city1","zipcode1",
                Geo(1,1)
            ),"phone1","website1", Company("Company1","Phrase1","bs1"))
        val user2 = Users(2, "User2", "Username2", "2222@email.com", Address("street2", "suite2","city2","zipcode2",
                Geo(2,2)
            ),"phone2","website2", Company("Company2","Phrase2","bs2"))
        usersSource.saveUser(user1)
        usersSource.saveUser(user2)
        
    }
}