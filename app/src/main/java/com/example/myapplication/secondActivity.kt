package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.Random as Random1

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        // Generate the random number
        val random = (0..count).random()

        findViewById<TextView>(R.id.textView2).text = random.toString()

        findViewById<TextView>(R.id.randomHeader).text = getString(R.string.random_heading, count)


    }
}
