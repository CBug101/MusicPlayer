
package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Originally created by GemShare on 5/4/2017.
 * applied my own usage to this adapter design josh 8/7/2019
 */

public class VariableAdapter extends ArrayAdapter<Variable> {


    public VariableAdapter(Activity context, ArrayList<Variable> words, int color) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.text_style, parent, false);
            Variable currentWord = getItem(position);

            TextView textView1 = listItemView.findViewById(R.id.text_view1);
            textView1.setText(currentWord.getArtistName());

            TextView textView2 = listItemView.findViewById(R.id.text_view2);
            textView2.setText(currentWord.getSongName());


    }

        return listItemView;
    }

}
