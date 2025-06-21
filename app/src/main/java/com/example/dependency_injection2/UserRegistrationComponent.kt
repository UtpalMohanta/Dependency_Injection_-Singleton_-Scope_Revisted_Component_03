package com.example.dependency_injection2

import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class, AnalyticModule::class])

interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    fun getEmailServices(): EmailService
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int): com.example.dependency_injection2.UserRegistrationComponent
    }
}