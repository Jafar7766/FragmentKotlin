package com.example.fragmentkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FragmentActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_detail)
    }
}