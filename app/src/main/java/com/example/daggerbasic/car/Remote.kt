package com.example.daggerbasic.car

import android.util.Log
import com.example.daggerbasic.car.Car
import javax.inject.Inject

class Remote @Inject constructor() {


    fun setListener(car: Car) {
        Log.d("CAR", "Remote connected")

    }
}