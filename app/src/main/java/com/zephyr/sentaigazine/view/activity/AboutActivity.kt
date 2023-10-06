package com.zephyr.sentaigazine.view.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zephyr.sentaigazine.R
import com.zephyr.sentaigazine.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private val TAG = AboutActivity::class.java.simpleName
    private lateinit var binding: ActivityAboutBinding

    companion object{
        fun newIntent(context: Context): Intent = Intent(context, AboutActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    private fun setUpView(){
        binding.tvNameAbout.text = getString(R.string.tv_AboutName)
        binding.tvEmailAbout.text = getString(R.string.tv_AboutEmail)
    }
}