package javaSU.SU3.zad2;

import java.util.Scanner;

public class PrintOneToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}


