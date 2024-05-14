package com.example.materialdesing.TabLayoutYardimsiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.materialdesing.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutActivity : AppCompatActivity() {
    private var fragmentler = ArrayList<Fragment>()
    private var basliklar = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val tabAdi: TabLayout = findViewById(R.id.tabAdi)
        val viewAdi: ViewPager2 = findViewById(R.id.viewAdi)

        val adapter= adapteradi(this)
        viewAdi.adapter = adapter

        fragmentler.add(Fragment1())
        fragmentler.add(Fragment2())
        fragmentler.add(Fragment3())
        basliklar.add("Birinci")
        basliklar.add("Ikinci")
        basliklar.add("Ucuncu")

        TabLayoutMediator(tabAdi, viewAdi) { tab, position ->
            tab.setText(basliklar[position])
        }.attach()

        tabAdi.getTabAt(0)!!.setIcon(R.drawable.resim1)
        tabAdi.getTabAt(1)!!.setIcon(R.drawable.resim2)
        tabAdi.getTabAt(2)!!.setIcon(R.drawable.resim3)
    }

    inner class adapteradi(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {
            return fragmentler.size
        }

        override fun createFragment(position: Int): Fragment {
            return fragmentler[position]
        }

    }
}
