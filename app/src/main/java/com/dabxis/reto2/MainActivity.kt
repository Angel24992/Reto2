package com.dabxis.reto2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dabxis.reto2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener{
            val grade = binding.ingreseCalificacion.text.toString().toIntOrNull()
            if (grade!=null){
                if (grade >= 70){
                    binding.resultado.text = "Felicitaciones aprobaste"
                } else{
                    binding.resultado.text = "Lo siento, has reprobado"
                }
            } else{
                binding.resultado.text = "Por favor ingrese la calificación"
            }
        }
    }
}