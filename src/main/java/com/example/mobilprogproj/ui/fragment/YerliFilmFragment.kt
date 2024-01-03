package com.example.mobilprogproj.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.mobilprogproj.R
import com.example.mobilprogproj.data.Filmler
import com.example.mobilprogproj.databinding.FragmentYerliFilmBinding
import com.example.mobilprogproj.ui.adapter.FilmlerAdapter


class YerliFilmFragment : Fragment() {
    private lateinit var binding: FragmentYerliFilmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentYerliFilmBinding.inflate(inflater, container, false)

        binding.yerliRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        val yerliFilmlerListesi = ArrayList<Filmler>()
        val film1 = Filmler(1,"Babam ve Oğlum","babam_ve_oglum",45,getString(R.string.babam_ve_oglum_aciklama))
        val film2 = Filmler(2,"Hababam Sınıfı","hababam_sinifi",35,getString(R.string.hababam_aciklama))
        val film3 = Filmler(3,"Eşkıya","eskiya",25,getString(R.string.eskiya_aciklama))
        val film4 = Filmler(4,"G.O.R.A","gora",40,getString(R.string.gora_aciklama))
        val film5 = Filmler(5,"Nefes Vatan Sağolsun","nefes_vatan_sagolsun",35,getString(R.string.nefes_aciklama))
        val film6 = Filmler(6,"Kabadayı","kabadayi",42,getString(R.string.kabadayi_aciklama))
        val film7 = Filmler(7,"Vizontele","vizontele",50,getString(R.string.vizontele_aciklama))
        yerliFilmlerListesi.add(film1)
        yerliFilmlerListesi.add(film2)
        yerliFilmlerListesi.add(film3)
        yerliFilmlerListesi.add(film4)
        yerliFilmlerListesi.add(film5)
        yerliFilmlerListesi.add(film6)
        yerliFilmlerListesi.add(film7)

        val yerliFilmAdapter = FilmlerAdapter(requireContext(),yerliFilmlerListesi)
        binding.yerliRv.adapter = yerliFilmAdapter

        return binding.root
    }

}