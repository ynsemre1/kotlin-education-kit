package com.example.bottomnavigationkullanimi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var tempFragment:Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.fragmentTutucu, Fragment1())
            .commit()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentTutucu,tempFragment)
            .commit()

        val bottomNavigation: BottomNavigationView = findViewById(R.id.button_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.action_bir -> {
                    tempFragment=Fragment1()
                }
                R.id.action_iki -> {
                    tempFragment=Fragment2()
                }
                R.id.action_uc -> {
                    tempFragment=Fragment3()
                }
            }
            true
        }
    }
}