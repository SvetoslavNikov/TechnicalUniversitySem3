package Java.LEETCODE;

import java.util.Random;

public class BinarySearchGuess {

    // Method to guess the number using binary search and return the number of steps (cycles)
    public static int guessNumberBinarySearch(int target) {
        int low = 1;
        int high = 100;
        int cycles = 0;

        while (low <= high) {
            cycles++;
            int guess = (low + high) / 2;

            if (guess == target) {
                break;
            } else if (guess < target) {
                low = guess + 1;
            } else {
                high = guess - 1;
            }
        }

        return cycles;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int totalCycles = 0;
        int simulations = 10000;

        for (int i = 0; i < simulations; i++) {
            int target = random.nextInt(100) + 1; // Random number between 1 and 100
            int cycles = guessNumberBinarySearch(target);
            totalCycles += cycles;
        }

        double averageCycles = (double) totalCycles / simulations;
        System.out.printf("Average number of cycles over %d simulations: %.2f%n", simulations, averageCycles);
    }
}

