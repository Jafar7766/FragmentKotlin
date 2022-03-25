package com.example.fragmentkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews() {
        val btn_button = findViewById<Button>(R.id.btn_button)
        btn_button.setOnClickListener { openRuntimeActivity() }
    }
    fun openRuntimeActivity() {
        val intent = Intent(this, RuntimeActivity::class.java)
        startActivity(intent)
    }
}
