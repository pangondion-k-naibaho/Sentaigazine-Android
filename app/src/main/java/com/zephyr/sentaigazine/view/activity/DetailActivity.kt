package com.zephyr.sentaigazine.view.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
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

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.abtxt_SentaiDetailTitle)
            setBackgroundDrawable(ResourcesCompat.getDrawable(this@DetailActivity.resources, R.color.capri, null))
        }

        setUpView()
    }

    private fun setUpView(){
        val retrievedSentai = intent.extras!!.getParcelable<Sentai>(EXTRA_SENTAI)!!
        Log.d(TAG, "retrieved Sentai: ${retrievedSentai}")

        binding.apply {
            ivSentaiDescription.background = ContextCompat.getDrawable(this@DetailActivity, retrievedSentai.sentaiPhoto)
            tvSentaiName.text = retrievedSentai.name
            tvSentaiProd.text = String.format(getString(R.string.tv_YearProdTitle, retrievedSentai.productionYear))
            tvSentaiRating.text = String.format(getString(R.string.tv_RatingTitle, retrievedSentai.rating.toString()))
            tvTotalMemberSentai.text = String.format(getString(R.string.tv_TotalMember, retrievedSentai.totalMember.toString()))
            tvSentaiDescriptionContent.text = retrievedSentai.detailStory
            btnSearchMerchandise.setOnClickListener {
                val merchIntent = Intent(Intent.ACTION_VIEW, Uri.parse(retrievedSentai.urlMerchandise))
                startActivity(merchIntent)
            }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            android.R.id.home -> {
                finish()
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }


    }
}