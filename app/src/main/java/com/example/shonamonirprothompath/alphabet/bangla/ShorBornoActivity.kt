package com.example.shonamonirprothompath.alphabet.bangla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import com.example.shonamonirprothompath.R
import com.example.shonamonirprothompath.adapter.AlphabetGridAdapter
import com.example.shonamonirprothompath.model.AlphabetGridModel

class ShorBornoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shor_borno)

        val shorBornoGridView = findViewById<GridView>(R.id.shorBornoGridViewId)
        val shorBornoGridList = ArrayList<AlphabetGridModel>()

        shorBornoGridList.add(AlphabetGridModel("অ"))
        shorBornoGridList.add(AlphabetGridModel("আ"))
        shorBornoGridList.add(AlphabetGridModel("ই"))
        shorBornoGridList.add(AlphabetGridModel("ঈ"))
        shorBornoGridList.add(AlphabetGridModel("উ"))
        shorBornoGridList.add(AlphabetGridModel("ঊ"))
        shorBornoGridList.add(AlphabetGridModel("ঋ"))
        shorBornoGridList.add(AlphabetGridModel("এ"))
        shorBornoGridList.add(AlphabetGridModel("ঐ"))
        shorBornoGridList.add(AlphabetGridModel("ও"))
        shorBornoGridList.add(AlphabetGridModel("ঔ"))

        val adapter = AlphabetGridAdapter(this, shorBornoGridList)
        shorBornoGridView.setAdapter(adapter)

        shorBornoGridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (shorBornoGridList.get(position).gridName == "অ") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "অ")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "আ") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "আ")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "ই") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "ই")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "ঈ") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঈ")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "উ") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "উ")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "ঊ") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঊ")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "ঋ") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঋ")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "এ") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "এ")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "ঐ") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঐ")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "ও") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "ও")
                startActivity(intent)
            }
            if (shorBornoGridList.get(position).gridName == "ঔ") {
                val intent = Intent(this, ShorBornoDetailsActivity::class.java)
                intent.putExtra("key", "ঔ")
                startActivity(intent)
            }

        })
    }
}