package Java.E_IO.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlockingIOExample {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\E_IO\\input.txt";
        FileReader file = new FileReader(fileName);
        BufferedReader br = new BufferedReader(file);

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        //Each call to readLine() blocks the program until it gets the next line from the file.
        //If you had multiple files or tasks, this would slow down because it waits for each file operation to complete.

        br.close();
    }
}


