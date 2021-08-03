package com.example.koindependencyinjiection.di

import com.example.koindependencyinjiection.demo.Car
import com.example.koindependencyinjiection.demo.Engine
import com.example.koindependencyinjiection.demo.Wheel
import org.koin.dsl.module

val demoModule = module {
    factory { Wheel() }
    factory { Engine() }
    factory { Car(get(), get()) }
    // single { Car() }
}