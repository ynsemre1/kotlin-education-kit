package com.example.materialdesing.recylcerViewDetayliTasarim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.materialdesing.R

class recyclerView : AppCompatActivity() {
    private lateinit var filmlerArrayList: ArrayList<filmler>
    private lateinit var adapter: detayliAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val rv:RecyclerView=findViewById(R.id.recylcerViewDetayli)
        rv.setHasFixedSize(true)
        rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val f1 = filmler(1,"Django","django",12.99)
        val f3 = filmler(2,"Inception","inception",10.99)
        val f4 = filmler(3,"Interstellar","interstellar",15.0)
        val f5 = filmler(4,"The Hateful Eight","thehatefuleight",13.50)
        val f6 = filmler(5,"The Pianist","thepianist",11.50)
        val f7 = filmler(6,"Bir Zamanlar Anadolu","birzamanlaranadoluda",12.99)

        filmlerArrayList = ArrayList<filmler>()
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        filmlerArrayList.add(f6)
        filmlerArrayList.add(f7)

        adapter = detayliAdapter(this,filmlerArrayList)
        rv.adapter=adapter


    }

}