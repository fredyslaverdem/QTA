package com.utadeo.primerqtacorte2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var showToast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var prestamo = findViewById<EditText>(R.id.editTextNumber1)
        var tasa= findViewById<EditText>(R.id.editTextNumber3)
        var tiempo= findViewById<EditText>(R.id.editTextNumber4)
        var tae = findViewById<EditText>(R.id.editTextNumber5)

        val operacionTae = (tae/12)/100

        showToast = findViewById<Button>(R.id.button2)

        showToast.setOnClickListener{
            Toast.makeText(applicationContext,"Variable resultado", Toast.LENGTH_LONG).show()

        }
    }
}