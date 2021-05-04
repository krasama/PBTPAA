package com.example.dnd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.generace_postavy.*

class Postava : AppCompatActivity(){

        var dexterity: String = ""
        var strength: String = ""
        var intelligence: String = ""
        var wisdom: String = ""
        var stamina: String = ""
        var charisma: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.generace_postavy)

        generace_zpet.setOnClickListener {
            this.setContentView(R.layout.activity_main)
        }

        generace.setOnClickListener {
            generovat()
            vypis()
        }

        reset_generace.setOnClickListener {
            text_dexterity.text = ""
            text_strength.text = ""
            text_intelligence.text = ""
            text_wisdom.text = ""
            text_stamina.text = ""
            text_charisma.text = ""
        }
    }
        private fun generovat(){
            dexterity = rnd().toString()
            strength = rnd().toString()
            intelligence = rnd().toString()
            wisdom = rnd().toString()
            stamina = rnd().toString()
            charisma = rnd().toString()
        }

        private fun rnd():Int{

            return (1..18).shuffled().first()
        }

        private fun vypis(){
            text_dexterity.text = dexterity
            text_strength.text = strength
            text_intelligence.text = intelligence
            text_wisdom.text = wisdom
            text_stamina.text = stamina
            text_charisma.text = charisma
        }
}