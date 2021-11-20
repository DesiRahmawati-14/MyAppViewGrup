package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PrdNike : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prd_nike)
        supportActionBar?.title = "Product Nike"
    }
}