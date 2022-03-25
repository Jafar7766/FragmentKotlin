package com.example.fragmentkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentkotlin.Fragments.FirstFragment
import com.example.fragmentkotlin.Fragments.SecondFragment

class RuntimeActivity : AppCompatActivity(), FirstFragment.FirstListener,
    SecondFragment.SecondListener {
    var firstFragment: FirstFragment? = null
    var secondFragment: SecondFragment? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_runtime)
        initViews()
    }

    override fun onFirstSend(str: String?) {
        secondFragment?.updateSecondText(str)
    }

    override fun onSecondSend(str: String?) {
        firstFragment?.updateFirstText(str)
    }

    fun initViews() {
        firstFragment = FirstFragment()
        secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameFirst, firstFragment!!)
            .replace(R.id.frameSecond, secondFragment!!)
            .commit()
    }
}