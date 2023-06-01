package com.example.authapp

import android.content.Context
import android.text.TextUtils.isEmpty
import android.util.AttributeSet
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class CustomButtonLayout (
    context: Context,
    attrs: AttributeSet
) : LinearLayout(context, attrs) {
    init {

        inflate(context, R.layout.login, this)

        val customAttributesStyle = context.obtainStyledAttributes(attrs, R.styleable.CustomButtonLayout, 0, 0)

//        val button1 = findViewById<Button>(R.id.button1)
//        val button2 = findViewById<Button>(R.id.button2)

        var username = findViewById(R.id.username) as EditText

        var password = findViewById(R.id.password) as EditText

        var button1 = findViewById(R.id.button1) as Button

        try {
            button1.text = customAttributesStyle.getString(R.styleable.CustomButtonLayout_button1Text)
//            button2.text = customAttributesStyle.getString(R.styleable.CustomButtonLayout_button2Text)
        } finally {
            customAttributesStyle.recycle()
        }

        button1.setOnClickListener {

            val username = username.text;

            val password = password.text;



            if(isEmpty(username) || isEmpty(password)){

                Toast.makeText(context, "Please fill all fields", Toast.LENGTH_LONG).show()

            }else{

                // your code to validate the user_name and password combination

                // and verify the same

            }
        }

//        button2.setOnClickListener {
//            // Handle button2 click event...
//        }
    }
}