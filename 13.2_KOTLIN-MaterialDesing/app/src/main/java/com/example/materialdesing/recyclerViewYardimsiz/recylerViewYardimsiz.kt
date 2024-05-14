package com.example.materialdesing.recyclerViewYardimsiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.marginTop
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.materialdesing.R
import com.example.recyclerviewyardimsiz.Adapter
import com.example.recyclerviewyardimsiz.Ulkeler

class recylerViewYardimsiz : AppCompatActivity() {
    private lateinit var ulkelerList:ArrayList<Ulkeler>
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyler_view_yardimsiz)

        val rv: RecyclerView =findViewById(R.id.recyclerView)
        rv.setHasFixedSize(true)
        rv.marginTop
        //Gorunum sekilleri
        //rv.layoutManager=LinearLayoutManager(this)
        rv.layoutManager= StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        //rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        ulkelerList = ArrayList<Ulkeler>()
        val u1 = Ulkeler(1,"Turkiye")
        val u2 = Ulkeler(2,"Ukrayna")
        val u3 = Ulkeler(3,"Rusya")
        val u4 = Ulkeler(4,"MuzCumhuriyeti")
        val u5 = Ulkeler(5,"Sakarya")
        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)
        ulkelerList.add(u5)

        adapter = Adapter(this,ulkelerList)
        rv.adapter = adapter

    }
}