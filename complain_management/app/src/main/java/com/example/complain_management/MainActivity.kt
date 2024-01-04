package com.example.complain_management

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.complain_management.databinding.ActivityMainBinding
import com.example.complain_management.databinding.ActivitySignInBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSignin.setOnClickListener{
            val intent= Intent(this,home_page_activity::class.java)
            startActivity(intent)
        }
    }
}