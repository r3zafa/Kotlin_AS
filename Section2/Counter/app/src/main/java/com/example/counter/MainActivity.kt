package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //my code
        // val btnClick = findViewById (R.id.button) as Button
        // in kotlin you can speak to component directly as shown in (1)
        //val textView = findViewById (R.id.textView2) as TextView
        // in kotlin you can speak to component directly as shown in (2)
        var timesClicked = 0
        // -------------- set on-click listener

        // (1) - using componentname directly instead of:
        // btnClick.setOnClickListener {
        btn1.setOnClickListener {
            timesClicked = timesClicked + 1
            // textView.text = timesClicked.toString()
            teView.text = timesClicked.toString()
        // set on-click listener
                Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_SHORT).show()
            }
        }

    }