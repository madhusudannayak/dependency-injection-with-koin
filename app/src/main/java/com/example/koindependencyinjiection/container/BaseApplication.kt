package com.example.koindependencyinjiection.container

import android.app.Application
import com.example.koindependencyinjiection.di.demoModule
import com.example.koindependencyinjiection.di.interfaceModule
import com.example.koindependencyinjiection.di.viewModelModule
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(demoModule, interfaceModule, viewModelModule)
        }
    }
}