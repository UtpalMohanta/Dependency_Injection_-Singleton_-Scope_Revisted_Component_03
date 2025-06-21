package com.example.dependency_injection2


@dagger.Module
class AnalyticModule {

    @dagger.Provides
    fun getAnalyticServices(): AnalyticService{
        return Mixpanel()
    }
}