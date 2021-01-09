package com.jkhome.simplelistview

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.contentValuesOf
import org.w3c.dom.Text

class CustomAdapter(var arrayList: ArrayList<Data>):BaseAdapter() {
    override fun getCount() = arrayList.size

    override fun getItem(position: Int) = arrayList[position]

    override fun getItemId(position: Int) = position.toLong()

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context

        val inflater : LayoutInflater
        = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val item = arrayList[position]
        val rowView:View = inflater.inflate(R.layout.item_list,parent,false)
        val numberTextView = rowView.findViewById<TextView>(R.id.number_text_view)
        numberTextView.text = item.number

        val audioImage = rowView.findViewById<ImageView>(R.id.audio_image_view)
        audioImage.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(context,context.resources.getIdentifier(item.audioFileName,"raw", context.packageName ))
            mediaPlayer.start()
        }
        return rowView
    }
}