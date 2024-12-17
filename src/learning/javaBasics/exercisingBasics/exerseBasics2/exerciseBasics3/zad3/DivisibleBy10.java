package learning.javaBasics.exercisingBasics.exerseBasics2.exerciseBasics3.zad3;

import java.util.Scanner;

public class DivisibleBy10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number divisible by 10: ");
            int n = scanner.nextInt();
            if (n % 10 == 0) {
                System.out.println("Valid number");
                break;
            } else {
                System.out.println("Error: The number is not divisible by 10.");
            }
        }
    }
}







class TimeAfter15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hou: ");
        int hour = scanner.nextInt();
        System.out.print("Enter min: ");
        int minutes = scanner.nextInt();

        minutes += 15;
        if (minutes >= 60) {
            hour += 1;
            minutes -= 60;
        }
        if (hour >= 24) {
            hour = 0;
        }

        System.out.printf("Time after 15 min: %d:%02d%n", hour, minutes);
    }
}



class ValidNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numy: ");
        int number = scanner.nextInt();
        if (number >= 1 && number % 5 == 0) {
            System.out.println("Valid!");
        } else {
            System.out.println("Invalid!");
        }
    }
}


class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (N > 1): ");
        int N = scanner.nextInt();
        System.out.print("Enter K (1 < K < N): ");
        int K = scanner.nextInt();

        int factorialN = 1;
        int factorialK = 1;
        for (int i = 1; i <= N; i++) {
            factorialN *= i;
            if (i <= K) {
                factorialK *= i;
            }
        }

        System.out.printf("N!/K! = %d%n", factorialN / factorialK);
    }
}


class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (N > 1): ");
        int N = scanner.nextInt();
        System.out.print("Enter K (1 < K < N): ");
        int K = scanner.nextInt();

        int factorialN = 1;
        int factorialK = 1;
        int factorialNminusK = 1;
        for (int i = 1; i <= N; i++) {
            factorialN *= i;
            if (i <= K) {
                factorialK *= i;
            }
            if (i <= N - K) {
                factorialNminusK *= i;
            }
        }

        System.out.printf("N!*K!/(N-K)! = %d%n"
                , factorialN * factorialK / factorialNminusK);
    }
}
