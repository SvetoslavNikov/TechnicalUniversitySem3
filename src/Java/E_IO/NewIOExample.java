package Java.E_IO;

import java.nio.file.*;
import java.io.IOException;

public class NewIOExample {
    public static void main(String[] args) {
        try {
            // Define paths for the source and destination files
            Path source = Paths.get("input.txt");
            Path destination = Paths.get("output.txt");

            // Copy the content from source to destination
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
