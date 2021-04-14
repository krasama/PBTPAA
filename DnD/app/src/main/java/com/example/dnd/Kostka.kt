package com.example.dnd

class Kostka {
    // TODO: 22.03.2021
    val stena: Int = 0
    val pocet: Int = 0

    fun hod(pocet:Int, stena: Int):Int{
        val vysledek: Int = 0
        TODO()
        for (i in 1 .. pocet){
            vysledek = rnd(stena)
            return vysledek
        }
    }

    fun rnd(stena: Int):Int{
        TODO()
        val vysledek = (1..stena).shuffled().first()
        //assertTrue { vysledek >= 1 }
        //assertTrue { vysledek <= stena }

        return vysledek
    }
/*
    back_hod.setOnClickListener {
        this.setContentView(R.layout.activity_main)
    }
    */
}