package com.example.daggerbasic.car

import android.util.Log
import com.example.daggerbasic.car.Engine
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horse power")
    private val horsePower: Int,
    @Named("engine capacity")
    private val engineCapacity: Int
) : Engine {
    override fun start() {
        Log.d("Car", "Petrol engine start. Horsepower $horsePower \nEnginceCapacity $engineCapacity")
    }
}