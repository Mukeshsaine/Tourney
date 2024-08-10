package com.game.tourney.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.game.tourney.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fcommons.wikimedia.org%2Fwiki%2FFile%3AGoogle_%2522G%2522_Logo.svg&psig=AOvVaw3OSOfvDLb45we_zbEJyp2K&ust=1722419542728000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCKizgLadzYcDFQAAAAAdAAAAABAE";
        //Picasso.get().load(url).into(binding.imageLogo);

        binding.gogleLogin.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}