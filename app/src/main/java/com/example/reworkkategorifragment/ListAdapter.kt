package com.example.reworkkategorifragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val katList:List<KategoriModel>): RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val itemsViewModel = katList[position]
        holder.imageButton.setImageResource(itemsViewModel.katImg)
        holder.textView.text = itemsViewModel.katnavn
    }

    override fun getItemCount(): Int {
        return katList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageButton : ImageButton = itemView.findViewById(R.id.imageButton)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }
}
