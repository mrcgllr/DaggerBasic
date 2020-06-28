package com.example.daggerbasic

import android.app.Application
import com.example.daggerbasic.dagger.DriverModule


class ExampleApp : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component=DaggerAppComponent.factory().create(DriverModule("Meriç"))
    }

    fun getAppComponent():AppComponent{
        return component
    }
}