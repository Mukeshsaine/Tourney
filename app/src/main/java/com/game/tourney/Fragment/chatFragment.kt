package com.game.tourney.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.game.tourney.Adapter.Adapter_Home
import com.game.tourney.Adapter.ChatesAdapter
import com.game.tourney.Models.HomeLoading
import com.game.tourney.Models.chatsModels
import com.game.tourney.R
import com.game.tourney.databinding.FragmentChatBinding

class chatFragment : Fragment() {

    lateinit var binding: FragmentChatBinding
    lateinit var adapter: ChatesAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentChatBinding.inflate(layoutInflater, container, false)

        LoadingChats()
        return binding.root

    }

    private fun LoadingChats() {


        val url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.esportsku.com%2Fhow-to-create-a-teamcode-and-use-it-in-free-fire-ff%2F&psig=AOvVaw0dnsr66T2wOCxKAeMlz7lR&ust=1722514290876000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOji9Pfyz4cDFQAAAAAdAAAAABAE"
        val items = listOf(
            chatsModels("Title 1", "08:33 AP","free",url),
            chatsModels("Title 1", "08:33 AP","free",url),
            chatsModels("Title 1", "08:33 AP","free",url),
            chatsModels("Title 1", "08:33 AP","free",url),
            chatsModels("Title 1", "08:33 AP","free",url)
        )

        val adapter = context?.let { ChatesAdapter(items, it) }
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
    }
}