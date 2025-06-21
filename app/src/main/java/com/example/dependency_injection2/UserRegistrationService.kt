package com.example.dependency_injection2

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                                                  @messageQulifier private val notificationService: EmailService.NotificationService) {

    fun registerUser(email:String,password:String)
    {
        userRepository.SaveUser(email,password)
        notificationService.send(email,"utpalmohanta517@gmail.com","User Registerd")
    }
}