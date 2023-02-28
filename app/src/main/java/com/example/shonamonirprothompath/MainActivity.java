package com.example.shonamonirprothompath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.shonamonirprothompath.adapter.MainGridAdapter;
import com.example.shonamonirprothompath.alphabet.AlphabetActivity;
import com.example.shonamonirprothompath.model.MainGridModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView mainGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<MainGridModel> mainGridList = new ArrayList<>();

        mainGridView = findViewById(R.id.homeGridViewId);

        mainGridList.add(new MainGridModel("বর্ণমালা", R.drawable.alphabet));
        mainGridList.add(new MainGridModel("ফল", R.drawable.fruits));
        mainGridList.add(new MainGridModel("ফুল", R.drawable.flowers));
        mainGridList.add(new MainGridModel("পশু", R.drawable.animals));
        mainGridList.add(new MainGridModel("পাখি", R.drawable.birds));
        mainGridList.add(new MainGridModel("দিন মাস ঋতু", R.drawable.day_month));

        MainGridAdapter adapter = new MainGridAdapter(this, mainGridList);
        mainGridView.setAdapter(adapter);

        mainGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mainGridList.get(position).getGridName().equals("বর্ণমালা")){
                    startActivity(new Intent(MainActivity.this, AlphabetActivity.class));
                }

//                if (mainGridList.get(position).getGridName().equals("Supplementary Bill")){
//                    startActivity(new Intent(MainActivity.this, SuppCustomerInfoActivity.class));
//                }
//                if (mainGridList.get(position).getGridName().equals("Dc/Rc Bill")){
//                    startActivity(new Intent(MainActivity.this, DcrcCustomerInfo.class));
//                }
            }
        });
    }
}