package com.example.daggerbasic.dagger

import com.example.daggerbasic.car.Engine
import com.example.daggerbasic.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {


    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine

}