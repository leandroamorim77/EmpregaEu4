package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empregaeu4.databinding.ActivityTela2Binding

class Tela2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTela2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val btDadosT3 = binding.btDadosT3

        btDadosT3.setOnClickListener {
            val inten = Intent(this, CadastroUsuario::class.java)
            startActivity(inten)
        }
    }
}
