package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() } // waits for button tap, on button tap
    }                                                // starts the program by calling rollDice()

    // rollDice() creates a dice object, diceRoll rolls the dice by calling the roll function
    // resultTextView updates the dice outcome on the textview of the app layout
    private fun rollDice() {
        val dice = Dice(6)
        val dice2 = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice2.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceRoll2.toString()
    }
}

// Class definition of the dice, roll() method returns a random number
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}