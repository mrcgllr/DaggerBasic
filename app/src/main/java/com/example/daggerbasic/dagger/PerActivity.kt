package com.example.daggerbasic.dagger

import java.lang.annotation.Documented
import javax.inject.Scope

@Scope
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity {
}