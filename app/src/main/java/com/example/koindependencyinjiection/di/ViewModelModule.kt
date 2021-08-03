package com.example.koindependencyinjiection.di

import com.example.koindependencyinjiection.demo.viewmodel.MainViewModel
import com.example.koindependencyinjiection.demo.viewmodel.Test
import com.example.koindependencyinjiection.demo.viewmodel.TestImp
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewModelModule = module {
    factory { TestImp() } bind Test::class

    viewModel { MainViewModel(get())}
}