package com.example.dependency_injection2

import dagger.Binds

abstract class UserRepositoryModule {

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository):UserRepository
}