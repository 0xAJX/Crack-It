package com.gtn.abhis.crackit4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EndScreenActivity : AppCompatActivity() {
    lateinit var who: TextView
    lateinit var guess: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

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
        val intent = Intent(this, StartActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
}