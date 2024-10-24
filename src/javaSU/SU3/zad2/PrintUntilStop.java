package javaSU.SU3.zad2;

import java.util.Scanner;

public class PrintUntilStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Stop")) {
                break;
            }
            System.out.println(input);
        }
    }
}
