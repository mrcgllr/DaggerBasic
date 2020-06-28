package com.example.daggerbasic.car

import android.util.Log
import com.example.daggerbasic.Driver
import com.example.daggerbasic.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels,
    val driver: Driver
) {
    fun drive() {
        engine.start()
        Log.d("CAR", driver.name)
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }


}