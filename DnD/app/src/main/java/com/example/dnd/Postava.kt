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
            finish()
        }

        generace.setOnClickListener {
            generovat()
            vypis()
        }

        reset_generace.setOnClickListener {
            dexterity_generace.text = ""
            strength_generace.text = ""
            inteligence_generace.text = ""
            wisdom_generace.text = ""
            stamina_generace.text = ""
            charisma_generace.text = ""
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
            var mezivypocet = 0
            for (i in 1..3){
            mezivypocet += (1..6).shuffled().first()
            }
            return mezivypocet
        }

        private fun vypis(){
            dexterity_generace.text = dexterity
            strength_generace.text = strength
            inteligence_generace.text = intelligence
            wisdom_generace.text = wisdom
            stamina_generace.text = stamina
            charisma_generace.text = charisma
        }
}