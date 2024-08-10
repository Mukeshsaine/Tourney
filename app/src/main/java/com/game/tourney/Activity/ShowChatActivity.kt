package com.game.tourney.Activity

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.game.tourney.R
import com.game.tourney.databinding.ActivityShowChatBinding

class ShowChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityShowChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        // Enable the "up" button (back button)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                // Handle the back button click
                onBackPressed() // or use navController.navigateUp() if using Navigation Component
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}