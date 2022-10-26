package com.example.cardenasmilanesgeovanimisael

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cardenasmilanesgeovanimisael.databinding.ActivityMainBienvenidaBinding
import com.example.cardenasmilanesgeovanimisael.databinding.ActivityMainBinding

class MainActivityBienvenida : AppCompatActivity() {

    private lateinit var binding: ActivityMainBienvenidaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBienvenidaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extra = intent.extras
        val nombre = extra?.getString("a")
        binding.textView3.text=nombre.toString()

        binding.button2.setOnClickListener(){

        val Actividad = Intent(this,MainActivityBienvenida::class.java)
        startActivity(Actividad)
        }
    }
}