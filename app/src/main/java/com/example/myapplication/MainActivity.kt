package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this, "Hello I'm Toasted!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View){
        val currentTextCount = findViewById<TextView>(R.id.textView3)

        val currentCount = currentTextCount.text.toString().toInt()

        val nextCount = currentCount + 1

        currentTextCount.text = nextCount.toString()

    }

    fun randomMe(view:View) {
        //get current count
        val currentTextCount = findViewById<TextView>(R.id.textView3)
        val currentCount = currentTextCount.text.toString().toInt()
        ////

        val randomIntent = Intent(this, secondActivity::class.java)

        randomIntent.putExtra(secondActivity.TOTAL_COUNT , currentCount)

        startActivity(randomIntent)
    }
}
