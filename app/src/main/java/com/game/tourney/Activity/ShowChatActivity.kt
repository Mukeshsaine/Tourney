package com.game.tourney.Activity

import android.os.Bundle
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



    }
}