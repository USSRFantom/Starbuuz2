package com.hfad.starbuuz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position ==0){
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.list_optoins);
        listView.setOnItemClickListener(itemClickListener);
    }
}
