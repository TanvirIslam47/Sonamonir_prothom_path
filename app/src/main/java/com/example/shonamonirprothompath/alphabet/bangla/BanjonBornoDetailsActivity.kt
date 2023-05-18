package com.example.shonamonirprothompath.alphabet.bangla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import com.example.shonamonirprothompath.R
import com.example.shonamonirprothompath.adapter.AlphabetGridAdapter
import com.example.shonamonirprothompath.adapter.AlphabetGridDetailsAdapter
import com.example.shonamonirprothompath.model.AlphabetGridModel

/** Intent from BanjonBornoActivity **/
class BanjonBornoDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banjon_borno_details)

        val bornoTv = findViewById<TextView>(R.id.bornoTvId)
        val shobdoTv = findViewById<TextView>(R.id.shobdoTvId)
        val objectImg = findViewById<ImageView>(R.id.objectImgId)
        val banjonBornoGridView = findViewById<GridView>(R.id.banjonBornoGridViewId)
        val banjonBornoGridList = ArrayList<AlphabetGridModel>()

        val bundle: Bundle? = intent.extras
        val letter: String? = intent.getStringExtra("key")

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

        val adapter = AlphabetGridDetailsAdapter(this, banjonBornoGridList)
        banjonBornoGridView.setAdapter(adapter)

        if (letter == "ক") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ক"
            shobdoTv.text = "কাকাতুয়া"
            objectImg.setImageResource(R.drawable.kakatua)
        }
        if (letter == "খ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "খ"
            shobdoTv.text = "খরগোশ"
            objectImg.setImageResource(R.drawable.khorgosh)
        }
        if (letter == "গ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "গ"
            shobdoTv.text = "গরু"
            objectImg.setImageResource(R.drawable.goru)
        }
        if (letter == "ঘ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঘ"
            shobdoTv.text = "ঘোড়া"
            objectImg.setImageResource(R.drawable.ghora)
        }
        if (letter == "ঙ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঙ"
            shobdoTv.text = "ব্যাঙ"
            objectImg.setImageResource(R.drawable.bang)
        }
        if (letter == "চ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "চ"
            shobdoTv.text = "চা"
            objectImg.setImageResource(R.drawable.tea)
        }
        if (letter == "ছ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ছ"
            shobdoTv.text = "ছাতা"
            objectImg.setImageResource(R.drawable.chata)
        }
        if (letter == "জ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "জ"
            shobdoTv.text = "জাহাজ"
            objectImg.setImageResource(R.drawable.jahaj)
        }
        if (letter == "ঝ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঝ"
            shobdoTv.text = "ঝিনুক"
            objectImg.setImageResource(R.drawable.jhinuk)
        }
        if (letter == "ঞ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঞ"
            shobdoTv.text = "মিঞাও"
            objectImg.setImageResource(R.drawable.miaou)
        }
        if (letter == "ট") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ট"
            shobdoTv.text = "টিয়া"
            objectImg.setImageResource(R.drawable.tiya)
        }
        if (letter == "ঠ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঠ"
            shobdoTv.text = "ঠেলাগাড়ি"
            objectImg.setImageResource(R.drawable.thela_gari)
        }
        if (letter == "ড") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ড"
            shobdoTv.text = "ডাব"
            objectImg.setImageResource(R.drawable.dab)
        }
        if (letter == "ঢ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঢ"
            shobdoTv.text = "ঢোল"
            objectImg.setImageResource(R.drawable.dhol)
        }
        if (letter == "ণ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ণ"
            shobdoTv.text = "হরিণ"
            objectImg.setImageResource(R.drawable.horin)
        }
        if (letter == "ত") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ত"
            shobdoTv.text = "তরমুজ"
            objectImg.setImageResource(R.drawable.tormuj)
        }
        if (letter == "থ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "থ"
            shobdoTv.text = "থালা"
            objectImg.setImageResource(R.drawable.thala)
        }
        if (letter == "দ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "দ"
            shobdoTv.text = "দোয়েল"
            objectImg.setImageResource(R.drawable.doyel)
        }
        if (letter == "ধ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ধ"
            shobdoTv.text = "ধান"
            objectImg.setImageResource(R.drawable.dhan)
        }
        if (letter == "ন") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ন"
            shobdoTv.text = "নৌকা"
            objectImg.setImageResource(R.drawable.nouka)
        }
        if (letter == "প") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "প"
            shobdoTv.text = "পেঁচা"
            objectImg.setImageResource(R.drawable.pecha)
        }
        if (letter == "ফ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ফ"
            shobdoTv.text = "ফড়িং"
            objectImg.setImageResource(R.drawable.foring)
        }
        if (letter == "ব") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ব"
            shobdoTv.text = "বই"
            objectImg.setImageResource(R.drawable.boi)
        }
        if (letter == "ভ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ভ"
            shobdoTv.text = "ভাল্লুক"
            objectImg.setImageResource(R.drawable.valluk)
        }
        if (letter == "ম") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ম"
            shobdoTv.text = "ময়ূর"
            objectImg.setImageResource(R.drawable.moiur)
        }
        if (letter == "য") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "য"
            shobdoTv.text = "যব"
            objectImg.setImageResource(R.drawable.zob)
        }
        if (letter == "র") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "র"
            shobdoTv.text = "রেল-গাড়ি"
            objectImg.setImageResource(R.drawable.rail_gari)
        }
        if (letter == "ল") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ল"
            shobdoTv.text = "লাটিম"
            objectImg.setImageResource(R.drawable.latim)
        }
        if (letter == "শ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "শ"
            shobdoTv.text = "শকুন"
            objectImg.setImageResource(R.drawable.shokun)
        }
        if (letter == "ষ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ষ"
            shobdoTv.text = "ষাঁড়"
            objectImg.setImageResource(R.drawable.shar)
        }
        if (letter == "স") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "স"
            shobdoTv.text = "সিংহ"
            objectImg.setImageResource(R.drawable.shingho)
        }
        if (letter == "হ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "হ"
            shobdoTv.text = "হাতি"
            objectImg.setImageResource(R.drawable.hati)
        }
        if (letter == "ড়") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ড়"
            shobdoTv.text = "ঘুড়ি"
            objectImg.setImageResource(R.drawable.ghuri)
        }
        if (letter == "ঢ়") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঢ়"
            shobdoTv.text = "আষাঢ়"
            objectImg.setImageResource(R.drawable.ashar)
        }
        if (letter == "য়") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "য়"
            shobdoTv.text = "পায়রা"
            objectImg.setImageResource(R.drawable.payra)
        }
        if (letter == "ৎ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ৎ"
            shobdoTv.text = "মৎস্য"
            objectImg.setImageResource(R.drawable.motso)
        }
        if (letter == "ং") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ং"
            shobdoTv.text = "চিংড়ি"
            objectImg.setImageResource(R.drawable.chingri)
        }
        if (letter == "ঃ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঃ"
            shobdoTv.text = "দুঃখ"
            objectImg.setImageResource(R.drawable.dukkho)
        }
        if (letter == "ঁ") {
//            shorBornoGridView.setSelector(0);
            bornoTv.text = "ঁ"
            shobdoTv.text = "চাঁদ"
            objectImg.setImageResource(R.drawable.moon)
        }

        banjonBornoGridView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            if (banjonBornoGridList.get(position).gridName == "ক") {
                bornoTv.text = "ক"
                shobdoTv.text = "কাকাতুয়া"
                objectImg.setImageResource(R.drawable.kakatua)
            }
            if (banjonBornoGridList.get(position).gridName == "খ") {
                bornoTv.text = "খ"
                shobdoTv.text = "খরগোশ"
                objectImg.setImageResource(R.drawable.khorgosh)
            }
            if (banjonBornoGridList.get(position).gridName == "গ") {
                bornoTv.text = "গ"
                shobdoTv.text = "গরু"
                objectImg.setImageResource(R.drawable.goru)
            }
            if (banjonBornoGridList.get(position).gridName == "ঘ") {
                bornoTv.text = "ঘ"
                shobdoTv.text = "ঘোড়া"
                objectImg.setImageResource(R.drawable.ghora)
            }

            if (banjonBornoGridList.get(position).gridName == "ঙ") {
                bornoTv.text = "ঙ"
                shobdoTv.text = "ব্যাঙ"
                objectImg.setImageResource(R.drawable.bang)
            }

            if (banjonBornoGridList.get(position).gridName == "চ") {
                bornoTv.text = "চ"
                shobdoTv.text = "চা"
                objectImg.setImageResource(R.drawable.tea)
            }

            if (banjonBornoGridList.get(position).gridName == "ছ") {
                bornoTv.text = "ছ"
                shobdoTv.text = "ছাতা"
                objectImg.setImageResource(R.drawable.chata)
            }
            if (banjonBornoGridList[position].gridName == "জ") {
                bornoTv.text = "জ"
                shobdoTv.text = "জাহাজ"
                objectImg.setImageResource(R.drawable.jahaj)
            }
            if (banjonBornoGridList.get(position).gridName == "ঝ") {
                bornoTv.text = "ঝ"
                shobdoTv.text = "ঝিনুক"
                objectImg.setImageResource(R.drawable.jhinuk)
            }
            if (banjonBornoGridList.get(position).gridName == "ঞ") {
                bornoTv.text = "ঞ"
                shobdoTv.text = "মিঞাও"
                objectImg.setImageResource(R.drawable.miaou)
            }
            if (banjonBornoGridList.get(position).gridName == "ট") {
                bornoTv.text = "ট"
                shobdoTv.text = "টিয়া"
                objectImg.setImageResource(R.drawable.tiya)
            }
            if (banjonBornoGridList.get(position).gridName == "ঠ") {
                bornoTv.text = "ঠ"
                shobdoTv.text = "ঠেলাগাড়ি"
                objectImg.setImageResource(R.drawable.thela_gari)
            }
            if (banjonBornoGridList.get(position).gridName == "ড") {
                bornoTv.text = "ড"
                shobdoTv.text = "ডাব"
                objectImg.setImageResource(R.drawable.dab)
            }
            if (banjonBornoGridList.get(position).gridName == "ঢ") {
                bornoTv.text = "ঢ"
                shobdoTv.text = "ঢোল"
                objectImg.setImageResource(R.drawable.dhol)
            }
            if (banjonBornoGridList.get(position).gridName == "ণ") {
                bornoTv.text = "ণ"
                shobdoTv.text = "হরিণ"
                objectImg.setImageResource(R.drawable.horin)
            }
            if (banjonBornoGridList.get(position).gridName == "ত") {
                bornoTv.text = "ত"
                shobdoTv.text = "তরমুজ"
                objectImg.setImageResource(R.drawable.tormuj)
            }

            if (banjonBornoGridList.get(position).gridName == "থ") {
                bornoTv.text = "থ"
                shobdoTv.text = "থালা"
                objectImg.setImageResource(R.drawable.thala)
            }

            if (banjonBornoGridList.get(position).gridName == "দ") {
                bornoTv.text = "দ"
                shobdoTv.text = "দোয়েল"
                objectImg.setImageResource(R.drawable.doyel)
            }

            if (banjonBornoGridList.get(position).gridName == "ধ") {
                bornoTv.text = "ধ"
                shobdoTv.text = "ধান"
                objectImg.setImageResource(R.drawable.dhan)
            }
            if (banjonBornoGridList[position].gridName == "ন") {
                bornoTv.text = "ন"
                shobdoTv.text = "নৌকা"
                objectImg.setImageResource(R.drawable.nouka)
            }
            if (banjonBornoGridList.get(position).gridName == "প") {
                bornoTv.text = "প"
                shobdoTv.text = "পেঁচা"
                objectImg.setImageResource(R.drawable.pecha)
            }
            if (banjonBornoGridList.get(position).gridName == "ফ") {
                bornoTv.text = "ফ"
                shobdoTv.text = "ফড়িং"
                objectImg.setImageResource(R.drawable.foring)
            }
            if (banjonBornoGridList.get(position).gridName == "ব") {
                bornoTv.text = "ব"
                shobdoTv.text = "বই"
                objectImg.setImageResource(R.drawable.boi)
            }
            if (banjonBornoGridList.get(position).gridName == "ভ") {
                bornoTv.text = "ভ"
                shobdoTv.text = "ভাল্লুক"
                objectImg.setImageResource(R.drawable.valluk)
            }
            if (banjonBornoGridList.get(position).gridName == "ম") {
                bornoTv.text = "ম"
                shobdoTv.text = "ময়ূর"
                objectImg.setImageResource(R.drawable.moiur)
            }
            if (banjonBornoGridList.get(position).gridName == "য") {
                bornoTv.text = "য"
                shobdoTv.text = "যব"
                objectImg.setImageResource(R.drawable.zob)
            }
            if (banjonBornoGridList.get(position).gridName == "র") {
                bornoTv.text = "র"
                shobdoTv.text = "রেল-গাড়ি"
                objectImg.setImageResource(R.drawable.rail_gari)
            }
            if (banjonBornoGridList.get(position).gridName == "ল") {
                bornoTv.text = "ল"
                shobdoTv.text = "লাটিম"
                objectImg.setImageResource(R.drawable.latim)
            }

            if (banjonBornoGridList.get(position).gridName == "শ") {
                bornoTv.text = "শ"
                shobdoTv.text = "শকুন"
                objectImg.setImageResource(R.drawable.shokun)
            }

            if (banjonBornoGridList.get(position).gridName == "ষ") {
                bornoTv.text = "ষ"
                shobdoTv.text = "ষাঁড়"
                objectImg.setImageResource(R.drawable.shar)
            }

            if (banjonBornoGridList.get(position).gridName == "স") {
                bornoTv.text = "স"
                shobdoTv.text = "সিংহ"
                objectImg.setImageResource(R.drawable.shingho)
            }
            if (banjonBornoGridList[position].gridName == "হ") {
                bornoTv.text = "হ"
                shobdoTv.text = "হাতি"
                objectImg.setImageResource(R.drawable.hati)
            }
            if (banjonBornoGridList.get(position).gridName == "ড়") {
                bornoTv.text = "ড়"
                shobdoTv.text = "ঘুড়ি"
                objectImg.setImageResource(R.drawable.ghuri)
            }
            if (banjonBornoGridList.get(position).gridName == "ঢ়") {
                bornoTv.text = "ঢ়"
                shobdoTv.text = "আষাঢ়"
                objectImg.setImageResource(R.drawable.ashar)
            }
            if (banjonBornoGridList.get(position).gridName == "য়") {
                bornoTv.text = "য়"
                shobdoTv.text = "পায়রা"
                objectImg.setImageResource(R.drawable.payra)
            }
            if (banjonBornoGridList.get(position).gridName == "ৎ") {
                bornoTv.text = "ৎ"
                shobdoTv.text = "মৎস্য"
                objectImg.setImageResource(R.drawable.motso)
            }
            if (banjonBornoGridList.get(position).gridName == "ং") {
                bornoTv.text = "ং"
                shobdoTv.text = "চিংড়ি"
                objectImg.setImageResource(R.drawable.chingri)
            }
            if (banjonBornoGridList.get(position).gridName == "ঃ") {
                bornoTv.text = "ঃ"
                shobdoTv.text = "দুঃখ"
                objectImg.setImageResource(R.drawable.dukkho)
            }
            if (banjonBornoGridList.get(position).gridName == "ঁ") {
                bornoTv.text = "ঁ"
                shobdoTv.text = "চাঁদ"
                objectImg.setImageResource(R.drawable.moon)
            }
        })
    }
}