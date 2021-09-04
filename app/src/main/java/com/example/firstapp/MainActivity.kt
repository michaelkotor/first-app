package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doSomething(view: View) {
        val textView: TextView = findViewById(R.id.textView);
        val message: String = "Number: " + Math.random();
        textView.text = message;
        Toast.makeText(this, "Text changed", Toast.LENGTH_SHORT).show()
    }
}