package com.game.tourney.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.game.tourney.Models.HomeLoading
import com.game.tourney.R

class Adapter_Home(private val list: List<HomeLoading>):
    RecyclerView.Adapter<Adapter_Home.viewHolder>() {

        open class viewHolder(itemView: View) : ViewHolder(itemView){
            val freefire: TextView = itemView.findViewById(R.id.freefire)
            val time: TextView = itemView.findViewById(R.id.time)
            val entry: TextView = itemView.findViewById(R.id.entry)
            val reword: TextView = itemView.findViewById(R.id.reword)
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        // Return a new instance of MyViewHolder with the inflated view
        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.home_lauyout,  parent, false))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        val ItemsViewModel = list[position]

        holder.freefire.text = ItemsViewModel.freefire
        holder.time.text = ItemsViewModel.time
        holder.entry.text = ItemsViewModel.enter
        holder.reword.text = ItemsViewModel.reward

    }

    override fun getItemCount(): Int {
        return list.size
    }
}