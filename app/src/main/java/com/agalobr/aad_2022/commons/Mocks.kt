package com.agalobr.aad_2022.commons

import com.agalobr.aad_2022.ut01.ex05.domain.User
import com.agalobr.aad_2022.ut01.ex06.domain.Address
import com.agalobr.aad_2022.ut01.ex06.domain.Company
import com.agalobr.aad_2022.ut01.ex06.domain.Geo
import com.agalobr.aad_2022.ut01.ex06.domain.Users

class Mocks {

    /**
    * Estáticos
     */
    companion object {

        fun getUsers(): List<Users> {
            //Mocks data
            return mutableListOf(
                Users(1, "User1", "Username1", "email1@email.com", Address("street1", "suite1","city1","zipcode1",
                    Geo(1,1)),"phone1","website1", Company("Company1","Phrase1","bs1")),
            )
        }
    }
}