package javaLU.fileIO.SoftUniEx.FileClass;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File root = new File("C:\\Users\\Lenovo\\IdeaProjects\\TechnicalUniversitySem3\\src\\javaLU\\fileIO\\SoftUniEx");

        printDirectoryTree(root, "", true);
    }

    public static void printDirectoryTree(File file, String indent, boolean isLast) {
        if (!file.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }

        // Print the current file/directory
        System.out.println(indent + (isLast ? "└── " : "├── ") + file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    printDirectoryTree(files[i], indent + (isLast ? "    " : "│   "), i == files.length - 1);
                }
            }
        }
    }
}



        /* solution 1 - potential stackoverflow

        File[] files = root.listFiles();
        filesPrint(files);
    }
    public static void filesPrint( File[] files){
        if (files == null) return;

        for (int i = 0; i < files.length; i++) {
            if(files[i].isDirectory()){
                filesPrint(files[i].listFiles());
            } else {
                System.out.println(files[i].getAbsolutePath());
            }
        }
    }*/


