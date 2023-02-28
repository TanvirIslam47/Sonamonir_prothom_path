package com.example.shonamonirprothompath.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.shonamonirprothompath.R
import com.example.shonamonirprothompath.model.AlphabetGridModel

class AlphabetGridDetailsAdapter(context: Context, objects: ArrayList<AlphabetGridModel>) :
    ArrayAdapter<AlphabetGridModel?>(
        context, 0,
        objects as List<AlphabetGridModel?>
    ) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listitemView = convertView
        if (listitemView == null) {
            listitemView =
                LayoutInflater.from(context).inflate(R.layout.alphabet_grid_view2, parent, false)
        }
        val courseModel = getItem(position)
        val gridTV = listitemView!!.findViewById<TextView>(R.id.idTVgrid)
        gridTV.text = courseModel!!.gridName
        return listitemView
    }
}