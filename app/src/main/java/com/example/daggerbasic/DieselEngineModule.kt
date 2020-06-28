package com.example.daggerbasic

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DieselEngineModule {


    @Binds
    abstract fun bindEngine(petrolEngine: DieselEngine):Engine

}