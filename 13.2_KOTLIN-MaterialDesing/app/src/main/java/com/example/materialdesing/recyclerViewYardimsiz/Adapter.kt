package com.example.recyclerviewyardimsiz

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.materialdesing.R

class Adapter(private val mContext: Context, private val ulkeList: ArrayList<Ulkeler>) :
    RecyclerView.Adapter<Adapter.nesneTutucu>() {

    inner class nesneTutucu(view: View) : RecyclerView.ViewHolder(view) {
        var cardView: CardView = view.findViewById(R.id.cardView)
        var moreResim: ImageView = view.findViewById(R.id.moreCubuk)
        var text1: TextView = view.findViewById(R.id.ulkelerText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): nesneTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.cardview, parent, false)
        return nesneTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: nesneTutucu, position: Int) {
        val ulke = ulkeList[position]
        val popup = PopupMenu(mContext, holder.moreResim)
        popup.menuInflater.inflate(R.menu.moremenu, popup.menu)
        holder.text1.text = ulke.ulkeIsim
        holder.moreResim.setOnClickListener {
            popup.show()
            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action_sec -> {
                        Toast.makeText(mContext ,"${ulke.ulkeIsim} Secildi", Toast.LENGTH_SHORT)
                            .show()
                        true
                    }
                    else -> {
                        false
                    }
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return ulkeList.size
    }

}

