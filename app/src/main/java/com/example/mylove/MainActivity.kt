package com.example.mylove

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylove.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        binding.tvReto.setOnClickListener{
            binding.tvReto.text = getReto()
        }
    }
    private fun getReto(): String{
        return resources.getStringArray(R.array.retos)[randomNumber()]

    }
    private fun randomNumber(): Int {
        val size = resources.getStringArray(R.array.retos).size - 1
        return (0..size).random()

    }
}