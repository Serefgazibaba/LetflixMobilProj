package com.example.mobilprogproj.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.mobilprogproj.R
import com.example.mobilprogproj.data.Filmler
import com.example.mobilprogproj.databinding.FragmentDetayBinding
import com.example.mobilprogproj.databinding.FragmentYabanciFilmBinding
import com.google.android.material.snackbar.Snackbar


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)


        val bundle:DetayFragmentArgs by navArgs()
        val film = bundle.film
        binding.detayToolbarTitle.text = film.ad
        binding.detayImage.setImageResource(resources.getIdentifier(film.resim,"drawable",requireContext().packageName))
        binding.detayTv.text = film.aciklama
        binding.detayTutarTv.text = "${film.fiyat}₺"

        binding.butonPaylas.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,film.ad +" " + film.fiyat + "₺")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent,"Lütfen bir uygulama seçiniz:"))
        }


        binding.butonSepeteEkle.setOnClickListener {
            Snackbar.make(it,"Sepete Eklendi",Snackbar.LENGTH_SHORT).show()
            val gecis = DetayFragmentDirections.detaySepeteGecis(sepetFilm = film)
            Navigation.findNavController(it).navigate(gecis)
        }










        return binding.root
    }


}