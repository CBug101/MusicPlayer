
package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<com.example.android.musicplayer.Word> {


    public WordAdapter(Activity context, ArrayList<com.example.android.musicplayer.Word> words, int color) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            com.example.android.musicplayer.Word currentWord = getItem(position);

            TextView textView1 = listItemView.findViewById(R.id.text_view1);
            textView1.setText(currentWord.getArtistName());

            TextView textView2 = listItemView.findViewById(R.id.text_view2);
            textView2.setText(currentWord.getSongName());


    }

        return listItemView;
    }

}
