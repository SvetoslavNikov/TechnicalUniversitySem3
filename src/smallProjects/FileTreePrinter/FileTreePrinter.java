package smallProjects.FileTreePrinter;

import java.io.File;

public class FileTreePrinter {

    public static void main(String[] args) {
        File rootDirectory = new File("C:\\Users\\Lenovo\\IdeaProjects\\TechnicalUniversitySem3\\src"); // Change this to your directory path

        if (rootDirectory.exists() && rootDirectory.isDirectory()) {
            printFileTree(rootDirectory, 0);
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }

    // recursion used
    public static void printFileTree(File directory, int level) {

        printWithIndentation(directory.getName(), level);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    printFileTree(file, level + 1);
                }
            }
        }
    }

    private static void printWithIndentation(String name, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  "); // add spaces for each level
        }
        System.out.println(name);
    }
}
