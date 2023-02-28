package com.example.shonamonirprothompath.adapter

import android.content.Context
import com.example.shonamonirprothompath.model.MainGridModel
import android.widget.ArrayAdapter
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.example.shonamonirprothompath.R
import android.widget.TextView
import kotlin.collections.ArrayList

class MainGridAdapter(context: Context, objects: ArrayList<MainGridModel>) :
    ArrayAdapter<MainGridModel?>(
        context, 0,
        objects as List<MainGridModel?>
    ) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listitemView = convertView
        if (listitemView == null) {
            listitemView =
                LayoutInflater.from(context).inflate(R.layout.main_grid_view, parent, false)
        }
        val courseModel = getItem(position)
        val gridTV = listitemView!!.findViewById<TextView>(R.id.idTVgrid)
        val gridIV = listitemView.findViewById<ImageView>(R.id.idIVgrid)
        gridTV.text = courseModel!!.gridName
        gridIV.setImageResource(courseModel.imgGrid)
        return listitemView
    }
}