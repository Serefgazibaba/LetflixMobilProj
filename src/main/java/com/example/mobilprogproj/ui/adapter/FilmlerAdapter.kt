package com.example.mobilprogproj.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilprogproj.data.Filmler
import com.example.mobilprogproj.databinding.CardTasarimBinding
import com.example.mobilprogproj.ui.fragment.YabanciFilmFragmentDirections
import com.example.mobilprogproj.ui.fragment.YerliFilmFragmentDirections

class FilmlerAdapter(var mcontext:Context,var filmlerListesi:List<Filmler>) : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mcontext),parent,false)
        return CardTasarimTutucu(binding)
    }



    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerListesi.get(position)
        val t = holder.tasarim

        t.imageViewFilm.setImageResource(mcontext.resources.getIdentifier(film.resim,"drawable",mcontext.packageName))

        t.tvFiyat.text = "${film.fiyat} ₺"

        t.tvAciklama.text = "${film.aciklama.subSequence(0,30)}..."

        if(filmlerListesi.size == 10){
            t.cardViewFilm.setOnClickListener {
            val gecisYabanci = YabanciFilmFragmentDirections.yabanciDetayGecis(film = film)
            Navigation.findNavController(it).navigate(gecisYabanci)
            }
        }else {
            t.cardViewFilm.setOnClickListener {
                val gecisYerli = YerliFilmFragmentDirections.yerliDetayGecis(film = film)
                Navigation.findNavController(it).navigate(gecisYerli)
            }
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }


}