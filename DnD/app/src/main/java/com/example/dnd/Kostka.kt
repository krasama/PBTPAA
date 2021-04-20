package com.example.dnd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.hod_kostkou.*

//import kotlinx.android.synthetic.main.hod_kostkou*

class Kostka: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hod_kostkou)
            // TODO: 22.03.2021
            var stena: Int = 6
            var pocet: Int = 1

            jedna.setOnClickListener{
                pocet = 1
            }

            dva.setOnClickListener{
                pocet = 2
            }

           d4.setOnClickListener{
                stena = 4
           }

            d6.setOnClickListener{
                stena = 6
           }

            d8.setOnClickListener{
                stena = 8
            }

            d10.setOnClickListener{
                stena = 10
            }

            d12.setOnClickListener{
                stena = 12
            }

            d20.setOnClickListener{
                stena = 20
            }

            d100.setOnClickListener{
                stena = 100
            }

            start.setOnClickListener{
                //val vysledek = hod(pocet, stena)
            }

               /* fun hod(pocet:Int, stena: Int):Int{
                    val vysledek: Int = 0
                    for (i in 1 .. pocet){
                        //vysledek = rnd(stena)
                        return vysledek
                    }
                }

                fun rnd(stena: Int):Int{
                    TODO()
                    val vysledek = (1..stena).shuffled().first()
                    assertTrue { vysledek >= 1 }
                    assertTrue { vysledek <= stena }

                    return vysledek
                }*/

            back_hod.setOnClickListener {
                this.setContentView(R.layout.activity_main)
            }

        }

    }