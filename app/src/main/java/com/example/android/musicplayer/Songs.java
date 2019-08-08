package com.example.android.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    VariableAdapter songList;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Variable> library = new ArrayList<>();

        for (i=0; i<100; i++){

            library.add(new Variable("Song", "Artist"));


            songList = new VariableAdapter(this, library, R.color.category_library);
            ListView listView = findViewById(R.id.list);
            listView.setAdapter(songList);
        }

    }}