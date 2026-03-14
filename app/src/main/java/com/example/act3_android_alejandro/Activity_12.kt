package com.example.act3_android_alejandro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_12)

        val activity_11 = findViewById<Button>(R.id.table_button)
        activity_11.setOnClickListener {
            val intent = Intent(this, Activity_12_Table::class.java)
            startActivity(intent)
        }

        val activity_12 = findViewById<Button>(R.id.grid_button)
        activity_12.setOnClickListener {
            val intent = Intent(this, Activity_12_Grid::class.java)
            startActivity(intent)
        }

        val activity_13 = findViewById<Button>(R.id.linear_button)
        activity_13.setOnClickListener {
            val intent = Intent(this, Activity_12_Linear::class.java)
            startActivity(intent)
        }


    }
}