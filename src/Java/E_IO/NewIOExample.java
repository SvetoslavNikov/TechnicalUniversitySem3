package Java.E_IO;

import java.nio.file.*;
import java.io.IOException;

public class NewIOExample {
    public static void main(String[] args) {
        try {
            // Define paths for the source and destination files
            Path source = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\E_IO\\input.txt");
            Path destination = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\E_IO\\output.txt");

            System.out.println(Files.readString(source));
            String s = Files.readString(source);
            // Copy the content from source to destination
//            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            Files.writeString(destination,s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
