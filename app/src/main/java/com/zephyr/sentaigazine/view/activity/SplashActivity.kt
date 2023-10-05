package com.zephyr.sentaigazine.view.activity

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.zephyr.sentaigazine.databinding.ActivityMainBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = SplashActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

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