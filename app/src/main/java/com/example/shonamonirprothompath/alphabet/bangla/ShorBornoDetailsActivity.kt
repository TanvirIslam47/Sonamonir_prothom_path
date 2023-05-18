package com.example.shonamonirprothompath.alphabet.bangla

import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.shonamonirprothompath.R
import com.example.shonamonirprothompath.adapter.AlphabetGridDetailsAdapter
import com.example.shonamonirprothompath.model.AlphabetGridModel

/** Intent from ShorBornoActivity **/
class ShorBornoDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shor_borno_details)

        val bornoTv = findViewById<TextView>(R.id.bornoTvId)
        val shobdoTv = findViewById<TextView>(R.id.shobdoTvId)
        val objectImg = findViewById<ImageView>(R.id.objectImgId)
        val shorBornoGridView = findViewById<GridView>(R.id.shorBornoGridViewId)
        val shorBornoGridList = ArrayList<AlphabetGridModel>()

        val bundle: Bundle? = intent.extras
        val letter: String? = intent.getStringExtra("key")

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

        val adapter = AlphabetGridDetailsAdapter(this, shorBornoGridList)
        shorBornoGridView.setAdapter(adapter)

        if(letter == "অ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "অ"
            shobdoTv.text = "অজগর"
            objectImg.setImageResource(R.drawable.ojogor)
        }
        if(letter == "আ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "আ"
            shobdoTv.text = "আম"
            objectImg.setImageResource(R.drawable.mango)
        }
        if(letter == "ই") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ই"
            shobdoTv.text = "ইদুর"
            objectImg.setImageResource(R.drawable.rat)
        }
        if(letter == "ঈ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঈ"
            shobdoTv.text = "ঈগল"
            objectImg.setImageResource(R.drawable.igol)
        }
        if(letter == "উ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "উ"
            shobdoTv.text = "উট"
            objectImg.setImageResource(R.drawable.utt)
        }
        if(letter == "ঊ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঊ"
            shobdoTv.text = "ঊষা"
            objectImg.setImageResource(R.drawable.usha)
        }
        if(letter == "ঋ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঋ"
            shobdoTv.text = "ঋতু"
            objectImg.setImageResource(R.drawable.rritu)
        }
        if(letter == "এ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "এ"
            shobdoTv.text = "একতারা"
            objectImg.setImageResource(R.drawable.ektara)
        }
        if(letter == "ঐ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঐ"
            shobdoTv.text = "ঐরাবত"
            objectImg.setImageResource(R.drawable.oirabot)
        }
        if(letter == "ও") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ও"
            shobdoTv.text = "ওজন"
            objectImg.setImageResource(R.drawable.ojon)
        }
        if(letter == "ঔ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঔ"
            shobdoTv.text = "ঔষধ"
            objectImg.setImageResource(R.drawable.oushudh)
        }


        shorBornoGridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (shorBornoGridList.get(position).gridName == "অ") {
                bornoTv.text = "অ"
                shobdoTv.text = "অজগর"
                objectImg.setImageResource(R.drawable.ojogor)
            }
            if (shorBornoGridList.get(position).gridName == "আ") {
                bornoTv.text = "আ"
                shobdoTv.text = "আম"
                objectImg.setImageResource(R.drawable.mango)
            }

            if (shorBornoGridList.get(position).gridName == "ই") {
                bornoTv.text = "ই"
                shobdoTv.text = "ইদুর"
                objectImg.setImageResource(R.drawable.rat)
            }

            if (shorBornoGridList.get(position).gridName == "ঈ") {
                bornoTv.text = "ঈ"
                shobdoTv.text = "ঈগল"
                objectImg.setImageResource(R.drawable.igol)
            }

            if (shorBornoGridList.get(position).gridName == "উ") {
                bornoTv.text = "উ"
                shobdoTv.text = "উট"
                objectImg.setImageResource(R.drawable.utt)
            }

            if (shorBornoGridList.get(position).gridName == "ঊ") {
                bornoTv.text = "ঊ"
                shobdoTv.text = "ঊষা"
                objectImg.setImageResource(R.drawable.usha)
            }
            if (shorBornoGridList[position].gridName == "ঋ") {
                bornoTv.text = "ঋ"
                shobdoTv.text = "ঋতু"
                objectImg.setImageResource(R.drawable.rritu)
            }
            if (shorBornoGridList.get(position).gridName == "এ") {
                bornoTv.text = "এ"
                shobdoTv.text = "একতারা"
                objectImg.setImageResource(R.drawable.ektara)
            }
            if (shorBornoGridList.get(position).gridName == "ঐ") {
                bornoTv.text = "ঐ"
                shobdoTv.text = "ঐরাবত"
                objectImg.setImageResource(R.drawable.oirabot)
            }
            if (shorBornoGridList.get(position).gridName == "ও") {
                bornoTv.text = "ও"
                shobdoTv.text = "ওজন"
                objectImg.setImageResource(R.drawable.ojon)
            }
            if (shorBornoGridList.get(position).gridName == "ঔ") {
                bornoTv.text = "ঔ"
                shobdoTv.text = "ঔষধ"
                objectImg.setImageResource(R.drawable.oushudh)
            }

        })
    }
}