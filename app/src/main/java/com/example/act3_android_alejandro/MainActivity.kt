package com.example.act3_android_alejandro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity_11 = findViewById<Button>(R.id.activity_11)
        activity_11.setOnClickListener {
            val intent = Intent(this, Activity_11::class.java)
            startActivity(intent)
        }

        val activity_12 = findViewById<Button>(R.id.activity_12)
        activity_12.setOnClickListener {
            val intent = Intent(this, Activity_12::class.java)
            startActivity(intent)
        }

        val activity_13 = findViewById<Button>(R.id.activity_13)
        activity_13.setOnClickListener {
            val intent = Intent(this, Activity_13::class.java)
            startActivity(intent)
        }

        val activity_14 = findViewById<Button>(R.id.activity_14)
        activity_14.setOnClickListener {
            val intent = Intent(this, Activity_14::class.java)
            startActivity(intent)
        }

    }
}