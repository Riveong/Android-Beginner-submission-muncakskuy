package com.dicoding.submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var rvMounts: RecyclerView
    private val list =ArrayList<Mount>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMounts = findViewById(R.id.rv_mounts)
        rvMounts.setHasFixedSize(true)


        list.addAll(getListHeroes())
        showRecyclerList()




    }

    private fun getListHeroes(): ArrayList<Mount> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDesc = resources.getStringArray(R.array.data_desc)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listMount = ArrayList<Mount>()
        for (i in dataName.indices){
            val 


        }




    }
}