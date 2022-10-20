package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myList = (ListView) findViewById(R.id.lstComponent);
        String[] components = getResources().getStringArray(R.array.components);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,components);
        myList.setAdapter(adapter);
        String[] myData = {"Lundi", "Mardi",
                "Mercredi", "Jeudi", "Vendredi",
                "Samedi", "Dimanche"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,myData);
    }
}