package javaLU.fileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Write {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            String command = inputCommand();
            System.out.println("Input file Name:");
            String fileName = scan.nextLine();

            if (command.equals("write")) {
                writeFile(fileName);
            } else if (command.equals("read")) {
                readFile(fileName);
            } else if (command.equals("edit")) {
                editFile(fileName);
            }

            System.out.println("is that everything: yes/no");
            String finished = scan.nextLine().toLowerCase();
            if (finished.equals("yes")) {
                break;
            }
        }

    }

    public static String inputCommand() {
        Scanner scan = new Scanner(System.in);
        System.out.println("write/read/edit file?");
        String command;
        while (true) {
            command = scan.nextLine().toLowerCase();
            if (command.equals("write")
                    || command.equals("read")
                    || command.equals("edit")) {
                return command;
            }
            System.out.println("please enter correct command");
        }

    }

    public static void editFile(String fileName) {
        String text = readFile(fileName);
        System.out.println("That's the file for now");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Scanner scan = new Scanner(System.in);

            List<String> lines = new ArrayList<>(text.lines().collect(Collectors.toList()));
            System.out.println("Enter add line/delete line/replace line/replace word");
            String command = scan.nextLine();



            switch (command) {
                case "add line":
                    int idx = 0;
                    while (true) {
                        System.out.printf("at witch index?\n", text.lines());

                        try {
                            idx = Integer.parseInt(scan.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("input a number pls");
                            continue;
                        }
                        System.out.println("Enter new line: ");
                        if (idx > lines.size() - 1) {
                            lines.add(scan.nextLine());
                            System.out.println("The line was added at the end");
                            break;
                        } else {
                            lines.add(idx, scan.nextLine());
                        }
                    }

                case "delete line":
                    while (true) {
                        System.out.printf("which of the %d lines", lines.size());

                        try {
                            idx = Integer.parseInt(scan.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("input a number pls");
                            continue;
                        }
                        if (idx > lines.size() - 1) {
                            System.out.println("incorrect idx");
                        } else {
                            break;
                        }
                    }
                    System.out.println("Write the new line:");
                    lines.add(idx, scan.next());
                    break;
                case "replace line":
                    System.out.printf("which of the %d lines", lines.size());
                    while (true) {
                        System.out.printf("which of the %d lines", lines.size());

                        try {
                            idx = Integer.parseInt(scan.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("input a number pls");
                            continue;
                        }
                        if (idx > lines.size() - 1) {
                            System.out.println("incorrect idx");
                        } else {
                            break;
                        }
                    }
                    lines.remove(idx);
                    System.out.println("Write the new line:");
                    lines.add(idx, scan.next());
                    break;
                case "replace word":
                    while (true) {
                        System.out.println("Which word?");
                        String word = scan.nextLine();
                        if (text.contains(word)) {
                            System.out.println("Replacement:");
                            text.replace(word, scan.nextLine());
                            break;
                        } else if (word.equals("exit")) {
                            break;
                        } else {
                            System.out.println("The text doesnt contain such word try again or \"exit\"");
                        }
                    }
                    break;
            }

            text = String.join("/n" + lines);
            writer.write(text);

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }


    }

    public static String readFile(String fileName) {

        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line);
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        return text.toString();
    }

    public static void writeFile(String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Scanner scan = new Scanner(System.in);
            String input;
            System.out.println("Write your input/Press Enter + Write \"stop\"");

            while (true) {
                input = scan.nextLine();
                if (input.equals("stop")) {
                    break;
                } else {
                    writer.write(input + "\n");

                }
            }

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }


}

