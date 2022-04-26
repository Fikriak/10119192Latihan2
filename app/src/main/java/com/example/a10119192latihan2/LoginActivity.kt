package com.example.a10119192latihan2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


//26 April 2022, 10119192, Fikri Akbari Karim, IF5
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerAkun(view: View?) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}