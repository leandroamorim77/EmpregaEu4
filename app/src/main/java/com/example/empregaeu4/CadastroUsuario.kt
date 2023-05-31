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
        val btViewD = binding.btView



        //nameUser.text = R.string.well.toString() + " " + nameGet

        btStar.setOnClickListener {
            val intenDon = Intent(this, UsuarioCad::class.java)
            startActivity(intenDon)

        }
        btViewD?.setOnClickListener {
            val intenViewDon = Intent(this, ListUsuario::class.java)
            startActivity(intenViewDon)

        }

        //setContentView(R.layout.activity_intro)
    }
}