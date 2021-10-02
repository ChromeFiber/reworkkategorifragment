package com.example.reworkkategorifragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reworkkategorifragment.databinding.FragmentKategoriBinding



class KategoriFragment() : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_kategori, container, false)
        /* val view = inflater.inflate(R.layout.fragment_kategori, container, false)



         return view*/
        val binding = DataBindingUtil.inflate<FragmentKategoriBinding>(
            inflater,
            R.layout.fragment_kategori,
            container,
            false
        )

        val recyclerView: RecyclerView = binding.kategoriRecyclerView
        val listAdapter = ListAdapter()
        recyclerView.adapter = listAdapter
        val layoutManager = GridLayoutManager(activity, 2)
        recyclerView.layoutManager = layoutManager

        setHasOptionsMenu(true)
        return binding.root
    }
}