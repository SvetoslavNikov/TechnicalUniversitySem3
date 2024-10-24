package javaSU.SU3;

import java.util.Scanner;

public class movie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int numberOfExtras = scanner.nextInt();
        double clothingPricePerExtra = scanner.nextDouble();


        double decorCost = budget * 0.10;
        double clothingCost = numberOfExtras * clothingPricePerExtra;


        if (numberOfExtras > 150) {
            clothingCost *= 0.90;
        }

        double totalCost = decorCost + clothingCost;


        if (totalCost > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more."
                    , totalCost - budget);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left."
                    , budget - totalCost);
        }
    }
}

