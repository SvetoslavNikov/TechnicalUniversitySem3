package Java.E_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OldIOExample {
    public static void main(String[] args) {
        try {
            // Reading bytes from a file
            FileInputStream fis = new FileInputStream("input.txt");
            // Writing bytes to a file
            FileOutputStream fos = new FileOutputStream("output.txt");

            int byteData;
            // Read and write byte-by-byte until EOF (end of file)
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            // Close streams to release resources
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

