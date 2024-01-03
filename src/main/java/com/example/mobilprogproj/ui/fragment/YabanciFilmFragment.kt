package com.example.mobilprogproj.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.mobilprogproj.R
import com.example.mobilprogproj.data.Filmler
import com.example.mobilprogproj.databinding.FragmentYabanciFilmBinding
import com.example.mobilprogproj.ui.adapter.FilmlerAdapter


class YabanciFilmFragment : Fragment() {
    private lateinit var binding: FragmentYabanciFilmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYabanciFilmBinding.inflate(inflater, container, false)

        binding.yabanciRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        val yabanciFilmlerListesi = ArrayList<Filmler>()
        val film1 = Filmler(1,"Baba","baba",30,getString(R.string.baba_aciklama))
        val film2 = Filmler(2,"Başlangıç","baslangic",40,getString(R.string.baslangic_aciklama))
        val film3 = Filmler(3,"Dövüş Kulubü","dovus_kulubu",45,getString(R.string.dovus_kulubu_aciklama))
        val film4 = Filmler(4,"Esaretin Bedeli","esaretin_bedeli",35,getString(R.string.esaret_aciklama))
        val film5 = Filmler(5,"Forrest Gump","forrest_gump",35,getString(R.string.forrest_aciklama))
        val film6 = Filmler(6,"Piyanist","piyanist",50,getString(R.string.piyanist_aciklama))
        val film7 = Filmler(7,"Prestij","prestij",30,getString(R.string.prestij_aciklama))
        val film8 = Filmler(8,"V For Vendetta","v_for_vendetta",40,getString(R.string.v_aciklama))
        val film9 = Filmler(9,"Yeşil Yol","yesil_yol",55,getString(R.string.yesil_yol_aciklama))
        val film10 = Filmler(10,"Yüzüklerin Efendisi","yuzuklerin_efendisi_kralin_donusu",45,getString(R.string.yuzukler_aciklama))
        yabanciFilmlerListesi.add(film1)
        yabanciFilmlerListesi.add(film2)
        yabanciFilmlerListesi.add(film3)
        yabanciFilmlerListesi.add(film4)
        yabanciFilmlerListesi.add(film5)
        yabanciFilmlerListesi.add(film6)
        yabanciFilmlerListesi.add(film7)
        yabanciFilmlerListesi.add(film8)
        yabanciFilmlerListesi.add(film9)
        yabanciFilmlerListesi.add(film10)

        val yabanciFilmlerAdapter = FilmlerAdapter(requireContext(),yabanciFilmlerListesi)
        binding.yabanciRv.adapter = yabanciFilmlerAdapter
        return binding.root
    }


}