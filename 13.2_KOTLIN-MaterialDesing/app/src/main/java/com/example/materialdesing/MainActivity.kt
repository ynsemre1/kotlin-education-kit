package com.example.materialdesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import com.example.materialdesing.BottomNavigation.BottomNavigation
import com.example.materialdesing.RecyclerView_CardView.Recycler_Card_View_Yapisi
import com.example.materialdesing.TabLayoutYardimsiz.TabLayoutActivity
import com.example.materialdesing.recyclerViewYardimsiz.recylerViewYardimsiz
import com.example.materialdesing.recylcerViewDetayliTasarim.recyclerView


class MainActivity : AppCompatActivity(),SearchView.OnQueryTextListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolBar:Toolbar=findViewById(R.id.toolbar1)
        toolBar.title = "Ozel Tool Bar"
        toolBar.subtitle = "Ozel Sub Title"
        toolBar.setLogo(R.drawable.ic_baseline_brightness_high_24)
        toolBar.setTitleTextColor(resources.getColor(R.color.purple_200))
        setSupportActionBar(toolBar)

        val sayfa1:Button=findViewById(R.id.sayfa1)
        sayfa1.setOnClickListener {
            startActivity(Intent(this@MainActivity, FloatActionButton_FAB::class.java))
        }

        val sayfa2:Button=findViewById(R.id.sayfa2)
        sayfa2.setOnClickListener {
            startActivity(Intent(this@MainActivity, EditText_FloatingLabels_TextInput::class.java))
        }

        val sayfa3:Button=findViewById(R.id.sayfa3)
        sayfa3.setOnClickListener {
            startActivity(Intent(this@MainActivity, Recycler_Card_View_Yapisi::class.java))
        }

        val sayfa4:Button=findViewById(R.id.sayfa4)
        sayfa4.setOnClickListener {
            startActivity(Intent(this@MainActivity, recylerViewYardimsiz::class.java))
        }

        val sayfa5:Button=findViewById(R.id.sayfa5)
        sayfa5.setOnClickListener {
            startActivity(Intent(this@MainActivity, recyclerView::class.java))
        }

        val sayfa6:Button=findViewById(R.id.sayfa6)
        sayfa6.setOnClickListener {
            startActivity(Intent(this@MainActivity, BottomNavigation::class.java))
        }

        val sayfa7:Button=findViewById(R.id.sayfa7)
        sayfa7.setOnClickListener {
            startActivity(Intent(this@MainActivity, TabLayoutActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        val item = menu.findItem(R.id.action_arama)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_bilgi -> {
                Toast.makeText(applicationContext,"Bilgi",Toast.LENGTH_SHORT)
                    .show()
                return true
            }
            R.id.action_ayarlar -> {
                Toast.makeText(applicationContext,"Ayarlar",Toast.LENGTH_SHORT)
                    .show()
                return true
            }
            R.id.action_ekle -> {
                Toast.makeText(applicationContext,"Ekle",Toast.LENGTH_SHORT)
                    .show()
                return true
            }
            R.id.action_cikis -> {
                Toast.makeText(applicationContext,"Cikis",Toast.LENGTH_SHORT)
                    .show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        Toast.makeText(applicationContext,"onQueryTextSumbit"+query,Toast.LENGTH_SHORT)
            .show()
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        //Toast.makeText(applicationContext,"onQueryTextChange"+newText,Toast.LENGTH_SHORT) .show()
        return true
    }
}