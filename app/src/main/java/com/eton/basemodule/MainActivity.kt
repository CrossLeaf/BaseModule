package com.eton.basemodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eton.base_module.TestClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestClass().add(1, 2)
    }
}