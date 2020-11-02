package com.example.kotlin_ek3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun addOnClick(view: View) {
        var textview = findViewById<TextView>(R.id.textfield)
        var text = textview.text.toString()
        var nummer = text.toInt()+1
        textview.text = nummer.toString()
    }
}
