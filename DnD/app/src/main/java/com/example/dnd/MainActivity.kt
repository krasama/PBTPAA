package com.example.dnd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.hod_kostkou.*




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       dice.setOnClickListener {
           var intent = Intent(this,Kostka::class.java)
           startActivity(intent)

       }

       generation.setOnClickListener {
           var intent = Intent(this,Postava::class.java)
           startActivity(intent)
       }

        about.setOnClickListener {
            var intent = Intent(this,About::class.java)
            startActivity(intent)
        }



    }
}