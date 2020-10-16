package com.gtn.abhis.crackit4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HowToPlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_play)
    }

    override fun onBackPressed() {
        finish()
        val intent = Intent(this@HowToPlay, LoginPage::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
}