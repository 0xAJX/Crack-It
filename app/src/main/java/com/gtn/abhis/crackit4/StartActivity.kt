package com.gtn.abhis.crackit4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.gtn.abhis.crackit4.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding
    private val rotateOpen: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.rotate_open_anim) }
    private val rotateClose: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.rotate_close_anim) }
    private val fromBottom: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.from_bottom_anim) }
    private val toBottom: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.to_bottom_anim) }
    private val toTop: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.to_top_anim) }
    private val fromTop: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.from_top_anim) }

    private var clicked = false

    //Not a login page. Home Page
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.info.setOnClickListener {
            onAddButtonClicked()
        }

        binding.aboutMe.setOnClickListener {
            about()
        }

        binding.howTo.setOnClickListener {
            howtoplay()
        }
    }

    private fun onAddButtonClicked() {
        setVisibility(clicked)
        setAnimation(clicked)
        clicked = !clicked
    }

    private fun setAnimation(clicked: Boolean) {
        if (!clicked) {
            binding.aboutMe.startAnimation(fromBottom)
            binding.howTo.startAnimation(fromTop)
            binding.info.startAnimation(rotateOpen)
        } else {
            binding.aboutMe.startAnimation(toBottom)
            binding.howTo.startAnimation(toTop)
            binding.info.startAnimation(rotateClose)
        }
    }

    private fun setVisibility(clicked: Boolean) {
        if (clicked) {
            binding.aboutMe.visibility = View.INVISIBLE
            binding.howTo.visibility = View.INVISIBLE
        } else {
            binding.aboutMe.visibility = View.VISIBLE
            binding.howTo.visibility = View.VISIBLE
        }
    }

    fun easyPressed(view: View?) {
        val intent = Intent(this, MainActivity::class.java).putExtra("mode", "easy")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun hardPressed(view: View?) {
        val intent = Intent(this, MainActivity::class.java).putExtra("mode", "easy")
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun about() {
        val intent = Intent(this, AboutMeActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun howtoplay() {
        val intent = Intent(this, HowToPlayActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
}