package com.example.tests

class UserService(private val userRepository: UserRepository) {

    fun getUserName(userId:String): String{
        val user = userRepository.getUserById(userId)
        return user?.name?:"Unknown User"
    }
}