package learning.javaBasics.exercisingBasics.exerseBasics2.exerciseBasics3.zad1;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}

