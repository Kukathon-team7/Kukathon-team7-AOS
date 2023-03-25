package com.kusitms.team7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TutorialActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial2)

        val btn_next = findViewById<ImageButton>(R.id.btn_next)

        btn_next.setOnClickListener {
            val intent = Intent(this, TutorialActivity3::class.java)
            finish()
            startActivity(intent)
        }

    }
}