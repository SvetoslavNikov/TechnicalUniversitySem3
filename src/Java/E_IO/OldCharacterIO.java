package Java.E_IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OldCharacterIO {
    public static void main(String[] args) {
        try {
            // Reading characters from a file
            FileReader fr = new FileReader("input.txt");
            // Writing characters to a file
            FileWriter fw = new FileWriter("output.txt");

            int charData;
            // Read and write character-by-character
            while ((charData = fr.read()) != -1) {
                fw.write(charData);
            }

            // Close streams to release resources
            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

