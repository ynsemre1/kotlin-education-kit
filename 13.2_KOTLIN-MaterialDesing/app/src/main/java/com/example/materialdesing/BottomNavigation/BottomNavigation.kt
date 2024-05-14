package com.example.materialdesing.BottomNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.example.materialdesing.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigation : AppCompatActivity() {
    private lateinit var fragmentTemplate:Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        supportFragmentManager.beginTransaction().add(R.id.bottomNavID,FragmentBir())
            .commit()



        val bottomNav:BottomNavigationView=findViewById(R.id.bottomNavID)
        bottomNav.setOnNavigationItemSelectedListener {menuItem ->
            when(menuItem.itemId){
                R.id.action_bir -> {
                    fragmentTemplate=FragmentBir()
                }
                R.id.action_iki -> {
                    fragmentTemplate=FragmentIki()
                }
                R.id.action_uc -> {
                    fragmentTemplate=FragmentUc()
                }
                else -> false
            }
            supportFragmentManager.beginTransaction().replace(R.id.bottomNavID,fragmentTemplate)
                .commit()
            true
        }
    }
}