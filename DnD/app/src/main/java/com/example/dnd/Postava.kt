package com.example.dnd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.generace_postavy.*

class Postava : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.generace_postavy)

        generace_zpet.setOnClickListener {
            this.setContentView(R.layout.activity_main)
        }
    }
// TODO: 22.03.2021
}