package com.example.empregaeu4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.empregaeu4.databinding.ActivityCadastroUsuarioBinding
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.DatabaseReference



class UsuarioCad : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroUsuarioBinding
    private lateinit var dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cadName = binding.txtName
        var cadEmail = binding.txtEmail
        var cadPhone = binding.txtPhone
        var cadCpf = binding.txtCpf
        var cadNasc = binding.txtNasc
        var bt = binding.btCadast

        dbRef = FirebaseDatabase.getInstance().getReference("Usuario")

        bt.setOnClickListener {

            val cadNamebt = cadName.text.toString()
            val cadEmailbt = cadEmail.text.toString()
            val cadPhonebt = cadPhone.text.toString()
            val cadCpfbt = cadCpf.text.toString()
            val cadNascbt = cadNasc.text.toString()


            if (cadNamebt.isEmpty()) {
                cadName.error = "Por favor, insira um Nome"
            }
            if (cadEmailbt.isEmpty()) {
                cadEmail.error = "Por favor, insira um E-mail"
            }
            if (cadPhonebt.isEmpty()) {
                cadPhone.error = "Por favor, insira um Telefone"
            }

            if (cadCpfbt.isEmpty()) {
                cadCpf.error = "Por favor, insira CPF"
            }

            if (cadNascbt.isEmpty()) {
                cadNasc.error = "Por favor, insira Data Nascimento"
            }

            val empId = dbRef.push().key!!

            val Usuario = DadosUsuario(cadNamebt, cadEmailbt, cadPhonebt, cadCpfbt, cadNascbt
            )

            dbRef.child(empId).setValue(Usuario)
                .addOnCompleteListener {
                    Toast.makeText(this, "Cadastro realizado", Toast.LENGTH_SHORT).show()

                    cadName.text.clear()
                    cadEmail.text.clear()
                    cadPhone.text.clear()
                    cadCpf.text.clear()
                    cadNasc.text.clear()

                }.addOnFailureListener { err ->
                    Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_SHORT).show()
                }
            // setContentView(R.layout.activity_donat)
        }
    }
}