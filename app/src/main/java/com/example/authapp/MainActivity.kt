package com.example.authapp

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var notregis: TextView

    private val username = "Admin"
    private val password = "Admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        etUsername = findViewById(R.id.username)
        etPassword = findViewById(R.id.password)
        btnLogin = findViewById(R.id.button1)
        notregis = findViewById(R.id.donthaveaccount)

        btnLogin.setOnClickListener(View.OnClickListener {
            if (etUsername.text.toString().equals(username, ignoreCase = true) && etPassword.text.toString().equals(password, ignoreCase = true)) {
                val login = Intent(this@MainActivity, Dashboard::class.java)
                startActivity(login)

                Toast.makeText(this@MainActivity, "LOGIN BERHASIL!!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "Username atau Password Yang Anda Masukkan Salah!!", Toast.LENGTH_SHORT).show()
            }
        })


        notregis.setOnClickListener(View.OnClickListener {
            notregis.setOnClickListener { v ->
                val direct = Intent(this@MainActivity, Register::class.java)
                startActivity(direct)
            }
        })

        fun callClassRegis() {
            val classA = Register()
        }
    }
}
