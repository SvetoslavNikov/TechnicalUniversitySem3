package learning.javaBasics.exercisingBasics.exerseBasics2.exerciseBasics3.zad2;
import java.util.Scanner;

public class PrintNToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

