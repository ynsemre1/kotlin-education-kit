package com.example.materialdesing.RecyclerView_CardView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.materialdesing.R

class recyclerviewAdapter(
    private val mContext: Context,
    private val ulkelerDisaridanGelenList: List<Ulkeler>
) : RecyclerView.Adapter<recyclerviewAdapter.CardViewTasarimNesneleriniTutucu>() {

    inner class CardViewTasarimNesneleriniTutucu(view: View) :
        RecyclerView.ViewHolder(view) { //inner class (ic sinif)

        var satirCardView: CardView = view.findViewById(R.id.satirCardView)
        var satirYazi: TextView = view.findViewById(R.id.satirYazi)
        var noktaResim: ImageView = view.findViewById(R.id.moreResim)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewTasarimNesneleriniTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.cardview_tasarimi,parent,false)
        return CardViewTasarimNesneleriniTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardViewTasarimNesneleriniTutucu, position: Int) {
        val ulke = ulkelerDisaridanGelenList[position]
        holder.satirYazi.text = ulke.ulkeAdi
        holder.satirCardView.setOnClickListener{
            Toast.makeText(mContext,"Secitiginiz Ulke:${ulke.ulkeAdi}",Toast.LENGTH_SHORT)
                .show()
        }


    }

    override fun getItemCount(): Int { //Kactane item yazdiricagini soruyor
        return ulkelerDisaridanGelenList.size
    }
}