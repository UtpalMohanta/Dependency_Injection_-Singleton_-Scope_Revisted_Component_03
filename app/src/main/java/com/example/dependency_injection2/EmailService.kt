package com.example.dependency_injection2

import android.util.Log
import jakarta.inject.Singleton
import javax.inject.Inject
import javax.inject.Singleton

class EmailService {
    interface NotificationService{
        fun send(to:String,from:String,body:String)
    }

    @ApplicationScope
    //@Singleton
    class EmailService @Inject constructor():NotificationService{
        override fun send(to:String, from:String, body:String)
        {
            Log.d("Utpal1","Email sent")
        }
    }
    class MessageService(private val retryCount:Int):NotificationService{
        override fun send(to: String, from: String, body: String) {
            Log.d("Utpal1","Messagee sent")
        }

    }
}