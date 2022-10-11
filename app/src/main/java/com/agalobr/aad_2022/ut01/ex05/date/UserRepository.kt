package com.agalobr.aad_2022.ut01.ex05.date


import com.agalobr.aad_2022.ut01.ex05.date.local.UsersLocalDataSource
import com.agalobr.aad_2022.ut01.ex05.date.remote.UsersRemoteDataSource
import com.agalobr.aad_2022.ut01.ex05.domain.User

class UserRepository (
    val localSource: UsersLocalDataSource,
    val remoteSource: UsersRemoteDataSource
    ){

    /**
     * First from local and then from remote
     **/

    fun getUsers(): List<User> {
        var users= localSource.getUsers()
        if(users.isEmpty()){
            users= remoteSource.getUsers()
            localSource.saveUsers(users)
        }
        return users
    }

    fun getUserById(userId: Int) : User{
        //TODO: verificar en local si no en remote
        var userById= localSource.findById(userId)
        if(userById == null){
            userById= remoteSource.getUser(userId)
            localSource.saveUser(userById)
        }
        return userById
    }

    fun removeUser(removeUserId: Int){
        //TODO (local)
        localSource.remove(removeUserId)
    }
}