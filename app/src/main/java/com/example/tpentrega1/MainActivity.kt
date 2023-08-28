package com.example.tpentrega1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText=findViewById<EditText>(R.id.username)//obtengo el texto ingresado y lo transformo en un string
        val editText2=findViewById<EditText>(R.id.password)//obtengo la contrasenia ingresada y la transformo en un string
        val checkBoxAcepto = findViewById<CheckBox>(R.id.rememberMe)//indico cual es el checkbox con el id
        val botonIniciarSesion = findViewById<Button>(R.id.loginButton)//indico cual es el boton con el id

        botonIniciarSesion.setOnClickListener{
            val usuarioIngresado=editText.text.toString()//guardo el texto ingresado
            val contraseniaIngresada=editText2.text.toString()//guardo la contrasenia ingresada

            if(usuarioIngresado.isEmpty() || contraseniaIngresada.isEmpty()){// si el usuario o la contrasenia estan vacios
                Toast.makeText(this,"Incomplete fields",Toast.LENGTH_SHORT).show()// escribo un mensaje de tiempo corto indicando que estan vacios
            }else if (checkBoxAcepto.isChecked == false){// si se completaron los campos y el checkbox da false, nos pregunta
                Toast.makeText(this,"Don't want to remember username?",Toast.LENGTH_SHORT).show()
            }
            val intent = Intent(this, pantalla2Activity::class.java)
            startActivity(intent)
            }

        }

    }










