package javaLU.fileIO.SoftUniEx.NIOTHEKING;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FilesReadOptions {
    public static void main(String[] args) throws IOException {
        Path projectDir = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\TechnicalUniversitySem3\\src\\javaLU\\fileIO\\SoftUniEx\\files");
        Path inputFile = projectDir.resolve("inputFile1");
        Path outputFile = projectDir.resolve("outputFile1");

        List<String> lines;
        lines = Files.readAllLines(outputFile);//returns list
        System.out.println(lines);

        String s = Files.readString(outputFile);
        System.out.println(s);//whole file

        BufferedReader reader = Files.newBufferedReader(outputFile);
        System.out.println(reader.read());//ascii
        System.out.println(reader.readLine());//first line


    }
}
