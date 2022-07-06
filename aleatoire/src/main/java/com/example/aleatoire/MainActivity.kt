package com.example.aleatoire

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var editTextMin : EditText
    lateinit var editTextMax : EditText
    lateinit var buttonGenerate : Button
    lateinit var textViewResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextMin = findViewById(R.id.editTextMin)
        editTextMax = findViewById(R.id.editTextMax)
        buttonGenerate = findViewById(R.id.buttonGenerate)
        textViewResult = findViewById(R.id.textViewResult)

        buttonGenerate.setOnClickListener {
            val min = editTextMin.text.toString().toIntOrNull()
            val max = editTextMax.text.toString().toIntOrNull()
            if(min != null && max != null)
                textViewResult.text=(min..max).random().toString()
        }
    }
}