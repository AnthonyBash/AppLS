package com.example.applol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        flecha_login.setOnClickListener{
            val usuario = user.text.toString()
            val contrasena = pass.text.toString()

            if(usuario.trim() == ""){
                Toast.makeText(this, "Debe ingresar un usuario", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(contrasena.trim() == ""){
                Toast.makeText(this, "Debe ingresar una contraseña", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(usuario == "Dawada" && contrasena == "4550306") {
                val intent = Intent(this, ingreso::class.java)
                startActivityForResult(intent,1)
            } else {
                Toast.makeText(this, "Usuario no Registrado", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

        }

        textView6.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivityForResult(intent,1)
        }

    }
}