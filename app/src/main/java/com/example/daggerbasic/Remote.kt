package com.example.daggerbasic

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {


    fun setListener(car: Car) {
        Log.d("CAR", "Remote connected")

    }
}