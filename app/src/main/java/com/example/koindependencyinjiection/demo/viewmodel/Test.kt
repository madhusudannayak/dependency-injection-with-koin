package com.example.koindependencyinjiection.demo.viewmodel

import android.util.Log

interface Test{
    fun getTest()
}
class TestImp : Test{
    override fun getTest() {
        Log.d("main","Hey ViewModel..")
    }

}