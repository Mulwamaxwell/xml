package com.example.maxwellxml

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.MediaStore
import android.widget.Button

class intentacticity : AppCompatActivity() {
    lateinit var sms:Button
    lateinit var email:Button
    lateinit var share:Button
    lateinit var camera:Button
    lateinit var call:Button
    lateinit var stk:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentacticity)
        sms=findViewById(R.id.btnsms)
        email=findViewById(R.id.btnemail)
        share=findViewById(R.id.btnshare)
        camera=findViewById(R.id.btncamera)
        call=findViewById(R.id.btnphone)
        stk=findViewById(R.id.Btnstk)


        sms.setOnClickListener {
            var uri = Uri.parse("smsto:0795331020")
            var intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body","Hello Maxwell")
            startActivity(intent)
        }
        email.setOnClickListener {
            var emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","mulwamaxwell16@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear Sir,....")
            startActivity(Intent.createChooser(emailIntent,"send email....."))
        }
        share.setOnClickListener {
            var shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"https://repack-games.com/")
            startActivity(shareIntent)
        }
        camera.setOnClickListener {
            var takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent,1)
        }
        stk.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0791227180")
            startActivity(dialIntent)
        }

    }


}