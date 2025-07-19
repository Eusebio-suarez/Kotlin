package com.eusebio.android

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eusebio.android.firstapp.firstAppActivity
import com.google.android.material.button.MaterialButton

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //boton parra ir a la app de saludos
        val btnSaludar = findViewById<MaterialButton>(R.id.btnSaludApp)

        btnSaludar.setOnClickListener {

            //definir a do de se va a navegar
            var intent= Intent(this, firstAppActivity::class.java)

            //navegar a la app de saludos
            startActivity(intent)
        }
    }
}