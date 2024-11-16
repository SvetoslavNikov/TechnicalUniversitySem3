package javaLU.fileIO.SoftUniEx.Serializition;

import java.io.Serializable;

public class MusicPlaylist implements Serializable {
    private int songsCount;
    private String PlaylistName;

    public MusicPlaylist(int songsCount, String PlaylistName){
        this.songsCount = songsCount;
        this.PlaylistName = PlaylistName;
    }

    public int getSongsCount(){
        return this.songsCount;
    }


    public String getPlaylistName(){
        return this.PlaylistName;
    }

}
