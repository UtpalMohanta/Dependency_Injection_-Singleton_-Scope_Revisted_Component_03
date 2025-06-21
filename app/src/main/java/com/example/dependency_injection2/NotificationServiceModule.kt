package com.example.dependency_injection2

import com.example.dependency_injection2.EmailService.MessageService
import com.example.dependency_injection2.EmailService.NotificationService
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

class NotificationServiceModule {

    @Singleton /*or*/ @ApplicationScope

    @messageQulifier
    @Provides
    fun getMessageService(retryCount:Int):NotificationService
    {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(): EmailService
    {
        return EmailService()
    }


}