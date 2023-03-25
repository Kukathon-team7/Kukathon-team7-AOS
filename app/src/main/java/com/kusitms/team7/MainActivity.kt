package com.kusitms.team7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 머지용

        val search_btn = findViewById<ImageButton>(R.id.search_btn)

        search_btn.setOnClickListener {
            val intent = Intent(this,Search::class.java)
            startActivity(intent)
        }
        // 머지용


    }
}