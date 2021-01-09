package com.jkhome.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.CursorAdapter
import android.widget.ListView
import com.jkhome.simplelistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val listView: ListView by lazy {findViewById(R.id.list_view_test)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList : ArrayList<Data> = ArrayList()
        for (n in 0..5)
            arrayList.add(Data("$n","audio_$n"))

        val customAdapter:CustomAdapter = CustomAdapter(arrayList)
        listView.adapter = customAdapter


    }
}