package com.example.koindependencyinjiection.demo.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel(val test: Test) : ViewModel() {

    fun getTest(){
        test.getTest()
    }

}