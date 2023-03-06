package com.ics.ifoodclone.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ics.ifoodclone.R
import com.ics.ifoodclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}