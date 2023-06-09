package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.empregaeu4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edNome = binding.edUsuario
        val btLogin = binding.btLogin
        val edSenha = binding.edSenha

        btLogin.setOnClickListener {
            if(edNome.text.toString()=="Leandro" && edSenha.text.toString() == "1234") {
                val inten = Intent(this, Tela2Activity::class.java)
                val texto = edNome.text.toString()
                inten.putExtra("name", texto)
                startActivity(inten)
            }
            else{
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
            }
        }
        //setContentView(R.layout.activity_main)
    }
}