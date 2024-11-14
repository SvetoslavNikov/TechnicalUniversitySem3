package javaLU.fileIO.SoftUniEx;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileInputOutputStream {
    public static void main(String[] args) {
        String root = System.getProperty("user.dir");

        String path = root + "\\thirdWrite";
        try(FileInputStream fileStream = new FileInputStream((path));
            FileOutputStream outputStream = new FileOutputStream("thirdWriteWithoutSymbols")){
            //save the new text in a new file

            int oneByte = fileStream.read();
            ArrayList<Character> symbols = new ArrayList<>();
            Collections.addAll(symbols, ',', '.', '!', '?');
            //skip them  in printing

            while (oneByte >= 0) {
                int ch = (char)oneByte;
                if(!symbols.contains(ch)){
                System.out.print(ch);
                outputStream.write(ch);
                }
                oneByte = fileStream.read();
            }
        }catch(IOException e){
            System.out.println(e);
        }



    }
}
