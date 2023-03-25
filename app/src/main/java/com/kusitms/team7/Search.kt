package com.kusitms.team7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Search : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        var search_result = findViewById<TextView>(R.id.search_result)

        var data = intent.getStringExtra("search_text")

        search_result.text = data







    }
}