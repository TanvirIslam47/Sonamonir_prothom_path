package com.example.shonamonirprothompath.alphabet.english

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import com.example.shonamonirprothompath.R
import com.example.shonamonirprothompath.adapter.AlphabetGridAdapter
import com.example.shonamonirprothompath.alphabet.bangla.ShorBornoDetailsActivity
import com.example.shonamonirprothompath.model.AlphabetGridModel

class CapitalLetterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital_letter)

        val capitalLetterGridView = findViewById<GridView>(R.id.capitalLetterGridViewId)
        val capitalLetterGridList = ArrayList<AlphabetGridModel>()

        capitalLetterGridList.add(AlphabetGridModel("A"))
        capitalLetterGridList.add(AlphabetGridModel("B"))
        capitalLetterGridList.add(AlphabetGridModel("C"))
        capitalLetterGridList.add(AlphabetGridModel("D"))
        capitalLetterGridList.add(AlphabetGridModel("E"))
        capitalLetterGridList.add(AlphabetGridModel("F"))
        capitalLetterGridList.add(AlphabetGridModel("G"))
        capitalLetterGridList.add(AlphabetGridModel("H"))
        capitalLetterGridList.add(AlphabetGridModel("I"))
        capitalLetterGridList.add(AlphabetGridModel("J"))
        capitalLetterGridList.add(AlphabetGridModel("K"))
        capitalLetterGridList.add(AlphabetGridModel("L"))
        capitalLetterGridList.add(AlphabetGridModel("M"))
        capitalLetterGridList.add(AlphabetGridModel("N"))
        capitalLetterGridList.add(AlphabetGridModel("O"))
        capitalLetterGridList.add(AlphabetGridModel("P"))
        capitalLetterGridList.add(AlphabetGridModel("Q"))
        capitalLetterGridList.add(AlphabetGridModel("R"))
        capitalLetterGridList.add(AlphabetGridModel("S"))
        capitalLetterGridList.add(AlphabetGridModel("T"))
        capitalLetterGridList.add(AlphabetGridModel("U"))
        capitalLetterGridList.add(AlphabetGridModel("V"))
        capitalLetterGridList.add(AlphabetGridModel("W"))
        capitalLetterGridList.add(AlphabetGridModel("X"))
        capitalLetterGridList.add(AlphabetGridModel("Y"))
        capitalLetterGridList.add(AlphabetGridModel("Z"))

        val adapter = AlphabetGridAdapter(this, capitalLetterGridList)
        capitalLetterGridView.setAdapter(adapter)

        capitalLetterGridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (capitalLetterGridList.get(position).gridName == "A") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "A")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "B") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "B")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "C") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "C")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "D") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "D")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "E") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "E")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "F") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "F")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "G") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "G")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "H") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "H")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "I") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "I")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "J") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "J")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "K") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "K")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "L") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "L")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "M") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "M")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "N") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "N")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "O") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "O")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "P") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "P")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "Q") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "Q")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "R") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "R")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "S") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "S")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "T") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "T")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "U") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "U")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "V") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "V")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "W") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "W")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "X") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "X")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "Y") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "Y")
                startActivity(intent)
            }
            if (capitalLetterGridList.get(position).gridName == "Z") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "Z")
                startActivity(intent)
            }
        })
    }
}