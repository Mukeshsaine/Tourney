package com.game.tourney.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.game.tourney.Activity.BGMIActivity
import com.game.tourney.Adapter.Adapter_Home
import com.game.tourney.Models.HomeLoading
import com.game.tourney.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        binding.homebtn.setOnClickListener {
            startActivity(Intent(context, BGMIActivity::class.java))
        }
        LoadingItem()
        return binding.getRoot();
    }

    private fun LoadingItem() {


        val url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.esportsku.com%2Fhow-to-create-a-teamcode-and-use-it-in-free-fire-ff%2F&psig=AOvVaw0dnsr66T2wOCxKAeMlz7lR&ust=1722514290876000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOji9Pfyz4cDFQAAAAAdAAAAABAE"
        val items = listOf(
            HomeLoading("Title 1", "08:33 AP","free","Reward 100Rs",url),
            HomeLoading("Title 1", "08:33 AP","free","Reward 100Rs",url),
            HomeLoading("Title 1", "08:33 AP","free","Reward 100Rs",url),
            HomeLoading("Title 1", "08:33 AP","free","Reward 100Rs",url),
            HomeLoading("Title 1", "08:33 AP","free","Reward 100Rs",url),
            HomeLoading("Title 1", "08:33 AP","free","Reward 100Rs",url)

        )


        val adapter = Adapter_Home(items)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
    }


}