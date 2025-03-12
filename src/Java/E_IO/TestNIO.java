package Java.E_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestNIO {
    public static void main(String[] args){
        try{
            Path source = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\E_IO\\input.txt");
            Path destination = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\E_IO\\output.txt");
            System.out.println(Files.readString(source));


        } catch(IOException e){
            System.out.println(e);
        }
    }
}
