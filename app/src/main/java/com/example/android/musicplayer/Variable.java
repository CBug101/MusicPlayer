package com.example.android.musicplayer;

public class Variable {

    private String mSongName;

    private String mArtistName;

    //@param songName
    //@param artistName

    public Variable(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    // Get the song name.

    public String getSongName() {

        return mSongName;
    }

    // Get the artist name.

    public String getArtistName() {

        return mArtistName;
    }
}
