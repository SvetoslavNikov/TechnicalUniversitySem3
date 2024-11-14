package javaLU.fileIO.SoftUniEx.NIOTHEKING;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesWriteOptions {
    public static void main(String[] args) throws IOException {
        Path projectDir = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\TechnicalUniversitySem3\\src\\javaLU\\fileIO\\SoftUniEx\\files");
        Path inputFile = projectDir.resolve("inputFile1");
        Path outputFile = projectDir.resolve("outputFile1");

        //Files.write(outputFile,"Hello there".getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

        /*BufferedWriter writer = Files.newBufferedWriter(outputFile,StandardCharsets.UTF_8);
        writer.write("Hi cutie");
        writer.flush();
        writer.close();*/

        //Files.writeString(outputFile,"\nHi, baby", StandardOpenOption.APPEND);


    }
}
