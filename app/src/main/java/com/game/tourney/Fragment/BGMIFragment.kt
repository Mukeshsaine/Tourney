package com.game.tourney.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.game.tourney.R
import com.game.tourney.databinding.FragmentBGMIBinding

class BGMIFragment : Fragment() {

    lateinit var binding: FragmentBGMIBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b_g_m_i, container, false)
    }

}