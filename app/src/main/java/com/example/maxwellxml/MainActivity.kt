package com.example.maxwellxml

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var  toast:Button
    lateinit var info:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info=findViewById(R.id.button5)
        info.setOnClickListener {
            var myinfo= Intent(this,Formactivity::class.java)
            startActivity(myinfo)
            Toast.makeText(applicationContext,"Form Application",Toast.LENGTH_LONG).show()
        }

        toast=findViewById(R.id.button1)
        toast.setOnClickListener {
            Toast.makeText(applicationContext,"You did it successfully",Toast.LENGTH_LONG).show()
        }

        toast=findViewById(R.id.btn)
        toast.setOnClickListener {
            Toast.makeText(applicationContext,"You liked successfully",Toast.LENGTH_LONG).show()
        }
    }
}