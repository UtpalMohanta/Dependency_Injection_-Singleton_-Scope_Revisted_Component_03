package com.example.dependency_injection2

import android.util.Log

interface AnalyticService {

    fun trackEvent(eventName: String,eventType: String)
}

class Mixpanel: AnalyticService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Mixpanel -$eventName - $eventType")

    }
}
class FirebaseAnalytic: AnalyticService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Mixpanel -$eventName - $eventType")

    }
}
