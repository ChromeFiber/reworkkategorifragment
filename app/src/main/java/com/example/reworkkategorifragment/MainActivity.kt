package com.example.reworkkategorifragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_kategori)

        val recyclerView = findViewById<RecyclerView>(R.id.kategori_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<KategoriModel>()
        for (i in 1..3){
            data.add(KategoriModel(R.drawable.img, "Flagg"))
        }
        val adapter = ListAdapter(data)

        recyclerView.adapter = adapter
    }
}