package com.example.daggerbasic

import javax.inject.Inject

class Wheels @Inject constructor(
    val rims: Rims,
    val tires: Tires
) {
}