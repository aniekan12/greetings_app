package com.example.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val enterButton = findViewById<Button>(R.id.enterButton)

        enterButton.setOnClickListener(View.OnClickListener{
            Toast.makeText(this@MainActivity,
                "Welcome ${editTextName.text}",
                Toast.LENGTH_LONG )
                .show()
        })
    }
}