package com.example.navigationdrawer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var tempFragment:Fragment
    lateinit var drawerLay:DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbarAdi:Toolbar=findViewById(R.id.toolbarID)
        toolbarAdi.title= "NavigationDrawer"
        setSupportActionBar(toolbarAdi)

        drawerLay = findViewById(R.id.drawer)
        val toogle = ActionBarDrawerToggle(this,drawerLay,toolbarAdi,0,0)
        drawerLay.addDrawerListener(toogle)
        toogle.syncState()

        supportFragmentManager.beginTransaction().add(R.id.fragmentTutucu,FragmentBirinci()).commit()

        val navViewAdi:NavigationView=findViewById(R.id.navigationViewID)

        val baslikTanimlama = navViewAdi.inflateHeaderView(R.layout.navibaslik)
        val baslikText:TextView = baslikTanimlama.findViewById(R.id.Baslik1)
        val baslikText2:TextView = baslikTanimlama.findViewById(R.id.Baslik2)
        baslikText.text="Selam"
        baslikText2.text="Naber"

        navViewAdi.setNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.nav_action_birinci -> {
                    tempFragment=FragmentBirinci()
                }
                R.id.nav_avtion_ikinci -> {
                    tempFragment=FragmentIkinci()
                }
                R.id.nav_action_ucuncu -> {
                    tempFragment=FragmentUcuncu()
                }
            }
            supportFragmentManager.beginTransaction().replace(R.id.fragmentTutucu,tempFragment).commit()
            drawerLay.closeDrawer(GravityCompat.END)
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.action_toogle){
            drawerLay.openDrawer(GravityCompat.END)
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toogle,menu)
        return true
    }

    override fun onBackPressed() {
        val drawerLay:DrawerLayout=findViewById(R.id.drawer)
        if(drawerLay.isDrawerOpen(GravityCompat.START)){
            drawerLay.closeDrawer(GravityCompat.START)
        }else{
            val intentAdi = Intent(Intent.ACTION_MAIN)
            intentAdi.addCategory(Intent.CATEGORY_HOME)
            intentAdi.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intentAdi)
        }
    }
}