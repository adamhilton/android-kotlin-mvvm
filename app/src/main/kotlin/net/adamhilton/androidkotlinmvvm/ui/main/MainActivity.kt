package net.adamhilton.androidkotlinmvvm.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import net.adamhilton.androidkotlinmvvm.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
