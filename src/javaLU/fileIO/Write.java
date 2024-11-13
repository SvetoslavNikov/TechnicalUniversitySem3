package javaLU.fileIO;

import java.io.*;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter \"write\" or \"edit\"");
            String command = scan.nextLine();

            System.out.println("Enter file name pls: ");
            String fileName = scan.nextLine();

            if (command.equals("write")) {
                read(fileName);
                break;
            } else if (command.equals("edit")) {
                writeFile(fileName);
                break;

            } else {
                System.out.println("Wrong command. Try again");
            }
        }


    }
        public static void read(String file) {

            Scanner scan = new Scanner(System.in);
            StringBuilder text = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);

                    System.out.println("Rewrite this line or press Enter to continue:");
                    String newline = scan.nextLine();

                    if (newline.isEmpty()) {
                        text.append(line + "\n");
                    } else {
                        text.append(newline + "\n");
                    }

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            writeFile(file, text.toString());
        }

public static void writeFile(String file, String text) {
        Scanner scan = new Scanner(System.in);
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file));) {
        String line;
        writer.write(text.toString());
        while (true) {
            System.out.println("Add something or write please stop:");
            line = scan.nextLine();

            if (line.equals("please stop")) {
                break;
            }
            writer.write(line);
            writer.write("\n");
        }
    } catch (IOException e) {
        System.out.println(e);
    }


}

    public static void writeFile(String file) {
        Scanner scan = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file));) {
            String line;
            while (true) {
                System.out.println("Add something or write please stop:");
                line = scan.nextLine();

                if (line.equals("please stop")) {
                    break;
                }
                writer.write(line);
                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }


    }

}
}
