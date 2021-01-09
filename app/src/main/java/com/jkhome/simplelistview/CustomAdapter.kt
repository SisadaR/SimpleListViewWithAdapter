package com.jkhome.simplelistview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class CustomAdapter(var arrayList: ArrayList<Data>):BaseAdapter() {
    override fun getCount() = arrayList.size

    override fun getItem(position: Int) = arrayList[position]

    override fun getItemId(position: Int) = position.toLong()

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context

        val inflater : LayoutInflater
        = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val rowView:View = inflater.inflate(R.layout.item_list,parent,false)

        return rowView
    }
}