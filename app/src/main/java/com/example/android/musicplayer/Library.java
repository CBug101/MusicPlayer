package com.example.android.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    WordAdapter wordAdapter;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Word> library = new ArrayList<>();

        for (i=0; i<100; i++){

        library.add(new Word("Song", "Author"));


        wordAdapter = new WordAdapter(this, library, R.color.category_library);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }

}}