package com.example.geolocation_cristianmonzonguzman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Define and connect the variables
        val btnUbication = findViewById<ImageButton>(R.id.btnUbication)

        btnUbication.setOnClickListener {
            val intent = Intent(this, GoogleMapsUbication::class.java)
            startActivity(intent);
        }
    }
}