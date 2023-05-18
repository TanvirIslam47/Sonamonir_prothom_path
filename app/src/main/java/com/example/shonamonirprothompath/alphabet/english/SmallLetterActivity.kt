package com.example.shonamonirprothompath.alphabet.english

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import com.example.shonamonirprothompath.R
import com.example.shonamonirprothompath.adapter.AlphabetGridAdapter
import com.example.shonamonirprothompath.model.AlphabetGridModel

class SmallLetterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_small_letter)

        val smallLetterGridView = findViewById<GridView>(R.id.smallLetterGridViewId)
        val smallLetterGridList = ArrayList<AlphabetGridModel>()

        smallLetterGridList.add(AlphabetGridModel("a"))
        smallLetterGridList.add(AlphabetGridModel("b"))
        smallLetterGridList.add(AlphabetGridModel("c"))
        smallLetterGridList.add(AlphabetGridModel("d"))
        smallLetterGridList.add(AlphabetGridModel("e"))
        smallLetterGridList.add(AlphabetGridModel("f"))
        smallLetterGridList.add(AlphabetGridModel("g"))
        smallLetterGridList.add(AlphabetGridModel("h"))
        smallLetterGridList.add(AlphabetGridModel("i"))
        smallLetterGridList.add(AlphabetGridModel("j"))
        smallLetterGridList.add(AlphabetGridModel("k"))
        smallLetterGridList.add(AlphabetGridModel("l"))
        smallLetterGridList.add(AlphabetGridModel("m"))
        smallLetterGridList.add(AlphabetGridModel("n"))
        smallLetterGridList.add(AlphabetGridModel("o"))
        smallLetterGridList.add(AlphabetGridModel("p"))
        smallLetterGridList.add(AlphabetGridModel("q"))
        smallLetterGridList.add(AlphabetGridModel("r"))
        smallLetterGridList.add(AlphabetGridModel("s"))
        smallLetterGridList.add(AlphabetGridModel("t"))
        smallLetterGridList.add(AlphabetGridModel("u"))
        smallLetterGridList.add(AlphabetGridModel("v"))
        smallLetterGridList.add(AlphabetGridModel("w"))
        smallLetterGridList.add(AlphabetGridModel("x"))
        smallLetterGridList.add(AlphabetGridModel("y"))
        smallLetterGridList.add(AlphabetGridModel("z"))

        val adapter = AlphabetGridAdapter(this, smallLetterGridList)
        smallLetterGridView.setAdapter(adapter)

        smallLetterGridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (smallLetterGridList.get(position).gridName == "a") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "a")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "b") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "b")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "c") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "c")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "d") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "d")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "e") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "e")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "f") {
                val intent = Intent(this, CapitalLetterDetailsActivity::class.java)
                intent.putExtra("key", "f")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "g") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "g")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "h") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "h")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "i") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "i")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "j") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "j")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "k") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "k")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "l") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "l")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "m") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "m")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "n") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "n")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "o") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "o")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "p") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "p")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "q") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "q")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "r") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "r")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "s") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "s")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "t") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "t")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "u") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "u")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "v") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "v")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "w") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "w")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "x") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "x")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "y") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "y")
                startActivity(intent)
            }
            if (smallLetterGridList.get(position).gridName == "z") {
                val intent = Intent(this, SmallLetterDetailsActivity::class.java)
                intent.putExtra("key", "z")
                startActivity(intent)
            }
        })
    }
}