package learning.javaBasics.exercisingBasics.exerseBasics2.exerciseBasics3.zad1;

import java.util.Scanner;

public class NumInIntervalCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

