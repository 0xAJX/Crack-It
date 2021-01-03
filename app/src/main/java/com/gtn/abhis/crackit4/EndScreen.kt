package com.gtn.abhis.crackit4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EndScreen : AppCompatActivity() {
    lateinit var who: TextView
    lateinit var guess: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_screen)
        who = findViewById(R.id.endtext)
        guess = findViewById(R.id.guess)
        val result = intent.getStringExtra("who")
        if (result == "lost") {
            who.setText("Better Luck Next Time")
        } else {
            who.setText("You Won!!!")
            guess.setText("No of guess required: $result")
        }
    }

    fun tohome(view: View?) {
        val intent = Intent(this, LoginPage::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
}