package com.example.maxwellxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ButtonActivity : AppCompatActivity() {
    lateinit var forward:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        forward=findViewById(R.id.Intent)
        forward.setOnClickListener {
            var feed= Intent(this,intentacticity::class.java)
            startActivity(feed)
        }
    }
}