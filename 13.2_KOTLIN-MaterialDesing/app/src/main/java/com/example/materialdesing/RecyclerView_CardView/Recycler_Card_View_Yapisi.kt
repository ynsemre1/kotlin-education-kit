package com.example.materialdesing.RecyclerView_CardView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.materialdesing.R

class Recycler_Card_View_Yapisi : AppCompatActivity() {

    private lateinit var ulkelerList:ArrayList<Ulkeler>
    private lateinit var adapter: recyclerviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_card_view_yapisi)

        val rv:RecyclerView = findViewById(R.id.recyclerView)
        rv.setHasFixedSize(true)
        //Gorunum sekilleri
        //rv.layoutManager=LinearLayoutManager(this)
        //rv.layoutManager= StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        ulkelerList = ArrayList<Ulkeler>()
        val u1 = Ulkeler(1,"Turkiye")
        val u2 = Ulkeler(2,"Almanya")
        val u3 = Ulkeler(3,"Ukranya")
        val u4 = Ulkeler(4,"Rusya")
        val u5 = Ulkeler(5,"Italya")

        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)
        ulkelerList.add(u5)

        adapter = recyclerviewAdapter(this,ulkelerList)
        rv.adapter = adapter



    }
}