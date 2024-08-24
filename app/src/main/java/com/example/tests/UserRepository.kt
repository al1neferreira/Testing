package com.example.tests

import com.User

class UserRepository {
    fun getUserById(userId:String): User?{
        return User(userId, "Michelli Tatiane")
    }
}

