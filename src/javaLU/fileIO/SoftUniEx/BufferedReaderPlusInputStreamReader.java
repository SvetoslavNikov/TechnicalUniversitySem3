package javaLU.fileIO.SoftUniEx;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderPlusInputStreamReader {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))){
            String hey = reader.readLine();
            System.out.println(hey);
            //System.out.println(reader.read()); - ASCII value of the first char

        }catch(IOException e){
            e.getStackTrace();
        }

    }
}
