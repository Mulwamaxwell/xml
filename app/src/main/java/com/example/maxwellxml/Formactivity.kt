package com.example.maxwellxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Formactivity : AppCompatActivity() {
    lateinit var feedback:Button
    lateinit var pay:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formactivity)
        //Finding view by id
        feedback=findViewById(R.id.form)
        pay=findViewById(R.id.pay)
        //setOnclicklistener
        feedback.setOnClickListener {
            var feed=Intent(this,ButtonActivity::class.java)
            startActivity(feed)
        }
        pay.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
    }
}