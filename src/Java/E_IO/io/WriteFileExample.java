package Java.E_IO.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\E_IO\\input.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            bw.write("Hi");
            bw.newLine();
            bw.write("This is another line.");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
