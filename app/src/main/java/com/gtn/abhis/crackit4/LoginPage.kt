package com.gtn.abhis.crackit4

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {
    //Not a login page. Home Page
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
    }

    fun easypressed(view: View?) {
        val intent = Intent(this, MainActivity::class.java).putExtra("mode", "easy")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun hardpressed(view: View?) {
        val intent = Intent(this, MainActivity::class.java).putExtra("mode", "easy")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun about(view: View?) {
        val intent = Intent(this, AboutMe::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun howtoplay(view: View?) {
        val intent = Intent(this, HowToPlay::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun quitit(view: View?) {
        System.exit(1)
    }
}