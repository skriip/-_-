package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.id


class MainActivity : AppCompatActivity() {

    private var a = 0
    private var b = 0
    private var v = ""
    private var chetv = 0
    private var chetn = 0
    private var vern = 0
    private var result = ""
    private  var rest=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a = (0..100).random()
        b = (0..100).random()
        val dest = arrayOf("/", "*", "+", "-")
        v = dest.random()
        if (v == "/")
        {
            while(a % b != 0)
            {
                a = (10..99).random()
                b = (10..99).random()
            }
        }
        chetv = 0
        chetn = 0
        vern = 0
        var editText: EditText =  findViewById(id.editTextNumber)
        result = editText.text.toString()

    }
    fun butStart(view: View) {
        var textView: TextView =  findViewById(id.textView)
        var textView1: TextView = findViewById(id.textView3)
        var textView2: TextView = findViewById(id.textView2)
        textView.text = a.toString()
        textView1.text = (b.toString())
        textView2.text = v
    }
    fun buttonCheck(view: View) {
        try {
            var textView11: TextView = findViewById(id.textView11)
            when (v) {
                "*" -> vern = a * b
                "-" -> vern = a - b
                "+" -> vern = a + b
                "/" -> vern = a / b
            }
            if (result.toInt() == vern) {
                chetn++
                chetv++
                val avc="sd"

            } else {
                chetn++
            }
            val correctPercentage = (chetv.toFloat() / chetn) * 100
            val otvet = String.format("%.2f%%", correctPercentage)
            textView11.text = otvet


        }
        catch(ex:Exception){}
    }

}