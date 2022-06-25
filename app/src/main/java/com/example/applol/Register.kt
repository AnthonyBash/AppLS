package com.example.applol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        textView7.setOnClickListener{
            textView6.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                startActivityForResult(intent,1)
            }
        }

    }
}