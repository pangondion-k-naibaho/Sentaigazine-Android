package com.zephyr.sentaigazine.view.activity

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.zephyr.sentaigazine.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    private val TAG = SplashActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        actionBar?.hide()

        setUpView()
    }

    private fun setUpView(){
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                MainActivity.newIntent(this@SplashActivity)
            )
        },4000)

        finish()
    }
}