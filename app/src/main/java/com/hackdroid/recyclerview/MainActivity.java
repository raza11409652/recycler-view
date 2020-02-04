package com.hackdroid.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /**
     * RecyclerView Example
     */
    List<ListModel> listModels = new ArrayList<>();

    ListAdapter listAdapter;
    RecyclerView recyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * @ Init view
         * */
        recyclerview = findViewById(R.id.listData);
        recyclerview.setHasFixedSize(true);

        /**
         * Data for RecyclerView
         * */
        for (int i = 0; i <= 10; i++) {
            ListModel listModel = new ListModel(String.valueOf(i), "Title", "Desc example" + i);
            listModels.add(listModel);
        }

        //setAdapter

        listAdapter = new ListAdapter(listModels, this, this);
        recyclerview.setAdapter(listAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

    }
}
