package com.eusebio.android.firstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eusebio.android.R

class firstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //variable que representa a el boton
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)

        //variable que representa ea el campo de texto
        val text = findViewById<AppCompatEditText>(R.id.eText)
        //agregar el evento de click a el boton
        btnStart.setOnClickListener {
            //convertir el input en texto
            var editText= text.text.toString()

            //validar que el campo no este vacio
            if (editText.isNotEmpty()){
                //permite establecer una navegacion entre paginas
                var intent = Intent(this, resultActivity::class.java)
                //enviar informacion estra entre views
                intent.putExtra("EXTRA_NAME",editText)
                startActivity(intent)
            }

        }
    }
}