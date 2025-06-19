package com.example.start_project

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val charInput = findViewById<EditText>(R.id.charInput)
        val charResult = findViewById<TextView>(R.id.charResult)
        val checkCharBtn = findViewById<Button>(R.id.checkCharBtn)

        checkCharBtn.setOnClickListener {
            charResult.text = "TEST"
        }

    }
}