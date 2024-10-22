package javaLU.LU5.exceptionsExercises.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prices {
    public static void main(String[] args) {
        boolean correctPrices = false;

        while (!correctPrices) {
            try {
                double TVprice = getPrice("TV");
                double PCprice = getPrice("PC");
                correctPrices = true; // Set to true only if both prices are correct

                // Calculate total cost
                double totalCost = TVprice + PCprice;
                System.out.println("Total cost: " + totalCost);
            } catch (PriceException | InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static double getPrice(String type) throws PriceException {
        Scanner scan = new Scanner(System.in);
        double price = 0;
        System.out.print("Enter the price for " + type + ": ");

        try {
            price = scan.nextDouble();
            if (type.equals("TV")) {
                if (price > 100 && price < 1000) {
                    System.out.println("Correct price for TV");
                } else {
                    throw new PriceException("Incorrect TV price. Must be between 100 and 1000.");
                }
            } else if (type.equals("PC")) {
                if (price > 1000 && price < 10000) {
                    System.out.println("Correct price for PC");
                } else {
                    throw new PriceException("Incorrect PC price. Must be between 1000 and 10000.");
                }
            }
        } catch (InputMismatchException e) {
            scan.next(); // Clear invalid input
            throw new InputMismatchException("Invalid input. Please enter a number.");
        }

        return price;
    }
}


