package com.example.vangtichai

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvAmount: TextView
    private lateinit var tv500: TextView
    private lateinit var tv100: TextView
    private lateinit var tv50: TextView
    private lateinit var tv20: TextView
    private lateinit var tv10: TextView
    private lateinit var tv5: TextView
    private lateinit var tv2: TextView
    private lateinit var tv1: TextView

    private var amount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvAmount = findViewById(R.id.tvAmount)
        tv500 = findViewById(R.id.tv500)
        tv100 = findViewById(R.id.tv100)
        tv50 = findViewById(R.id.tv50)
        tv20 = findViewById(R.id.tv20)
        tv10 = findViewById(R.id.tv10)
        tv5 = findViewById(R.id.tv5)
        tv2 = findViewById(R.id.tv2)
        tv1 = findViewById(R.id.tv1)

        findViewById<Button>(R.id.btn0).setOnClickListener { addDigit(0) }
        findViewById<Button>(R.id.btn1).setOnClickListener { addDigit(1) }
        findViewById<Button>(R.id.btn2).setOnClickListener { addDigit(2) }
        findViewById<Button>(R.id.btn3).setOnClickListener { addDigit(3) }
        findViewById<Button>(R.id.btn4).setOnClickListener { addDigit(4) }
        findViewById<Button>(R.id.btn5).setOnClickListener { addDigit(5) }
        findViewById<Button>(R.id.btn6).setOnClickListener { addDigit(6) }
        findViewById<Button>(R.id.btn7).setOnClickListener { addDigit(7) }
        findViewById<Button>(R.id.btn8).setOnClickListener { addDigit(8) }
        findViewById<Button>(R.id.btn9).setOnClickListener { addDigit(9) }

        findViewById<Button>(R.id.btnClear).setOnClickListener {

            amount = 0
            updateScreen()

        }

        updateScreen()

    }

    private fun addDigit(digit: Int) {

        amount = amount * 10 + digit
        updateScreen()

    }

    private fun updateScreen() {

        tvAmount.text = "Taka: $amount"

        var remaining = amount

        val note500 = remaining / 500
        remaining %= 500

        val note100 = remaining / 100
        remaining %= 100

        val note50 = remaining / 50
        remaining %= 50

        val note20 = remaining / 20
        remaining %= 20

        val note10 = remaining / 10
        remaining %= 10

        val note5 = remaining / 5
        remaining %= 5

        val note2 = remaining / 2
        remaining %= 2

        val note1 = remaining

        tv500.text = "500: $note500"
        tv100.text = "100: $note100"
        tv50.text = "50: $note50"
        tv20.text = "20: $note20"
        tv10.text = "10: $note10"
        tv5.text = "5: $note5"
        tv2.text = "2: $note2"
        tv1.text = "1: $note1"

    }

}