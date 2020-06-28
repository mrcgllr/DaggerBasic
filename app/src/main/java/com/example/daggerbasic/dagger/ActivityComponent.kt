package com.example.daggerbasic.dagger


import com.example.daggerbasic.AppComponent
import com.example.daggerbasic.MainActivity
import com.example.daggerbasic.car.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {

    fun getCar(): Car

    fun inject(activity: MainActivity)


    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horse power") horsePower: Int,
            @BindsInstance @Named("engine capacity") engineCapacity: Int
        ): ActivityComponent

    }
}