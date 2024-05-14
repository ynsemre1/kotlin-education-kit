package com.info.sayfalararasiveritasima.FragmentOgreniyorum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.info.sayfalararasiveritasima.R

class Fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragment = supportFragmentManager
        val fragment2 = fragment.beginTransaction()

        fragment2.add(R.id.fragment_tutucu1, FragmentBirinci())
        fragment2.add(R.id.fragment_tutucu2, FragmentIkinci())

        fragment2.commit()
    }
}