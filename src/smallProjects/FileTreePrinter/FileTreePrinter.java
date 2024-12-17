package smallProjects.FileTreePrinter;

import java.io.File;

public class FileTreePrinter {

    public static void main(String[] args) {
        // Specify the directory to start from
        File rootDirectory = new File("C:\\Users\\Lenovo\\IdeaProjects\\TechnicalUniversitySem3"); // Change this to your directory path

        if (rootDirectory.exists() && rootDirectory.isDirectory()) {
            printFileTree(rootDirectory, 0);
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }

    // Recursive method to print the file tree
    public static void printFileTree(File directory, int level) {
        // Print the current directory or file with indentation based on level
        printWithIndentation(directory.getName(), level);

        // If it's a directory, process its contents
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    printFileTree(file, level + 1); // Recurse for each file/directory
                }
            }
        }
    }

    // Helper method to print with indentation
    private static void printWithIndentation(String name, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  "); // Add two spaces per level
        }
        System.out.println(name);
    }
}
