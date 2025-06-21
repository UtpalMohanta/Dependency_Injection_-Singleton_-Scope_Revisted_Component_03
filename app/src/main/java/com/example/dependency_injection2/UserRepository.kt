package com.example.dependency_injection2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun SaveUser(email:String,password:String)
}

@Singleton
class SQLRepository @Inject constructor(val analyticService: AnalyticService): com.example.dependency_injection2.UserRepository {
    override fun SaveUser(email:String, password:String)
    {
        Log.d("utpal","User saved in Database")
    }
}
class FirebaseRepository(val analyticService: AnalyticService): com.example.dependency_injection2.UserRepository
{
    override fun SaveUser(email: String, password: String) {
        Log.d("utpal","User saved in Firebase")

    }

}