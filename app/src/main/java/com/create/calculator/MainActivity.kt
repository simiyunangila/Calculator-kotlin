package com.create.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    lateinit var tiltitle: TextView
    lateinit var tilfirst: TextView
    lateinit var tilsecond: TextView
    lateinit var tiloutput: TextView
    lateinit var tilbutton1: Button
    lateinit var tilbtn2: Button
    lateinit var tilbtn3: Button
    lateinit var tilbtn4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilfirst = findViewById(R.id.tilfirst)
        tilsecond = findViewById(R.id.tilbtn2)
        tiloutput = findViewById(R.id.tiloutput)
        addNumbers()
        subNumbers()
        multiplyNumbers()
        divideNumbers()
    }
    fun addNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second = findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbutton1)
        button.setOnClickListener {
            var sumfirst = first.text.toString().toInt()
            var sumsecond = second.text.toString().toInt()
            val result = sumfirst!! + sumsecond!!
            tiloutput!!.text = result.toString()
            Toast.makeText(this, "Addition", Toast.LENGTH_SHORT).show()

        }
    }
    fun subNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second=findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbtn4)
        button.setOnClickListener {
            var sub = first.text.toString().toInt()
            var sub2 = second.text.toString().toInt()
            val result = sub!! - sub2!!
            tiloutput!!.text = result.toString()
            Toast.makeText(this, "Subtraction", Toast.LENGTH_SHORT).show()
        }
    }
    fun multiplyNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second = findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbtn2)
        button.setOnClickListener {
            var multi = first.text.toString().toInt()
            var multi2 = second.text.toString().toInt()
            val output = multi!! * multi2!!
            tiloutput!!.text = output.toString()
            Toast.makeText(this, "Multiplication", Toast.LENGTH_SHORT).show()
        }
    }
    fun divideNumbers() {
        var first = findViewById<TextView>(R.id.tilfirst)
        var second = findViewById<TextView>(R.id.tilseconnd)
        var button = findViewById<Button>(R.id.tilbtn3)
        button.setOnClickListener {
            var divide = first.text.toString().toInt()
            var divide2 = second.text.toString().toInt()
            val output = divide!! % divide2!!
            tiloutput!!.text = output.toString()
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }
}