package com.example.navigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView=findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { menuItem->
            when(menuItem.itemId){
                R.id.bottom_home->{
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.bottom_search->{
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.bottom_add->{
                    replaceFragment(AddFragment())
                    true
                }
                R.id.bottom_reel->{
                    replaceFragment(ReelFragment())
                    true
                }
                R.id.bottom_profile->{
                    replaceFragment(ProfileFragment())
                    true
                }
                else->false
            }
        }
        replaceFragment(HomeFragment())
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(  R.id.frame_container,fragment).commit()

    }
}