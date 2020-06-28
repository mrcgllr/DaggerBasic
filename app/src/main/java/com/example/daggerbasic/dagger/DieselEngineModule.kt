package com.example.daggerbasic.dagger

import com.example.daggerbasic.car.DieselEngine
import com.example.daggerbasic.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideHorsePower():Int{
        return horsePower
    }

    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}