package com.example.daggerbasic.car

import android.util.Log
import javax.inject.Inject

class DieselEngine constructor(private val horsePower: Int) : Engine {


    override fun start() {
        Log.d("Car", "Diesel Engine start. Horsepower ${horsePower}")

    }
}