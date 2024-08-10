package com.game.tourney.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.game.tourney.Models.chatsModels
import com.game.tourney.R
import com.squareup.picasso.Picasso

class ChatesAdapter(private val list: List<chatsModels>):
    RecyclerView.Adapter<ChatesAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatesAdapter.viewHolder {
        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.chates_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ChatesAdapter.viewHolder, position: Int) {
        val itemCount = list[position]
        holder.name.text = itemCount.name
        holder.chats.text = itemCount.chat
        holder.date.text = itemCount.date

        val url: String = itemCount.image.toString() 
        Picasso.get().load(url).into(holder.Images);

    }

    override fun getItemCount(): Int {
     return list.size
    }

    open class viewHolder(itemView: View): ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.name)
        val chats: TextView = itemView.findViewById(R.id.chat)
        val Images: ImageView = itemView.findViewById(R.id.imagePeople)
        val date: TextView = itemView.findViewById(R.id.date)
    }
}