package com.gulsah.bottomnavpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carp.*
import kotlinx.android.synthetic.main.fragment_carp.editTextSayiIki
import kotlinx.android.synthetic.main.fragment_carp.view.*
import kotlinx.android.synthetic.main.fragment_topla.*
import kotlinx.android.synthetic.main.fragment_topla.view.*


class ToplaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_topla,container,false)
        layout.buttonTopla.setOnClickListener {
            val sonuc = Integer.parseInt(editTextSayiBirTopla.text.toString()) * Integer.parseInt(editTextSayiIkiTopla.text.toString())
            val gecis = ToplaFragmentDirections.toplaGecis(sonuc.toString())
            Navigation.findNavController(it).navigate(gecis)
        }

        return layout
    }


}