package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    lateinit var tvprimary: TextView
    lateinit var tvsecondary: TextView
    lateinit var bac: Button
    lateinit var bc: Button
    lateinit var bob: Button
    lateinit var bcb: Button
    lateinit var bsin: Button
    lateinit var bcos: Button
    lateinit var btan: Button
    lateinit var blog: Button
    lateinit var bln: Button
    lateinit var bfac: Button
    lateinit var bsquare: Button
    lateinit var broot: Button
    lateinit var binverse: Button
    lateinit var bdiv: Button
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var b3: Button
    lateinit var b2: Button
    lateinit var b1: Button
    lateinit var b0: Button
    lateinit var bpi: Button
    lateinit var bdot: Button
    lateinit var badd: Button
    lateinit var bsub: Button
    lateinit var bmul: Button
    lateinit var bequal: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvsecondary = findViewById(R.id.idTVSecondary)
        tvprimary = findViewById(R.id.idTVprimary)
        bac = findViewById(R.id.bac)
        bc = findViewById(R.id.bc)
        bob = findViewById(R.id.bbrac1)
        bcb = findViewById(R.id.bbrac2)
        bsin = findViewById(R.id.bsin)
        bcos = findViewById(R.id.bcos)
        blog = findViewById(R.id.blog)
        bln = findViewById(R.id.bln)
        bdiv = findViewById(R.id.bdiv)
        btan = findViewById(R.id.btan)
        bsquare = findViewById(R.id.bsquare)
        broot = findViewById(R.id.bsqrt)
        bfac = findViewById(R.id.bfact)
        binverse = findViewById(R.id.binv)
        badd = findViewById(R.id.bplus)
        bsub = findViewById(R.id.bminus)
        bmul = findViewById(R.id.bmul)
        bequal = findViewById(R.id.bequal)
        bdot = findViewById(R.id.bdot)
        bpi = findViewById(R.id.bpi)
        b0 = findViewById(R.id.b0)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        b1.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "1"
        }
        b2.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "2"
        }
        b3.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "3"
        }
        b4.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "4"
        }
        b5.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "5"
        }
        b6.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "6"
        }
        b7.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "7"
        }
        b8.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "8"
        }
        b9.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "9"
        }
        b0.setOnClickListener() {
            tvprimary.text = tvprimary.text.toString() + "0"
        }
        bdot.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + ".")
        }
        badd.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "+")
        }
        bdiv.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "/")
        }
        bob.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "(")
        }
        bcb.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + ")")
        }
        bsin.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "sin")
        }
        bcos.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "cos")
        }
        btan.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "tan")
        }
        binverse.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "^" + "(-1)")
        }
        bln.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "ln")
        }
        blog.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "log")
        }
        bpi.setOnClickListener {
            tvprimary.text = (tvprimary.text.toString() + "3.142")
            tvsecondary.text = (bpi.text.toString())
        }
        bac.setOnClickListener {
            tvprimary.setText("")
            tvsecondary.setText("")
        }
        bc.setOnClickListener {
            var str: String = tvprimary.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                tvprimary.text = str
            }
        }
        fun factorial(n: Int): Int {
            return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
        }
        bfac.setOnClickListener() {
            if (tvprimary.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number...", Toast.LENGTH_LONG).show()
            } else {
                val value: Int = tvprimary.text.toString().toInt()
                val fact: Int = factorial(value)
                tvprimary.setText(fact.toString())
                tvsecondary.text = "$value`!"
            }
        }
        bequal.setOnClickListener {
            val str: String = tvprimary.text.toString()
            val result: Double = evaluate(str)
            val r = result.toString()
            tvprimary.setText(r)
            tvsecondary.text = str
        }
        bsub.setOnClickListener {
            val str: String = tvprimary.text.toString()
            if (!str.get(index = str.length - 1).equals("-")) {
                tvprimary.text = (tvprimary.text.toString() + "-")
            }
        }
        bmul.setOnClickListener {
            val str: String = tvprimary.text.toString()
            if (!str.get(index = str.length - 1).equals("*")) {
                tvprimary.text = (tvprimary.text.toString() + "*")
            }
        }
        broot.setOnClickListener {
            if (tvprimary.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = tvprimary.text.toString()
                val r = sqrt(str.toDouble())
                val result = r.toString()
                tvprimary.text = result
            }
        }
        bsquare.setOnClickListener(){
            if (tvprimary.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number...", Toast.LENGTH_LONG).show()
            } else {
                val value: Double = tvprimary.text.toString().toDouble()
                val sq: Double = value * value
                tvprimary.text=sq.toString()
                tvsecondary.text = "$value²"
            }
        }
    }

    private fun evaluate(str: String): Double {
        return object : Any() {
            var pos = -1
            var ch = 0
            fun nextChar() {
                ch = if (++pos < str.length) str[pos].code else -1
            }

            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.code) nextChar()
                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }

            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }

            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.code)) x += parseTerm() // addition
                    else if (eat('-'.code)) x -= parseTerm() // subtraction
                    else return x
                }
            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.code)) x *= parseFactor()
                    else if (eat('/'.code)) x /= parseFactor()
                    else return x
                }
            }

            fun parseFactor(): Double {
                if (eat('+'.code)) return parseFactor()
                if (eat('-'.code)) return -parseFactor()
                var x: Double
                val startPos = pos
                if (eat('('.code)) {
                    x = parseExpression()
                    eat(')'.code)
                } else if (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) {
                    while (ch >= '0'.code && ch <= '9'.code || ch == '.'.code) nextChar()
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.code && ch <= 'z'.code) {
                    while (ch >= 'a'.code && ch <= 'z'.code) nextChar()
                    val func = str.substring(startPos, pos)
                    x = parseFactor()
                    x =
                        if (func == "sqrt") sqrt(x)
                        else if (func == "sin") sin(
                            Math.toRadians(x)
                        ) else if (func == "cos") cos(
                            Math.toRadians(x)
                        ) else if (func == "tan")
                            tan(Math.toRadians(x))
                        else if (func == "log")
                            log10(x)
                        else if (func == "ln") ln(x)
                        else throw RuntimeException(
                            "Unknown function: $func"
                        )
                } else {
                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                if (eat('^'.code)) x = x.pow(parseFactor())
                return x
            }
        }.parse()

    }

}
