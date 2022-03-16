package com.example.bruh7

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mclaren = findViewById<RadioButton>(R.id.radio)
        val koenigsegg = findViewById<RadioButton>(R.id.radio2)
        val ferrari = findViewById<RadioButton>(R.id.radio3)
        val dodge = findViewById<RadioButton>(R.id.radio4)
        val wyswietl = findViewById<Button>(R.id.button)
        wyswietl.setOnClickListener {
            var wybor = ""
            if (mclaren.isChecked)
            {
                wybor = "McLaren"
            }
            else if(koenigsegg.isChecked)
            {
                wybor = "Koenigsegg"
            }
            else if(ferrari.isChecked)
            {
                wybor = "Ferrari"
            }
            else
            {
                wybor = "Dodge"
            }
            Toast.makeText(applicationContext,"wybrales:"+wybor, Toast.LENGTH_SHORT).show()
        }
    }
}