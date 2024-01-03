package com.example.mobilprogproj.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mobilprogproj.R
import com.example.mobilprogproj.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding:FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.yabanciButon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.yabanci_gecis)
        }
        binding.iletisimButon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.iletisim_gecis)
        }

        binding.yerliButon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.yerli_gecis)
        }



        return binding.root
    }
}