package com.example.reworkkategorifragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ListAdapter : RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return KategoriData.kategoribilde.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val katnavn: TextView = view.findViewById(R.id.textView)
        private val katbilde: ImageButton = view.findViewById(R.id.imageButton)
        fun bind(position: Int) {
            katnavn.text = KategoriData.kategorinavn[position]
            katbilde.setImageResource(KategoriData.kategoribilde[position])

            katbilde.setOnClickListener{
                it.findNavController().navigate(R.id.action_kategoriFragment_to_nesteFragment)
            }
        }
    }
}