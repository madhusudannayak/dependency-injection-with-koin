package com.example.koindependencyinjiection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koindependencyinjiection.container.Component
import com.example.koindependencyinjiection.demo.Car
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    // private val car: Car by inject()
    private val component = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //   car.getCar()
       // component.car.getCar()

      //  component.main.getDemo()

        component.mainViewModel.getTest()
    }
}