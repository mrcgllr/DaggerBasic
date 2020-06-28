package com.example.daggerbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerbasic.car.Car
import com.example.daggerbasic.dagger.ActivityComponent
import com.example.daggerbasic.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent: ActivityComponent = (application as ExampleApp).getAppComponent()
            .getActivityComponentFactory().create(150,100)
      activityComponent.inject(this)

        car1.drive()
        car2.drive()

    }
}