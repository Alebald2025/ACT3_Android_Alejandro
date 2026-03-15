package com.example.act3_android_alejandro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity_14 : AppCompatActivity() {

    // Variables
    var pantalla = ""
    var numero1 = ""
    var operador = ""
    var numero2 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_14)

        val tvDisplay = findViewById<TextView>(R.id.tvDisplay)

        // Numeros
        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        // Mostrar texto en pantalla
        btn0.setOnClickListener {
            pantalla += "0";
            tvDisplay.text = pantalla
        }

        btn1.setOnClickListener {
            pantalla += "1";
            tvDisplay.text = pantalla
        }

        btn2.setOnClickListener {
            pantalla += "2";
            tvDisplay.text = pantalla
        }

        btn3.setOnClickListener {
            pantalla += "3";
            tvDisplay.text = pantalla }

        btn4.setOnClickListener {
            pantalla += "4";
            tvDisplay.text = pantalla }

        btn5.setOnClickListener {
            pantalla += "5";
            tvDisplay.text = pantalla }

        btn6.setOnClickListener {
            pantalla += "6";
            tvDisplay.text = pantalla }

        btn7.setOnClickListener {
            pantalla += "7";
            tvDisplay.text = pantalla }

        btn8.setOnClickListener {
            pantalla += "8";
            tvDisplay.text = pantalla }

        btn9.setOnClickListener {
            pantalla += "9";
            tvDisplay.text = pantalla }

        //Operaciones
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        btnAdd.setOnClickListener {
            numero1 = pantalla
            operador = "+"
            pantalla = ""
        }

        btnSubtract.setOnClickListener {
            numero1 = pantalla
            operador = "-"
            pantalla = ""
        }

        btnMultiply.setOnClickListener {
            numero1 = pantalla
            operador = "x"
            pantalla = ""
        }

        btnDivide.setOnClickListener {
            numero1 = pantalla
            operador = "/"
            pantalla = ""
        }

        val btnEquals = findViewById<Button>(R.id.btnEquals)
        btnEquals.setOnClickListener {

            numero2 = pantalla

            var resultado = 0.0

            if (operador == "+") {
                resultado = numero1.toDouble() + numero2.toDouble()
            } else if (operador == "-") {
                resultado = numero1.toDouble() - numero2.toDouble()
            } else if (operador == "x") {
                resultado = numero1.toDouble() * numero2.toDouble()
            } else if (operador == "/") {
                if (numero2.toDouble() != 0.0) {
                    resultado = numero1.toDouble() / numero2.toDouble()
                } else {
                    tvDisplay.text = "Error"
                    return@setOnClickListener
                }
            }

            tvDisplay.text = resultado.toString()
            pantalla = resultado.toString()
        }

        val btnClear = findViewById<Button>(R.id.btnClear)
        btnClear.setOnClickListener {
            pantalla = ""
            numero1 = ""
            numero2 = ""
            operador = ""
            tvDisplay.text = "0"
        }
    }
}