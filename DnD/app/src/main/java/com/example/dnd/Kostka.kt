package com.example.dnd

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.hod_kostkou.*

class Kostka: AppCompatActivity() {
    var stena: Int = 6
    var pocet: Int = 1
    private var vysledek: Int =0

    lateinit var diceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hod_kostkou)



            this.jedna.setOnClickListener{
                pocet = 1
            }

            this.dva.setOnClickListener{
                pocet = 2
            }

           this.d4.setOnClickListener{
                stena = 4
           }

           this.d6.setOnClickListener{
                stena = 6
           }

           this.d8.setOnClickListener{
                stena = 8
           }

           this.d10.setOnClickListener{
                stena = 10
           }

           this.d12.setOnClickListener{
                stena = 12
           }

           this.d20.setOnClickListener{
                stena = 20
           }

           this.d100.setOnClickListener{
                stena = 100
           }

           this.start.setOnClickListener{
                this.vysledek = hod(pocet, stena)
                this.vykres(vysledek)
           }


           back_hod.setOnClickListener {
               this.setContentView(R.layout.activity_main)
           }

        }

        private fun hod(pocet:Int, stena: Int): Int {
            var vysledekH: Int = 0
            for (i in 1 .. pocet){
                vysledekH = rnd(stena)
            }
            return vysledekH
        }
            private fun vykres(vysledek:Int){
                if (stena ==4){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d4_1
                        2->R.drawable.d4_2
                        3->R.drawable.d4_3
                        else -> R.drawable.d4_4

                    }
                    diceImage.setImageResource(drawableResources)
                }
                else if (stena == 6) {
                    val drawableResources = when(vysledek){
                        1->R.drawable.d6_1
                        2->R.drawable.d6_2
                        3->R.drawable.d6_3
                        4->R.drawable.d6_4
                        5->R.drawable.d6_5
                        else -> R.drawable.d6_6

                    }
                    diceImage.setImageResource(drawableResources)
                }
                else if (stena == 8){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d4_1
                        2->R.drawable.d4_2
                        3->R.drawable.d4_3
                        4->R.drawable.d4_4
                        5->R.drawable.d8_5
                        6->R.drawable.d8_6
                        7->R.drawable.d8_7
                        else -> R.drawable.d8_8

                    }
                    diceImage.setImageResource(drawableResources)
                }
                else if (stena == 10){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d10_0
                        2->R.drawable.d10_1
                        3->R.drawable.d10_2
                        4->R.drawable.d10_3
                        5->R.drawable.d10_4
                        6->R.drawable.d10_5
                        7->R.drawable.d10_6
                        8->R.drawable.d10_7
                        9->R.drawable.d10_8
                        else -> R.drawable.d10_9

                    }
                    diceImage.setImageResource(drawableResources)
                }
                else if (stena == 12){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d12_1
                        2->R.drawable.d12_2
                        3->R.drawable.d12_3
                        4->R.drawable.d12_4
                        5->R.drawable.d12_5
                        6->R.drawable.d12_6
                        7->R.drawable.d12_7
                        8->R.drawable.d12_8
                        9->R.drawable.d12_9
                        10->R.drawable.d12_10
                        11->R.drawable.d12_11
                        else -> R.drawable.d12_12

                    }
                    diceImage.setImageResource(drawableResources)
                }
                else if (stena == 20){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d4_1
                        2->R.drawable.d4_2
                        3->R.drawable.d4_3
                        4->R.drawable.d4_4
                        5->R.drawable.d8_5
                        6->R.drawable.d8_6
                        7->R.drawable.d8_7
                        8->R.drawable.d8_8
                        9->R.drawable.d20_9
                        10->R.drawable.d20_10
                        11->R.drawable.d20_11
                        12->R.drawable.d20_12
                        13->R.drawable.d20_13
                        14->R.drawable.d20_14
                        15->R.drawable.d20_15
                        16->R.drawable.d20_16
                        17->R.drawable.d20_17
                        18->R.drawable.d20_18
                        19->R.drawable.d20_19
                        else -> R.drawable.d20_20

                    }
                    diceImage.setImageResource(drawableResources)
                }
                else{
                    val drawableResources = when(vysledek){
                        (0-4)->R.drawable.d10_00
                        (5-14)->R.drawable.d10_10
                        (15-24)->R.drawable.d10_20
                        (25-34)->R.drawable.d10_30
                        (35-44)->R.drawable.d10_40
                        (45-54)->R.drawable.d10_50
                        (55-64)->R.drawable.d10_60
                        (65-74)->R.drawable.d10_70
                        (75-84)->R.drawable.d10_80
                        (85-94)->R.drawable.d10_90
                        else -> R.drawable.d10_00

                    }
                    diceImage.setImageResource(drawableResources)
                }
        }


        private fun rnd(stena: Int):Int{

            return (1..stena).shuffled().first()
        }

    }