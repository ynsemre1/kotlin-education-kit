package com.example.tablayoutkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val fragmentList = ArrayList<Fragment>()
    private val viewPagerBaslikList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout:TabLayout=findViewById(R.id.tabLayoutId)
        val viewPager:ViewPager2=findViewById(R.id.viewPagerId)

        val adapter = PagerAdapter(this)
        viewPager.adapter = adapter

        fragmentList.add(FragmentBirinci())
        fragmentList.add(FragmentIkinci())
        fragmentList.add(FragmentUcuncu())
        viewPagerBaslikList.add("Bir")
        viewPagerBaslikList.add("Iki")
        viewPagerBaslikList.add("Uc")

        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            tab.setText(viewPagerBaslikList[position])
        }.attach()

        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_baseline_android_24)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_airplanemode_active_24)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_beach_access_24)
    }

    inner class PagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {
            return fragmentList.size
        }

        override fun createFragment(position: Int): Fragment {
            return fragmentList[position]
        }

    }
}