package javaLU.fileIO.SoftUniEx;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {

        // Create a Path by combining different parts of the path
        Path projectDir = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\TechnicalUniversitySem3\\src\\javaLU\\fileIO\\SoftUniEx\\files");

        Path filePath = projectDir.resolve("data.txt"); // Combines the folder path with the file name

        System.out.println("File Path: " + filePath);
    }
}



