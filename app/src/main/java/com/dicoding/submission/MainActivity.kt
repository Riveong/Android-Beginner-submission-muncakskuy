package com.dicoding.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
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

    private fun showRecyclerList() {

        rvMounts.layoutManager = LinearLayoutManager(this)
        val listMountAdapter = ListMountAdapter(list)
        rvMounts.adapter = listMountAdapter
    }

    private fun getListHeroes(): ArrayList<Mount> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDesc = resources.getStringArray(R.array.data_desc)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listMount = ArrayList<Mount>()
        for (i in dataName.indices){
            val mount = Mount(dataName[i],dataDesc[i],dataPhoto.getResourceId(i, -1))
            listMount.add(mount)


        }
        return listMount




    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            (R.id.about_page)->{
                val intent = Intent(this@MainActivity, aboutPage::class.java)
                startActivity(intent)

            }


        }



        return super.onOptionsItemSelected(item)
    }




}