package com.example.daggerbasic.dagger

import com.example.daggerbasic.car.Rims
import com.example.daggerbasic.car.Tires
import com.example.daggerbasic.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires= Tires()
        tires.inflate()
        return tires
    }

    @Provides
   fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }

}