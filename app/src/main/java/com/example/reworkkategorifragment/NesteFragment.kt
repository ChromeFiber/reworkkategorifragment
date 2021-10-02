package com.example.reworkkategorifragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.reworkkategorifragment.databinding.FragmentNesteBinding


class NesteFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentNesteBinding>(inflater, R.layout.fragment_neste, container,false)
        binding.tilbakeKnapp.setOnClickListener {view: View->
            view.findNavController().navigate(R.id.action_nesteFragment_to_kategoriFragment)
        }
       return binding.root
    }
}