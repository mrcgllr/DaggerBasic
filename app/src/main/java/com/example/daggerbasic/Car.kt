package com.example.daggerbasic

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels
) {
    fun drive() {
        engine.start()
        Log.d("CAR", "driving")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }


}