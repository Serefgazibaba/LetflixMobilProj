package com.example.mobilprogproj.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.example.mobilprogproj.R
import com.example.mobilprogproj.data.Filmler
import com.example.mobilprogproj.databinding.FragmentSepetBinding
import com.google.android.material.snackbar.Snackbar


class SepetFragment : Fragment() {
    private lateinit var binding:FragmentSepetBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSepetBinding.inflate(inflater, container, false)
        val bundle:SepetFragmentArgs by navArgs()
        val sepeteEklenenFilm = bundle.sepetFilm
        binding.sepetFilmTv.text = sepeteEklenenFilm.ad
        binding.sepetTutar.text = sepeteEklenenFilm.fiyat.toString() + " ₺"

        binding.butonOdemeTamamla.setOnClickListener {
            Snackbar.make(it,"Not implemented yet",Snackbar.LENGTH_SHORT).show()
        }
        return binding.root
    }


}