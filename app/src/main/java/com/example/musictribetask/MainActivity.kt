package com.example.musictribetask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addMainFragment()
    }

    private fun addMainFragment() {
        this.supportFragmentManager.beginTransaction()
            .add(R.id.container, MainFragment.newInstance())
            .commit()
    }
}