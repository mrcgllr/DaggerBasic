package com.example.daggerbasic.dagger

import com.example.daggerbasic.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(private val driverName: String) {


    @Singleton
    @Provides
    fun provideDriver(): Driver {
        return Driver(driverName)
    }
}