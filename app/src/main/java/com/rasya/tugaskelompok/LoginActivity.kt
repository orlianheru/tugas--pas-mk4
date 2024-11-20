package com.rasya.tugaskelompok

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rasya.tugaskelompok.databinding.ActivityLoginBinding

private lateinit var binding : ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        binding.goToSignIn .setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)

        }

    }
}