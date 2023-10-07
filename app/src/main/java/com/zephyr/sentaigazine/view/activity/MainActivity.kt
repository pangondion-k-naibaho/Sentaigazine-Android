package com.zephyr.sentaigazine.view.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import com.zephyr.sentaigazine.R
import com.zephyr.sentaigazine.databinding.ActivityMainBinding
import com.zephyr.sentaigazine.model.DummyData.Companion.getDummySentaiData
import com.zephyr.sentaigazine.model.Sentai
import com.zephyr.sentaigazine.view.adapter.ListSentaiAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = MainActivity::class.java

    companion object{
        fun newIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setBackgroundDrawable(ResourcesCompat.getDrawable(this@MainActivity.resources,
            R.color.capri, null))

        setUpView()

    }

    private fun setUpView(){
        binding.rvItemData.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ListSentaiAdapter(getDummySentaiData(), object: ListSentaiAdapter.ItemListener{
                override fun onItemClicked(item: Sentai) {
                    startActivity(
                        DetailActivity.newIntent(this@MainActivity, item)
                    )
                }

            })
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.main_item1 -> {
                startActivity(
                    AboutActivity.newIntent(this@MainActivity)
                )
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }


    }
}