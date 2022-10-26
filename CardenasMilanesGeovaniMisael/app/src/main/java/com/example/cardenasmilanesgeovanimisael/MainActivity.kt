package com.example.cardenasmilanesgeovanimisael

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.cardenasmilanesgeovanimisael.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val actividad = Intent(this,MainActivityBienvenida::class.java)
        val persona = ArrayList <Persona>()
        persona.add(Persona("Cardenas Milanes Geovani Misael"))
        binding.button.setOnClickListener(){
            val Login = binding.PlainText.text.toString()
            val Password = binding.Password.text.toString()

            //valida Login y Password
            if (Login == "Misael" && Password == "puerta"){
                val nombre = persona [0].nombre
                actividad.putExtra("a", "$nombre")
                startActivity(actividad)
            }
            else{
                Toast.makeText(this, "Usuario Invalido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}