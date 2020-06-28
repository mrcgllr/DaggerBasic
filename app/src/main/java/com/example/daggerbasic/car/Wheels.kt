package com.example.daggerbasic.car

import com.example.daggerbasic.car.Rims
import com.example.daggerbasic.car.Tires
import javax.inject.Inject

class Wheels @Inject constructor(
    val rims: Rims,
    val tires: Tires
) {
}