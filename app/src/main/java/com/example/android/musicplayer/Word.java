package com.example.android.musicplayer;

public class Word {

    // default translation for the word
    private String mSongName;

    private String mArtistName;


    /**
     * Create a new Word object.
     *
     * @param songName
     * @param artistName
     */

    public Word(String songName, String artistName) {
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
