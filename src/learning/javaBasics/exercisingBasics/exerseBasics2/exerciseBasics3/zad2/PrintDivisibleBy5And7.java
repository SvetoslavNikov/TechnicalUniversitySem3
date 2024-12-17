package learning.javaBasics.exercisingBasics.exerseBasics2.exerciseBasics3.zad2;

import java.util.Scanner;

public class PrintDivisibleBy5And7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}