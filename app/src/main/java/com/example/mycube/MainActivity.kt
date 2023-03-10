package com.example.mycube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.cube)
        val button = findViewById<Button>(R.id.random_button)
        val number6 = findViewById<TextView>(R.id.lucky6)

        // codeblock which runs on every click
        button.setOnClickListener {
            println("click")
            val random = (1..6).random()
            number6.text = ""
                    
            when (random) {
                1 -> image.setImageResource(R.drawable.dice_1)
                2 -> image.setImageResource(R.drawable.dice_2)
                3 -> image.setImageResource(R.drawable.dice_3)
                4 -> image.setImageResource(R.drawable.dice_4)
                5 -> image.setImageResource(R.drawable.dice_5)
                6 -> {image.setImageResource(R.drawable.dice_6)
                     number6.text = "You are the lucky one!"}
                }
            }
        }
}


