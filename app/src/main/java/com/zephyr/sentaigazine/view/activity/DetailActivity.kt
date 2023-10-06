package com.zephyr.sentaigazine.view.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.zephyr.sentaigazine.R
import com.zephyr.sentaigazine.databinding.ActivityDetailBinding
import com.zephyr.sentaigazine.model.Sentai

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private val TAG = DetailActivity::class.java.simpleName

    companion object{
        const val EXTRA_SENTAI = "EXTRA_SENTAI"
        fun newIntent(context: Context, deliveredSentai: Sentai): Intent = Intent(context, DetailActivity::class.java)
            .putExtra(EXTRA_SENTAI, deliveredSentai)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    private fun setUpView(){
        val retrievedSentai = intent.extras!!.getParcelable<Sentai>(EXTRA_SENTAI)!!
        Log.d(TAG, "retrieved Sentai: ${retrievedSentai}")
    }
}