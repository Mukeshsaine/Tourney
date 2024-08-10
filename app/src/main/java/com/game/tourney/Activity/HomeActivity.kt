package com.game.tourney.Activity

import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.game.tourney.Fragment.ClanFragment
import com.game.tourney.Fragment.HomeFragment
import com.game.tourney.Fragment.ProfileFragment
import com.game.tourney.Fragment.ScoreBoardFragment
import com.game.tourney.Fragment.chatFragment
import com.game.tourney.R
import com.game.tourney.databinding.ActivityHomeBinding
import com.google.android.material.navigation.NavigationView


class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView
    private lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = ContextCompat.getColor(this, com.game.tourney.R.color.black)
        }

        drawerLayout = findViewById(com.game.tourney.R.id.drawer_layout)
        navView = findViewById(com.game.tourney.R.id.nav_view)
        setSupportActionBar(binding.toolbar)
        loadFragment(HomeFragment())
     // DrawerMenu()
        Bottom_Navigation()



    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(com.game.tourney.R.id.nav_host_fragment,fragment)
        transaction.commit()
    }
    private fun Bottom_Navigation() {


        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                com.game.tourney.R.id.nav_home -> {
                    loadFragment(HomeFragment())
                    true
                }
                com.game.tourney.R.id.ScoreBoard -> {
                    loadFragment(ScoreBoardFragment())
                    true
                }
                com.game.tourney.R.id.Clan -> {
                    loadFragment(ClanFragment())
                    true
                }
                com.game.tourney.R.id.chat -> {
                    loadFragment(chatFragment())
                    true
                }
                com.game.tourney.R.id.Profile -> {
                    loadFragment(ProfileFragment())
                    true
                }

                else -> false
            }
        }
    }

    /* private fun DrawerMenu() {
         toggle = ActionBarDrawerToggle(this, drawerLayout, binding.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
         drawerLayout.addDrawerListener(toggle)
         toggle.syncState()


         if (savedInstanceState == null) {
             supportFragmentManager.beginTransaction()
                 .replace(R.id.nav_host_fragment, HomeFragment())
                 .commit()
         }
         binding.navView.setNavigationItemSelectedListener { menuItem ->
             when (menuItem.itemId) {
                 R.id.nav_home -> {
                     // Handle Home
                     Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()
                 }
                 R.id.nav_gallery -> {
                     // Handle Settings
                     Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                 }
                 // Handle more items here
             }
             drawerLayout.closeDrawer(GravityCompat.START)
             true
         }
     }*/


    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}