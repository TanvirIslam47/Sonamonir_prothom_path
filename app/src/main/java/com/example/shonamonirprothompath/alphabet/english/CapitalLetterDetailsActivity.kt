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

class CapitalLetterDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital_letter_details)

        val letterTv = findViewById<TextView>(R.id.letterTvId)
        val pronunciationTv = findViewById<TextView>(R.id.pronunciationTvId)
        val wordTv = findViewById<TextView>(R.id.wordTvId)
        val meaningTv = findViewById<TextView>(R.id.meaningTvId)
        val objectImg = findViewById<ImageView>(R.id.objectImgId)
        val capitalLetterGridView = findViewById<GridView>(R.id.capitalLetterGridViewId)
        val capitalLetterGridList = ArrayList<AlphabetGridModel>()

        val bundle: Bundle? = intent.extras
        val letter: String? = intent.getStringExtra("key")

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

        val adapter = AlphabetGridDetailsAdapter(this, capitalLetterGridList)
        capitalLetterGridView.setAdapter(adapter)

        if (letter == "A") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "A"
            pronunciationTv.text = "???"
            wordTv.text = "Apple"
            meaningTv.text = "????????????"
            objectImg.setImageResource(R.drawable.apple)
        }
        if (letter == "B") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "B"
            pronunciationTv.text = "??????"
            wordTv.text = "Ball"
            meaningTv.text = "??????"
            objectImg.setImageResource(R.drawable.ball)
        }
        if (letter == "C") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "C"
            pronunciationTv.text = "??????"
            wordTv.text = "Cat"
            meaningTv.text = "???????????????"
            objectImg.setImageResource(R.drawable.cat)
        }
        if (letter == "D") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "D"
            pronunciationTv.text = "??????"
            wordTv.text = "Dog"
            meaningTv.text = "???????????????"
            objectImg.setImageResource(R.drawable.dog)
        }
        if (letter == "E") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "E"
            pronunciationTv.text = "???"
            wordTv.text = "Elephant"
            meaningTv.text = "????????????"
            objectImg.setImageResource(R.drawable.hati)
        }
        if (letter == "F") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "F"
            pronunciationTv.text = "??????"
            wordTv.text = "Frog"
            meaningTv.text = "???????????????"
            objectImg.setImageResource(R.drawable.bang)
        }
        if (letter == "G") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "G"
            pronunciationTv.text = "??????"
            wordTv.text = "Goat"
            meaningTv.text = "????????????"
            objectImg.setImageResource(R.drawable.goat)
        }
        if (letter == "H") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "H"
            pronunciationTv.text = "?????????"
            wordTv.text = "House"
            meaningTv.text = "????????????"
            objectImg.setImageResource(R.drawable.house)
        }
        if (letter == "I") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "I"
            pronunciationTv.text = "??????"
            wordTv.text = "Ice-Cream"
            meaningTv.text = "????????? ???????????????"
            objectImg.setImageResource(R.drawable.ice_cream)
        }
        if (letter == "J") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "J"
            pronunciationTv.text = "??????"
            wordTv.text = "Jack fruit"
            meaningTv.text = "???????????????"
            objectImg.setImageResource(R.drawable.jackfruit)
        }
        if (letter == "K") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "K"
            pronunciationTv.text = "??????"
            wordTv.text = "Key"
            meaningTv.text = "????????????"
            objectImg.setImageResource(R.drawable.keys)
        }
        if (letter == "L") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "L"
            pronunciationTv.text = "??????"
            wordTv.text = "Lemon"
            meaningTv.text = "????????????"
            objectImg.setImageResource(R.drawable.lemon)
        }
        if (letter == "M") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "M"
            pronunciationTv.text = "??????"
            wordTv.text = "Mango"
            meaningTv.text = "??????"
            objectImg.setImageResource(R.drawable.mango)
        }
        if (letter == "N") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "N"
            pronunciationTv.text = "??????"
            wordTv.text = "Nose"
            meaningTv.text = "?????????"
            objectImg.setImageResource(R.drawable.nose)
        }
        if (letter == "O") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "O"
            pronunciationTv.text = "???"
            wordTv.text = "Otter"
            meaningTv.text = "???????????????"
            objectImg.setImageResource(R.drawable.otter)
        }
        if (letter == "P") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "P"
            pronunciationTv.text = "??????"
            wordTv.text = "Parrot"
            meaningTv.text = "???????????? ????????????"
            objectImg.setImageResource(R.drawable.tiya)
        }
        if (letter == "Q") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "Q"
            pronunciationTv.text = "?????????"
            wordTv.text = "Quill"
            meaningTv.text = "?????????????????? ?????????"
            objectImg.setImageResource(R.drawable.quill)
        }
        if (letter == "R") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "R"
            pronunciationTv.text = "??????"
            wordTv.text = "Radish"
            meaningTv.text = "????????????"
            objectImg.setImageResource(R.drawable.radish)
        }
        if (letter == "S") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "S"
            pronunciationTv.text = "??????"
            wordTv.text = "Squirrel"
            meaningTv.text = "????????????????????????"
            objectImg.setImageResource(R.drawable.squirrel)
        }
        if (letter == "T") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "T"
            pronunciationTv.text = "??????"
            wordTv.text = "Tiger"
            meaningTv.text = "?????????"
            objectImg.setImageResource(R.drawable.tiger)
        }
        if (letter == "U") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "U"
            pronunciationTv.text = "??????"
            wordTv.text = "Umbrella"
            meaningTv.text = "????????????"
            objectImg.setImageResource(R.drawable.chata)
        }
        if (letter == "V") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "V"
            pronunciationTv.text = "??????"
            wordTv.text = "Vas"
            meaningTv.text = "????????????"
            objectImg.setImageResource(R.drawable.vas)
        }
        if (letter == "W") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "W"
            pronunciationTv.text = "??????????????????"
            wordTv.text = "Water melon"
            meaningTv.text = "???????????????"
            objectImg.setImageResource(R.drawable.tormuj)
        }
        if (letter == "X") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "X"
            pronunciationTv.text = "????????????"
            wordTv.text = "Xebec"
            meaningTv.text = "???????????????"
            objectImg.setImageResource(R.drawable.xebec)
        }
        if (letter == "Y") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "Y"
            pronunciationTv.text = "????????????"
            wordTv.text = "Yo-yo"
            meaningTv.text = "????????? ?????????"
            objectImg.setImageResource(R.drawable.yo_yo)
        }
        if (letter == "Z") {
//            shorBornoGridView.setSelector(0);
            letterTv.text = "Z"
            pronunciationTv.text = "?????????"
            wordTv.text = "Zebra"
            meaningTv.text = "??????????????????"
            objectImg.setImageResource(R.drawable.zebra)
        }

        capitalLetterGridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (capitalLetterGridList.get(position).gridName == "A") {
                letterTv.text = "A"
                pronunciationTv.text = "???"
                wordTv.text = "Apple"
                meaningTv.text = "????????????"
                objectImg.setImageResource(R.drawable.apple)
            }
            if (capitalLetterGridList.get(position).gridName == "B") {
                letterTv.text = "B"
                pronunciationTv.text = "??????"
                wordTv.text = "Ball"
                meaningTv.text = "??????"
                objectImg.setImageResource(R.drawable.ball)
            }
            if (capitalLetterGridList.get(position).gridName == "C") {
                letterTv.text = "C"
                pronunciationTv.text = "??????"
                wordTv.text = "Cat"
                meaningTv.text = "???????????????"
                objectImg.setImageResource(R.drawable.cat)
            }
            if (capitalLetterGridList.get(position).gridName == "D") {
                letterTv.text = "D"
                pronunciationTv.text = "??????"
                wordTv.text = "Dog"
                meaningTv.text = "???????????????"
                objectImg.setImageResource(R.drawable.dog)
            }

            if (capitalLetterGridList.get(position).gridName == "E") {
                letterTv.text = "E"
                pronunciationTv.text = "???"
                wordTv.text = "Elephant"
                meaningTv.text = "????????????"
                objectImg.setImageResource(R.drawable.hati)
            }

            if (capitalLetterGridList.get(position).gridName == "F") {
                letterTv.text = "F"
                pronunciationTv.text = "??????"
                wordTv.text = "Frog"
                meaningTv.text = "???????????????"
                objectImg.setImageResource(R.drawable.bang)
            }

            if (capitalLetterGridList.get(position).gridName == "G") {
                letterTv.text = "G"
                pronunciationTv.text = "??????"
                wordTv.text = "Goat"
                meaningTv.text = "????????????"
                objectImg.setImageResource(R.drawable.goat)
            }
            if (capitalLetterGridList[position].gridName == "H") {
                letterTv.text = "H"
                pronunciationTv.text = "?????????"
                wordTv.text = "House"
                meaningTv.text = "????????????"
                objectImg.setImageResource(R.drawable.house)
            }
            if (capitalLetterGridList.get(position).gridName == "I") {
                letterTv.text = "I"
                pronunciationTv.text = "??????"
                wordTv.text = "Ice cream"
                meaningTv.text = "????????? ???????????????"
                objectImg.setImageResource(R.drawable.ice_cream)
            }
            if (capitalLetterGridList.get(position).gridName == "J") {
                letterTv.text = "J"
                pronunciationTv.text = "??????"
                wordTv.text = "Jack fruit"
                meaningTv.text = "???????????????"
                objectImg.setImageResource(R.drawable.jackfruit)
            }
            if (capitalLetterGridList.get(position).gridName == "K") {
                letterTv.text = "K"
                pronunciationTv.text = "??????"
                wordTv.text = "Key"
                meaningTv.text = "????????????"
                objectImg.setImageResource(R.drawable.keys)
            }
            if (capitalLetterGridList.get(position).gridName == "L") {
                letterTv.text = "L"
                pronunciationTv.text = "??????"
                wordTv.text = "Lemon"
                meaningTv.text = "????????????"
                objectImg.setImageResource(R.drawable.lemon)
            }
            if (capitalLetterGridList.get(position).gridName == "M") {
                letterTv.text = "M"
                pronunciationTv.text = "??????"
                wordTv.text = "Mango"
                meaningTv.text = "??????"
                objectImg.setImageResource(R.drawable.mango)
            }
            if (capitalLetterGridList.get(position).gridName == "N") {
                letterTv.text = "N"
                pronunciationTv.text = "??????"
                wordTv.text = "Nose"
                meaningTv.text = "?????????"
                objectImg.setImageResource(R.drawable.nose)
            }
            if (capitalLetterGridList.get(position).gridName == "O") {
                letterTv.text = "O"
                pronunciationTv.text = "???"
                wordTv.text = "Otter"
                meaningTv.text = "???????????????"
                objectImg.setImageResource(R.drawable.otter)
            }
            if (capitalLetterGridList.get(position).gridName == "P") {
                letterTv.text = "P"
                pronunciationTv.text = "??????"
                wordTv.text = "Parrot"
                meaningTv.text = "???????????? ????????????"
                objectImg.setImageResource(R.drawable.tiya)
            }

            if (capitalLetterGridList.get(position).gridName == "Q") {
                letterTv.text = "Q"
                pronunciationTv.text = "?????????"
                wordTv.text = "Quill"
                meaningTv.text = "?????????????????? ?????????"
                objectImg.setImageResource(R.drawable.quill)
            }

            if (capitalLetterGridList.get(position).gridName == "R") {
                letterTv.text = "R"
                pronunciationTv.text = "??????"
                wordTv.text = "Radish"
                meaningTv.text = "????????????"
                objectImg.setImageResource(R.drawable.radish)
            }

            if (capitalLetterGridList.get(position).gridName == "S") {
                letterTv.text = "S"
                pronunciationTv.text = "??????"
                wordTv.text = "Squirrel"
                meaningTv.text = "????????????????????????"
                objectImg.setImageResource(R.drawable.squirrel)
            }
            if (capitalLetterGridList[position].gridName == "T") {
                letterTv.text = "T"
                pronunciationTv.text = "??????"
                wordTv.text = "Tiger"
                meaningTv.text = "?????????"
                objectImg.setImageResource(R.drawable.tiger)
            }
            if (capitalLetterGridList.get(position).gridName == "U") {
                letterTv.text = "U"
                pronunciationTv.text = "??????"
                wordTv.text = "Umbrella"
                meaningTv.text = "????????????"
                objectImg.setImageResource(R.drawable.chata)
            }
            if (capitalLetterGridList.get(position).gridName == "V") {
                letterTv.text = "V"
                pronunciationTv.text = "??????"
                wordTv.text = "Vas"
                meaningTv.text = "????????????"
                objectImg.setImageResource(R.drawable.vas)
            }
            if (capitalLetterGridList.get(position).gridName == "W") {
                letterTv.text = "W"
                pronunciationTv.text = "??????????????????"
                wordTv.text = "Water melon"
                meaningTv.text = "???????????????"
                objectImg.setImageResource(R.drawable.tormuj)
            }
            if (capitalLetterGridList.get(position).gridName == "X") {
                letterTv.text = "X"
                pronunciationTv.text = "????????????"
                wordTv.text = "Xebec"
                meaningTv.text = "???????????????"
                objectImg.setImageResource(R.drawable.xebec)
            }
            if (capitalLetterGridList.get(position).gridName == "Y") {
                letterTv.text = "Y"
                pronunciationTv.text = "????????????"
                wordTv.text = "Yo-yo"
                meaningTv.text = "????????? ?????????"
                objectImg.setImageResource(R.drawable.yo_yo)
            }
            if (capitalLetterGridList.get(position).gridName == "Z") {
                letterTv.text = "Z"
                pronunciationTv.text = "?????????"
                wordTv.text = "Zebra"
                meaningTv.text = "??????????????????"
                objectImg.setImageResource(R.drawable.zebra)
            }
        })

    }
}