package com.jkhome.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.jkhome.simplelistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array: ArrayList<String> = ArrayList()
        for (n in 1..5)
        {
            array.add(n.toString())
        }

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array)
        //binding.listViewTest.adapter = adapter
        val listView = findViewById<ListView>(R.id.list_view_test)
        listView.adapter = adapter


    }
}