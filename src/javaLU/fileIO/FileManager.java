package javaLU.fileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = inputCommand(scanner);
            System.out.println("Input file Name:");
            String fileName = scanner.nextLine();


            if (command.equals("write")) {
                writeFile(fileName, scanner);
            } else if (command.equals("read")) {
                readFile(fileName);
            } else if (command.equals("edit")) {
                editFile(fileName, scanner);
            }

            System.out.println("Is that everything: yes/no");
            String finished = scanner.nextLine().toLowerCase();
            if (finished.equals("yes")) {
                break;
            }
        }
    }

    public static String inputCommand(Scanner scanner) {
        System.out.println("write/read/edit file?");
        while (true) {
            String command = scanner.nextLine().toLowerCase();
            if (command.equals("write") || command.equals("read") || command.equals("edit")) {
                return command;
            }
            System.out.println("Please enter a correct command");
        }
    }

    public static void editFile(String fileName, Scanner scanner) {
        String text = readFile(fileName);
        System.out.println("That's the file for now");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            List<String> lines = new ArrayList<>(text.lines().collect(Collectors.toList()));

            System.out.println("Enter add line/delete line/replace line/replace word");
            String command = scanner.nextLine();

            switch (command) {
                case "add line":
                    addLine(lines, scanner);
                    break;
                case "delete line":
                    deleteLine(lines, scanner);
                    break;
                case "replace line":
                    replaceLine(lines, scanner);
                    break;
                case "replace word":
                    replaceWord(text, scanner);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }

            text = String.join("\n", lines);
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Error editing file: " + e.getMessage());
        }
    }

    private static void addLine(List<String> lines, Scanner scanner) {
        System.out.printf("At which index? (0-%d)\n", lines.size());
        int index = getValidIntInput(scanner, lines.size());
        System.out.println("Enter new line:");
        String newLine = scanner.nextLine();
        lines.add(index, newLine);
    }

    private static void deleteLine(List<String> lines, Scanner scanner) {
        System.out.printf("Which of the %d lines?\n", lines.size());
        int index = getValidIntInput(scanner, lines.size());
        lines.remove(index);
    }

    private static void replaceLine(List<String> lines, Scanner scanner) {
        System.out.printf("Which of the %d lines?\n", lines.size());
        int index = getValidIntInput(scanner, lines.size());
        System.out.println("Enter the new line:");
        String newLine = scanner.nextLine();
        lines.set(index, newLine);
    }

    private static void replaceWord(String text, Scanner scanner) {
        while (true) {
            System.out.println("Which word? (or 'exit' to stop)");
            String word = scanner.nextLine();
            if (word.equals("exit")) {
                break;
            } else if (text.contains(word)) {
                System.out.println("Replacement:");
                String replacement = scanner.nextLine();
                text = text.replace(word, replacement);
                break;
            } else {
                System.out.println("The text doesn't contain that word. Try again or 'exit'.");
            }
        }
    }

    private static int getValidIntInput(Scanner scanner, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= 0 && input < max) {
                    return input;
                } else {
                    System.out.printf("Please enter a valid index between 0 and %d\n", max - 1);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }
    }

    public static String readFile(String fileName) {
        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
        return text.toString().trim();
    }

    public static void writeFile(String fileName, Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Write your input/Press Enter + Write 'stop'");
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("stop")) {
                    break;
                } else {
                    writer.write(input + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + fileName);
        }
    }
}