package com.game.tourney.Activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.game.tourney.databinding.ActivitySplashBinding
import com.squareup.picasso.Picasso

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var url = "https://images.freeimages.com/image/previews/955/crypto-character-icon-cartoon-png-art-5694569.png?fmt=webp&h=350";
        Picasso.get().load(url).into(binding.imageLogo);

        Handler(Looper.getMainLooper()).postDelayed({
            // Start the main activity
            startActivity(Intent(this, MainActivity::class.java))
            // Finish the splash activity
            finish()
        }, 3000) // 2 seconds delay

    }
}