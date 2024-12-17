package learning.javaBasics.exercisingBasics.exerseBasics2.exerciseBasics3.zad1;

import java.util.Scanner;

public class IsItWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Working day");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
