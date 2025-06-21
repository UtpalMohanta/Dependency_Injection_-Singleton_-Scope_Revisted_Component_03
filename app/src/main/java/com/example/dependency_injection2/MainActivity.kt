package com.example.dependency_injection2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity {

    @javax.inject.Inject
    lateinit var userRegistrationService:UserRegistrationService /*Field Injection*/

    //@Inject
    lateinit var emailService: EmailService

    //@Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(3)

        val component2 = (application as UserApplication).userRegistrationComponent
        emailService=component2.getEmailServices()
        emailService1=component2.getEmailServices()
        component.inject(this)
        userRegistrationService.registerUser("sdjklsadl@gmail.com","11111")
    }
}