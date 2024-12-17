package learning.javaBasics.exercisingBasics.exerseBasics2.exerciseBasics3.zad2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += scanner.nextInt();
        }

        System.out.println("Sum: " + sum);
    }
}
