package javaLU.fileIO.SoftUniEx.Serializition;

import java.io.*;
import java.nio.channels.ScatteringByteChannel;

public class SerializeMusicPlaylist {
    public static void main(String[] args) {
        MusicPlaylist a = new MusicPlaylist(2, "RockNRoll");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MusicPlaylist.ser"));){
            oos.writeObject(a);
        } catch (Exception e){
            e.getMessage();
        }

        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("MusicPlaylist.ser"));){
            MusicPlaylist b = (MusicPlaylist) oos.readObject();
            System.out.println(b.getPlaylistName());
        } catch (Exception e){
            e.getMessage();
        }


    }
}
