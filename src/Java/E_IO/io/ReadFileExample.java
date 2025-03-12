package Java.E_IO.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {

        //BufferedReader: Reads the file more efficiently by buffering data.
        //readLine(): Reads the file line-by-line.
        //try-with-resources: Automatically closes the stream after reading.

        String fileName = "C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\E_IO\\insput.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
