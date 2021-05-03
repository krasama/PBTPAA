package com.example.dnd

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.hod_kostkou.*

//import kotlinx.android.synthetic.main.hod_kostkou*

class Kostka: AppCompatActivity() {

    lateinit var dice_image: ImageView


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

                var vysledek = hod(pocet, stena)

            }


            back_hod.setOnClickListener {
                this.setContentView(R.layout.activity_main)
            }

        }

        fun hod(pocet:Int, stena: Int) {
            var vysledek: Int = 0
            for (i in 1 .. pocet){
                vysledek = rnd(stena)
                //return vysledek
            }
                if (stena ==4){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d6_1
                        2->R.drawable.d6_2
                        3->R.drawable.d6_3
                        else -> R.drawable.d6_4

                    }
                    dice_image.setImageResource(drawableResources)
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
                    dice_image.setImageResource(drawableResources)
                }
                else if (stena == 8){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d6_1
                        2->R.drawable.d6_2
                        3->R.drawable.d6_3
                        4->R.drawable.d6_4
                        5->R.drawable.d6_5
                        6->R.drawable.d6_5
                        7->R.drawable.d6_5
                        else -> R.drawable.d6_6

                    }
                    dice_image.setImageResource(drawableResources)
                }
                else if (stena == 10){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d6_1
                        2->R.drawable.d6_2
                        3->R.drawable.d6_3
                        4->R.drawable.d6_4
                        5->R.drawable.d6_5
                        6->R.drawable.d6_5
                        7->R.drawable.d6_5
                        8->R.drawable.d6_5
                        9->R.drawable.d6_5
                        else -> R.drawable.d6_6

                    }
                    dice_image.setImageResource(drawableResources)
                }
                else if (stena == 12){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d6_1
                        2->R.drawable.d6_2
                        3->R.drawable.d6_3
                        4->R.drawable.d6_4
                        5->R.drawable.d6_5
                        6->R.drawable.d6_5
                        7->R.drawable.d6_5
                        8->R.drawable.d6_5
                        9->R.drawable.d6_5
                        10->R.drawable.d6_5
                        11->R.drawable.d6_5
                        else -> R.drawable.d6_6

                    }
                    dice_image.setImageResource(drawableResources)
                }
                else if (stena == 20){
                    val drawableResources = when(vysledek){
                        1->R.drawable.d6_1
                        2->R.drawable.d6_2
                        3->R.drawable.d6_3
                        4->R.drawable.d6_4
                        5->R.drawable.d6_5
                        6->R.drawable.d6_5
                        7->R.drawable.d6_5
                        8->R.drawable.d6_5
                        9->R.drawable.d6_5
                        10->R.drawable.d6_5
                        11->R.drawable.d6_5
                        12->R.drawable.d6_5
                        13->R.drawable.d6_5
                        14->R.drawable.d6_5
                        15->R.drawable.d6_5
                        16->R.drawable.d6_5
                        17->R.drawable.d6_5
                        18->R.drawable.d6_5
                        19->R.drawable.d6_5
                        else -> R.drawable.d6_6

                    }
                    dice_image.setImageResource(drawableResources)
                }
                else{
                    // TODO: 26.04.2021
                }

        }

        fun rnd(stena: Int):Int{

            return (1..stena).shuffled().first()
        }

    }