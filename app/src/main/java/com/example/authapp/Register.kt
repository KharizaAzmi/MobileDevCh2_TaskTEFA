package com.example.authapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Register : AppCompatActivity() {

    private lateinit var regis: TextView
    private lateinit var registered: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        regis = findViewById(R.id.button2)
        registered = findViewById(R.id.haveaccount)

        regis.setOnClickListener(View.OnClickListener {
            regis.setOnClickListener { v ->
                val direct = Intent(this@Register, Dashboard::class.java)
                startActivity(direct)
            }
        })

        registered.setOnClickListener(View.OnClickListener {
            registered.setOnClickListener { v ->
                val redirect = Intent(this@Register, MainActivity::class.java)
                startActivity(redirect)
            }
        })
    }
}