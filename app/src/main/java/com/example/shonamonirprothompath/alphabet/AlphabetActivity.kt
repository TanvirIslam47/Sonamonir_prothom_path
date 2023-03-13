package com.example.shonamonirprothompath.alphabet

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.example.shonamonirprothompath.R
import com.example.shonamonirprothompath.adapter.MainGridAdapter
import com.example.shonamonirprothompath.alphabet.bangla.BanjonBornoActivity
import com.example.shonamonirprothompath.alphabet.bangla.ShorBornoActivity
import com.example.shonamonirprothompath.alphabet.english.CapitalLetterActivity
import com.example.shonamonirprothompath.model.MainGridModel

class AlphabetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)
        val alphabetGridView = findViewById<GridView>(R.id.alphabetGridViewId)
        val alphabetGridList = ArrayList<MainGridModel>()

        alphabetGridList.add(MainGridModel("স্বরবর্ণ", R.drawable.shor_o))
        alphabetGridList.add(MainGridModel("ব্যঞ্জনবর্ণ", R.drawable.kaw))
        alphabetGridList.add(MainGridModel("Capital Letter", R.drawable.capital_a))
        alphabetGridList.add(MainGridModel("Small Letter", R.drawable.small_a))
        alphabetGridList.add(MainGridModel("Arabic", R.drawable.arbi))

        val adapter = MainGridAdapter(this, alphabetGridList)
        alphabetGridView.setAdapter(adapter)

        alphabetGridView.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
            if (alphabetGridList.get(position).gridName == "স্বরবর্ণ") {
                startActivity(Intent(this@AlphabetActivity, ShorBornoActivity::class.java))
            }
            if (alphabetGridList.get(position).gridName == "ব্যঞ্জনবর্ণ") {
                startActivity(Intent(this@AlphabetActivity, BanjonBornoActivity::class.java))
            }
            if (alphabetGridList.get(position).gridName == "Capital Letter") {
                startActivity(Intent(this@AlphabetActivity, CapitalLetterActivity::class.java))
            }
        })
    }
}