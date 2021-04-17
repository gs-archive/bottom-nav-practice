package com.gulsah.bottomnavpractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_carp_sonuc.view.*
import kotlinx.android.synthetic.main.fragment_topla_sonuc.view.*

class ToplaSonucFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_topla_sonuc,container,false)
        val bundle : ToplaSonucFragmentArgs by navArgs()
        val gelenSonuc = bundle.toplaSonuc.toString()
        layout.textViewToplaSonuc.text = "$gelenSonuc"
        Log.e("sayi",gelenSonuc)
        return layout
    }

}