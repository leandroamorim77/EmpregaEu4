package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empregaeu4.databinding.ActivityIntroBinding

class CadastroUsuario : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btStar = binding.btStart
        val btViewU = binding.btView





        btStar.setOnClickListener {
            val intenUsu = Intent(this, UsuarioCad::class.java)
            startActivity(intenUsu)

        }
        btViewU?.setOnClickListener {
            val intenViewUsu = Intent(this, ListUsuario::class.java)
            startActivity(intenViewUsu)

        }

        //setContentView(R.layout.activity_intro)
    }
}