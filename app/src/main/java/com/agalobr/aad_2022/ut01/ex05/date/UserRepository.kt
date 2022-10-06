package com.agalobr.aad_2022.ut01.ex05.date


import com.agalobr.aad_2022.ut01.ex05.date.local.UsersLocalDataSource
import com.agalobr.aad_2022.ut01.ex05.date.remote.UsersRemoteDataSource
import com.agalobr.aad_2022.ut01.ex05.domain.User

class UserRepository (
    val localSource: UsersLocalDataSource,
<<<<<<< HEAD
    val remoteSource: UsersRemoteDataSource
    ){
=======
    val remoteSource: UsersRemoteDataSource){
>>>>>>> origin/master

    /**
     * First from local and then from remote
     **/

<<<<<<< HEAD
    fun getUsers(): List<User>{
=======
    fun getUser(): List<User>{
>>>>>>> origin/master
        var users= localSource.getUsers()
        if(users == null){
            users= remoteSource.getUsers()
            localSource.saveUsers(users)
        }
        return users
    }

<<<<<<< HEAD
    //fun getUserById(userId: Int) : User{
        //TODO: verificar en local sino en remote
    //}
=======
    fun getUserById(userId: Int) : User{
        //TODO: verificar en local sino en remote
    }
>>>>>>> origin/master

    fun removeUser(userId: Int){
        //TODO (local)
    }
}