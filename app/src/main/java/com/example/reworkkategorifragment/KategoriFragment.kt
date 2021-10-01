package com.example.reworkkategorifragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class KategoriFragment : Fragment() {

    private val viewModel: KategoriModel by lazy {
        ViewModelProvider(this).get(KategoriModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        //return inflater.inflate(R.layout.fragment_kategori, container, false)
        val view = inflater.inflate(R.layout.fragment_kategori, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.kategori_recycler_view)
        val data = ArrayList<KategoriModel>()
        data.add(KategoriModel(R.drawable.img, "Flagg"))
        data.add(KategoriModel(R.drawable.img, "Flagg"))
        data.add(KategoriModel(R.drawable.img, "Flagg"))
        val listAdapter = ListAdapter(data)
        recyclerView.adapter = listAdapter
        val layoutManager = GridLayoutManager(activity,2)
        recyclerView.layoutManager = layoutManager

        val btn = view.findViewById<ImageButton>(R.id.imageButton)
        btn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_kategoriFragment_to_hjelpeFragment)
        }
        return recyclerView

    }


}