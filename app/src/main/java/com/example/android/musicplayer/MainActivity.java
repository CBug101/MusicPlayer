package com.example.android.musicplayer;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Declare CardView to playermode
    CardView playermode;
    CardView settingsmode;
    CardView librarymode;
    CardView songsmode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finds the view (card) named playerCard and sets it to playermode
        playermode = findViewById(R.id.playerCard);

        //Sets a click listener on playermode(playerCard)
        playermode.setOnClickListener(new View.OnClickListener() {

            //On click "this" main activity will switch screen to PlayMode.class
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlayMode.class);
                startActivity(intent);
            }
        });

        //Finds the view (card) named settings_card Card and sets it to settingsmode
        settingsmode = findViewById(R.id.settingsCard);

        //Sets a click listener on settingsmode(playerCard)
        settingsmode.setOnClickListener(new View.OnClickListener() {

            //On click "this" main activity will switch screen to PlayMode.class
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
            }
        });

        //Finds the view (card) named settings_card Card and sets it to settingsmode
        librarymode = findViewById(R.id.libraryCard);

        //Sets a click listener on librarymode(playerCard)
        librarymode.setOnClickListener(new View.OnClickListener() {

            //On click "this" main activity will switch screen to PlayMode.class
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.android.musicplayer.Library.class);
                startActivity(intent);
            }
        });

        //Finds the view (card) named settings_card Card and sets it to settingsmode
        songsmode = findViewById(R.id.songs_card);

        //Sets a click listener on songssmode(playerCard)
        songsmode.setOnClickListener(new View.OnClickListener() {

            //On click "this" main activity will switch screen to PlayMode.class
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Songs.class);
                startActivity(intent);
            }
        });

    }

}