package com.example.shonamonirprothompath.alphabet.bangla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import com.example.shonamonirprothompath.R
import com.example.shonamonirprothompath.adapter.AlphabetGridAdapter
import com.example.shonamonirprothompath.model.AlphabetGridModel

class BanjonBornoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banjon_borno)

        val banjonBornoGridView = findViewById<GridView>(R.id.banjonBornoGridViewId)
        val banjonBornoGridList = ArrayList<AlphabetGridModel>()

        banjonBornoGridList.add(AlphabetGridModel("ক"))
        banjonBornoGridList.add(AlphabetGridModel("খ"))
        banjonBornoGridList.add(AlphabetGridModel("গ"))
        banjonBornoGridList.add(AlphabetGridModel("ঘ"))
        banjonBornoGridList.add(AlphabetGridModel("ঙ"))
        banjonBornoGridList.add(AlphabetGridModel("চ"))
        banjonBornoGridList.add(AlphabetGridModel("ছ"))
        banjonBornoGridList.add(AlphabetGridModel("জ"))
        banjonBornoGridList.add(AlphabetGridModel("ঝ"))
        banjonBornoGridList.add(AlphabetGridModel("ঞ"))
        banjonBornoGridList.add(AlphabetGridModel("ট"))
        banjonBornoGridList.add(AlphabetGridModel("ঠ"))
        banjonBornoGridList.add(AlphabetGridModel("ড"))
        banjonBornoGridList.add(AlphabetGridModel("ঢ"))
        banjonBornoGridList.add(AlphabetGridModel("ণ"))
        banjonBornoGridList.add(AlphabetGridModel("ত"))
        banjonBornoGridList.add(AlphabetGridModel("থ"))
        banjonBornoGridList.add(AlphabetGridModel("দ"))
        banjonBornoGridList.add(AlphabetGridModel("ধ"))
        banjonBornoGridList.add(AlphabetGridModel("ন"))
        banjonBornoGridList.add(AlphabetGridModel("প"))
        banjonBornoGridList.add(AlphabetGridModel("ফ"))
        banjonBornoGridList.add(AlphabetGridModel("ব"))
        banjonBornoGridList.add(AlphabetGridModel("ভ"))
        banjonBornoGridList.add(AlphabetGridModel("ম"))
        banjonBornoGridList.add(AlphabetGridModel("য"))
        banjonBornoGridList.add(AlphabetGridModel("র"))
        banjonBornoGridList.add(AlphabetGridModel("ল"))
        banjonBornoGridList.add(AlphabetGridModel("শ"))
        banjonBornoGridList.add(AlphabetGridModel("ষ"))
        banjonBornoGridList.add(AlphabetGridModel("স"))
        banjonBornoGridList.add(AlphabetGridModel("হ"))
        banjonBornoGridList.add(AlphabetGridModel("ড়"))
        banjonBornoGridList.add(AlphabetGridModel("ঢ়"))
        banjonBornoGridList.add(AlphabetGridModel("য়"))
        banjonBornoGridList.add(AlphabetGridModel("ৎ"))
        banjonBornoGridList.add(AlphabetGridModel("ং"))
        banjonBornoGridList.add(AlphabetGridModel("ঃ"))
        banjonBornoGridList.add(AlphabetGridModel("ঁ"))

        val adapter = AlphabetGridAdapter(this, banjonBornoGridList)
        banjonBornoGridView.setAdapter(adapter)

        banjonBornoGridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (banjonBornoGridList.get(position).gridName == "ক") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ক")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "খ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "খ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "গ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "গ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ঘ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঘ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ঙ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঙ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "চ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "চ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ছ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ছ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "জ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "জ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ঝ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঝ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ঞ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঞ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ট") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ট")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ঠ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঠ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ড") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ড")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ঢ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঢ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ণ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ণ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ত") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ত")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "থ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "থ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "দ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "দ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ধ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ধ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ন") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ন")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "প") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "প")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ফ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ফ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ব") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ব")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ভ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ভ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ম") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ম")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "য") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "য")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "র") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "র")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ল") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ল")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "শ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "শ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ষ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ষ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "স") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "স")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "হ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "হ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ড়") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ড়")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ঢ়") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঢ়")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "য়") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "য়")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ৎ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ৎ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ং") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ং")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ঃ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঃ")
                startActivity(intent)
            }
            if (banjonBornoGridList.get(position).gridName == "ঁ") {
                val intent = Intent(this, BanjonBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঁ")
                startActivity(intent)
            }

        })
    }
}