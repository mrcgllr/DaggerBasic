package com.example.daggerbasic

import com.example.daggerbasic.dagger.PerActivity
import javax.inject.Inject
import javax.inject.Singleton


@PerActivity
class Driver @Inject constructor(val name: String) {

}