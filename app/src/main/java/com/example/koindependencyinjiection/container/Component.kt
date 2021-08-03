package com.example.koindependencyinjiection.container

import com.example.koindependencyinjiection.demo.Car
import com.example.koindependencyinjiection.demo.Engine
import com.example.koindependencyinjiection.demo.interfaces.Main
import com.example.koindependencyinjiection.demo.viewmodel.MainViewModel
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject


@KoinApiExtension
class Component : KoinComponent {

    //lazily
    val car: Car by inject()

    //eagerly
    //  val car1: Car = get()
    val engine: Engine by inject()


    val main: Main by inject()

    val mainViewModel : MainViewModel by inject()

}