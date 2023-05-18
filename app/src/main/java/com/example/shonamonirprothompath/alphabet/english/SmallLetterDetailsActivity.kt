package com.example.shonamonirprothompath.alphabet.english

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import com.example.shonamonirprothompath.R
import com.example.shonamonirprothompath.adapter.AlphabetGridDetailsAdapter
import com.example.shonamonirprothompath.model.AlphabetGridModel

class SmallLetterDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_small_letter_details)
        val letterTv = findViewById<TextView>(R.id.letterTvId)
        val pronunciationTv = findViewById<TextView>(R.id.pronunciationTvId)
        val wordTv = findViewById<TextView>(R.id.wordTvId)
        val meaningTv = findViewById<TextView>(R.id.meaningTvId)
        val objectImg = findViewById<ImageView>(R.id.objectImgId)
        val smallLetterGridView = findViewById<GridView>(R.id.smallLetterGridViewId)
        val smallLetterGridList = ArrayList<AlphabetGridModel>()

        val bundle: Bundle? = intent.extras
        val letter: String? = intent.getStringExtra("key")

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

        val adapter = AlphabetGridDetailsAdapter(this, smallLetterGridList)
        smallLetterGridView.setAdapter(adapter)

        if (letter == "a") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "a"
            pronunciationTv.text = "এ"
            wordTv.text = "Apple"
            meaningTv.text = "আপেল"
            objectImg.setImageResource(R.drawable.apple)
        }
        if (letter == "b") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "b"
            pronunciationTv.text = "বি"
            wordTv.text = "Ball"
            meaningTv.text = "বল"
            objectImg.setImageResource(R.drawable.ball)
        }
        if (letter == "c") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "c"
            pronunciationTv.text = "সি"
            wordTv.text = "Cat"
            meaningTv.text = "বিড়াল"
            objectImg.setImageResource(R.drawable.cat)
        }
        if (letter == "d") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "d"
            pronunciationTv.text = "ডি"
            wordTv.text = "Dog"
            meaningTv.text = "কুকুর"
            objectImg.setImageResource(R.drawable.dog)
        }
        if (letter == "e") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "e"
            pronunciationTv.text = "ই"
            wordTv.text = "Elephant"
            meaningTv.text = "হাতি"
            objectImg.setImageResource(R.drawable.hati)
        }
        if (letter == "f") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "f"
            pronunciationTv.text = "এফ"
            wordTv.text = "Frog"
            meaningTv.text = "ব্যাঙ"
            objectImg.setImageResource(R.drawable.bang)
        }
        if (letter == "g") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "g"
            pronunciationTv.text = "জি"
            wordTv.text = "Goat"
            meaningTv.text = "ছাগল"
            objectImg.setImageResource(R.drawable.goat)
        }
        if (letter == "h") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "h"
            pronunciationTv.text = "এইচ"
            wordTv.text = "House"
            meaningTv.text = "বাড়ি"
            objectImg.setImageResource(R.drawable.house)
        }
        if (letter == "i") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "i"
            pronunciationTv.text = "আই"
            wordTv.text = "Ice-Cream"
            meaningTv.text = "আইস ক্রিম"
            objectImg.setImageResource(R.drawable.ice_cream)
        }
        if (letter == "j") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "j"
            pronunciationTv.text = "যে"
            wordTv.text = "Jack fruit"
            meaningTv.text = "কাঠাল"
            objectImg.setImageResource(R.drawable.jackfruit)
        }
        if (letter == "k") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "k"
            pronunciationTv.text = "কে"
            wordTv.text = "Key"
            meaningTv.text = "চাবি"
            objectImg.setImageResource(R.drawable.keys)
        }
        if (letter == "l") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "l"
            pronunciationTv.text = "এল"
            wordTv.text = "Lemon"
            meaningTv.text = "লেবু"
            objectImg.setImageResource(R.drawable.lemon)
        }
        if (letter == "m") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "m"
            pronunciationTv.text = "এম"
            wordTv.text = "Mango"
            meaningTv.text = "আম"
            objectImg.setImageResource(R.drawable.mango)
        }
        if (letter == "n") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "n"
            pronunciationTv.text = "এন"
            wordTv.text = "Nose"
            meaningTv.text = "নাক"
            objectImg.setImageResource(R.drawable.nose)
        }
        if (letter == "o") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "o"
            pronunciationTv.text = "ও"
            wordTv.text = "Otter"
            meaningTv.text = "ভোঁদড়"
            objectImg.setImageResource(R.drawable.otter)
        }
        if (letter == "p") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "p"
            pronunciationTv.text = "পি"
            wordTv.text = "Parrot"
            meaningTv.text = "টিয়া পাখি"
            objectImg.setImageResource(R.drawable.tiya)
        }
        if (letter == "q") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "q"
            pronunciationTv.text = "কিউ"
            wordTv.text = "Quill"
            meaningTv.text = "পালকের কলম"
            objectImg.setImageResource(R.drawable.quill)
        }
        if (letter == "r") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "r"
            pronunciationTv.text = "আর"
            wordTv.text = "Radish"
            meaningTv.text = "মুলা"
            objectImg.setImageResource(R.drawable.radish)
        }
        if (letter == "s") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "s"
            pronunciationTv.text = "এস"
            wordTv.text = "Squirrel"
            meaningTv.text = "কাঠবিড়াল"
            objectImg.setImageResource(R.drawable.squirrel)
        }
        if (letter == "t") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "t"
            pronunciationTv.text = "টি"
            wordTv.text = "Tiger"
            meaningTv.text = "বাঘ"
            objectImg.setImageResource(R.drawable.tiger)
        }
        if (letter == "u") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "u"
            pronunciationTv.text = "ইউ"
            wordTv.text = "Umbrella"
            meaningTv.text = "ছাতা"
            objectImg.setImageResource(R.drawable.chata)
        }
        if (letter == "v") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "v"
            pronunciationTv.text = "ভি"
            wordTv.text = "Vas"
            meaningTv.text = "দানি"
            objectImg.setImageResource(R.drawable.vas)
        }
        if (letter == "w") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "w"
            pronunciationTv.text = "ডব্লিউ"
            wordTv.text = "Water melon"
            meaningTv.text = "তরমুজ"
            objectImg.setImageResource(R.drawable.tormuj)
        }
        if (letter == "x") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "x"
            pronunciationTv.text = "এক্স"
            wordTv.text = "Xebec"
            meaningTv.text = "জেবেক"
            objectImg.setImageResource(R.drawable.xebec)
        }
        if (letter == "y") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "y"
            pronunciationTv.text = "ওয়াই"
            wordTv.text = "Yo-yo"
            meaningTv.text = "ইয়ো ইয়ো"
            objectImg.setImageResource(R.drawable.yo_yo)
        }
        if (letter == "z") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "z"
            pronunciationTv.text = "যেড"
            wordTv.text = "Zebra"
            meaningTv.text = "জেব্রা"
            objectImg.setImageResource(R.drawable.zebra)
        }

        smallLetterGridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (smallLetterGridList.get(position).gridName == "a") {
                letterTv.text = "a"
                pronunciationTv.text = "এ"
                wordTv.text = "Apple"
                meaningTv.text = "আপেল"
                objectImg.setImageResource(R.drawable.apple)
            }
            if (smallLetterGridList.get(position).gridName == "b") {
                letterTv.text = "b"
                pronunciationTv.text = "বি"
                wordTv.text = "Ball"
                meaningTv.text = "বল"
                objectImg.setImageResource(R.drawable.ball)
            }
            if (smallLetterGridList.get(position).gridName == "c") {
                letterTv.text = "c"
                pronunciationTv.text = "সি"
                wordTv.text = "Cat"
                meaningTv.text = "বিড়াল"
                objectImg.setImageResource(R.drawable.cat)
            }
            if (smallLetterGridList.get(position).gridName == "d") {
                letterTv.text = "d"
                pronunciationTv.text = "ডি"
                wordTv.text = "Dog"
                meaningTv.text = "কুকুর"
                objectImg.setImageResource(R.drawable.dog)
            }

            if (smallLetterGridList.get(position).gridName == "e") {
                letterTv.text = "e"
                pronunciationTv.text = "ই"
                wordTv.text = "Elephant"
                meaningTv.text = "হাতি"
                objectImg.setImageResource(R.drawable.hati)
            }

            if (smallLetterGridList.get(position).gridName == "f") {
                letterTv.text = "f"
                pronunciationTv.text = "এফ"
                wordTv.text = "Frog"
                meaningTv.text = "ব্যাঙ"
                objectImg.setImageResource(R.drawable.bang)
            }

            if (smallLetterGridList.get(position).gridName == "g") {
                letterTv.text = "g"
                pronunciationTv.text = "জি"
                wordTv.text = "Goat"
                meaningTv.text = "ছাগল"
                objectImg.setImageResource(R.drawable.goat)
            }
            if (smallLetterGridList[position].gridName == "h") {
                letterTv.text = "h"
                pronunciationTv.text = "এইচ"
                wordTv.text = "House"
                meaningTv.text = "বাড়ি"
                objectImg.setImageResource(R.drawable.house)
            }
            if (smallLetterGridList.get(position).gridName == "i") {
                letterTv.text = "i"
                pronunciationTv.text = "আই"
                wordTv.text = "Ice cream"
                meaningTv.text = "আইস ক্রিম"
                objectImg.setImageResource(R.drawable.ice_cream)
            }
            if (smallLetterGridList.get(position).gridName == "j") {
                letterTv.text = "j"
                pronunciationTv.text = "যে"
                wordTv.text = "Jack fruit"
                meaningTv.text = "কাঠাল"
                objectImg.setImageResource(R.drawable.jackfruit)
            }
            if (smallLetterGridList.get(position).gridName == "k") {
                letterTv.text = "k"
                pronunciationTv.text = "কে"
                wordTv.text = "Key"
                meaningTv.text = "চাবি"
                objectImg.setImageResource(R.drawable.keys)
            }
            if (smallLetterGridList.get(position).gridName == "l") {
                letterTv.text = "l"
                pronunciationTv.text = "এল"
                wordTv.text = "Lemon"
                meaningTv.text = "লেবু"
                objectImg.setImageResource(R.drawable.lemon)
            }
            if (smallLetterGridList.get(position).gridName == "m") {
                letterTv.text = "m"
                pronunciationTv.text = "এম"
                wordTv.text = "Mango"
                meaningTv.text = "আম"
                objectImg.setImageResource(R.drawable.mango)
            }
            if (smallLetterGridList.get(position).gridName == "n") {
                letterTv.text = "n"
                pronunciationTv.text = "এন"
                wordTv.text = "Nose"
                meaningTv.text = "নাক"
                objectImg.setImageResource(R.drawable.nose)
            }
            if (smallLetterGridList.get(position).gridName == "o") {
                letterTv.text = "o"
                pronunciationTv.text = "ও"
                wordTv.text = "Otter"
                meaningTv.text = "ভোঁদড়"
                objectImg.setImageResource(R.drawable.otter)
            }
            if (smallLetterGridList.get(position).gridName == "p") {
                letterTv.text = "p"
                pronunciationTv.text = "পি"
                wordTv.text = "Parrot"
                meaningTv.text = "টিয়া পাখি"
                objectImg.setImageResource(R.drawable.tiya)
            }

            if (smallLetterGridList.get(position).gridName == "q") {
                letterTv.text = "q"
                pronunciationTv.text = "কিউ"
                wordTv.text = "Quill"
                meaningTv.text = "পালকের কলম"
                objectImg.setImageResource(R.drawable.quill)
            }

            if (smallLetterGridList.get(position).gridName == "r") {
                letterTv.text = "r"
                pronunciationTv.text = "আর"
                wordTv.text = "Radish"
                meaningTv.text = "মুলা"
                objectImg.setImageResource(R.drawable.radish)
            }

            if (smallLetterGridList.get(position).gridName == "s") {
                letterTv.text = "s"
                pronunciationTv.text = "এস"
                wordTv.text = "Squirrel"
                meaningTv.text = "কাঠবিড়াল"
                objectImg.setImageResource(R.drawable.squirrel)
            }
            if (smallLetterGridList[position].gridName == "t") {
                letterTv.text = "t"
                pronunciationTv.text = "টি"
                wordTv.text = "Tiger"
                meaningTv.text = "বাঘ"
                objectImg.setImageResource(R.drawable.tiger)
            }
            if (smallLetterGridList.get(position).gridName == "u") {
                letterTv.text = "u"
                pronunciationTv.text = "ইউ"
                wordTv.text = "Umbrella"
                meaningTv.text = "ছাতা"
                objectImg.setImageResource(R.drawable.chata)
            }
            if (smallLetterGridList.get(position).gridName == "v") {
                letterTv.text = "v"
                pronunciationTv.text = "ভি"
                wordTv.text = "Vas"
                meaningTv.text = "দানি"
                objectImg.setImageResource(R.drawable.vas)
            }
            if (smallLetterGridList.get(position).gridName == "w") {
                letterTv.text = "w"
                pronunciationTv.text = "ডব্লিউ"
                wordTv.text = "Water melon"
                meaningTv.text = "তরমুজ"
                objectImg.setImageResource(R.drawable.tormuj)
            }
            if (smallLetterGridList.get(position).gridName == "x") {
                letterTv.text = "x"
                pronunciationTv.text = "এক্স"
                wordTv.text = "Xebec"
                meaningTv.text = "জেবেক"
                objectImg.setImageResource(R.drawable.xebec)
            }
            if (smallLetterGridList.get(position).gridName == "y") {
                letterTv.text = "y"
                pronunciationTv.text = "ওয়াই"
                wordTv.text = "Yo-yo"
                meaningTv.text = "ইয়ো ইয়ো"
                objectImg.setImageResource(R.drawable.yo_yo)
            }
            if (smallLetterGridList.get(position).gridName == "z") {
                letterTv.text = "z"
                pronunciationTv.text = "যেড"
                wordTv.text = "Zebra"
                meaningTv.text = "জেব্রা"
                objectImg.setImageResource(R.drawable.zebra)
            }
        })
    }
}