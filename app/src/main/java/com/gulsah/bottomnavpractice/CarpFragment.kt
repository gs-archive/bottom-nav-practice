package com.gulsah.bottomnavpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carp.*
import kotlinx.android.synthetic.main.fragment_carp.view.*

class CarpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutC = inflater.inflate(R.layout.fragment_carp,container,false)
        layoutC.buttonCarp.setOnClickListener {
            val sonuc = Integer.parseInt(editTextSayiBir.text.toString()) * Integer.parseInt(editTextSayiIki.text.toString())
            val gecis = CarpFragmentDirections.carpGecis(sonuc.toString())
            Navigation.findNavController(it).navigate(gecis)
        }

        return layoutC
    }

}