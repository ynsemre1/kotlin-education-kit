package com.example.materialdesing.recylcerViewDetayliTasarim

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.materialdesing.R

class detayliAdapter(
    private val mContext: Context,
    private val filmlerListesi: ArrayList<filmler>
) : RecyclerView.Adapter<detayliAdapter.cardTasarimNesneTutucu>() {

    inner class cardTasarimNesneTutucu(nesneTutucu: View) : RecyclerView.ViewHolder(nesneTutucu) {
        var imagedjango: ImageView = nesneTutucu.findViewById(R.id.imagedjango)
        var filmBaslik: TextView = nesneTutucu.findViewById(R.id.textdjango)
        var filmFiyat: TextView = nesneTutucu.findViewById(R.id.textdjango2)
        var buttonSepeteEkle: Button = nesneTutucu.findViewById(R.id.buttonSepeteEkle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarimNesneTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.cardfilmdetaylitasarim,parent,false)

        return cardTasarimNesneTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: cardTasarimNesneTutucu, position: Int) {
        val filmler = filmlerListesi[position]

        holder.filmBaslik.text=filmler.film_ad
        holder.filmFiyat.text="${filmler.film_fiyat}TL"

        holder.imagedjango.setImageResource(mContext.resources.getIdentifier(filmler.film_resim_ad,"drawable",mContext.packageName))
        holder.buttonSepeteEkle.setOnClickListener {
            Toast.makeText(mContext, "${filmler.film_ad} Sepete Eklendi", Toast.LENGTH_SHORT)
                .show()
        }

    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }


}