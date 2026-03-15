package com.example.act3_android_alejandro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ToggleButton

class Activity_11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_11)

        val scrollView = findViewById<HorizontalScrollView>(R.id.scrollHor)
        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)

        toggleButton.setOnCheckedChangeListener{ _, isChecked ->
            scrollView.isHorizontalScrollBarEnabled = !isChecked
        }

    }
}