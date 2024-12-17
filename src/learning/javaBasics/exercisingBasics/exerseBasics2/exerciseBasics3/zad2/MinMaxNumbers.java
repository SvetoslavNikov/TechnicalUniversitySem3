package learning.javaBasics.exercisingBasics.exerseBasics2.exerciseBasics3.zad2;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

