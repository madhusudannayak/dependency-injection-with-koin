package com.example.koindependencyinjiection.di

import com.example.koindependencyinjiection.demo.interfaces.DemoImpl
import com.example.koindependencyinjiection.demo.interfaces.DemoOne
import com.example.koindependencyinjiection.demo.interfaces.DemoTwo
import com.example.koindependencyinjiection.demo.interfaces.Main
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {
   // factory { DemoImpl() as DemoOne }
  //  factory<DemoOne> { DemoImpl()  }

 //   factory { DemoImpl() } bind DemoOne::class

    factory { DemoImpl() } binds  arrayOf(DemoOne::class,DemoTwo::class)

    factory { Main(get(),get()) }


}