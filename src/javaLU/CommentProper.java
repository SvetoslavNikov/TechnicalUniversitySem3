package javaLU;

/**
 * File: User.java
 * Author: John Doe
 * Date: December 3, 2024,
 * Purpose: Defines the User class and its operations.
 * Version: 1.0
 */


public class CommentProper {
    /**
     * Calculates the user's age based on their birth year.
     *
     * @param birthYear the year the user was born
     * @return the user's age
     */
    public int calculateAge(int birthYear) {
        return 2024 - birthYear;
    }

    // TODO: Add error handling for null input
    public void processInput(String input) {
        System.out.println(input.toUpperCase());
    }


    public static void main(String[] args) {


        // ----------- Initialization -----------
        int sum = 0;

        // ----------- Processing -----------
        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        // ----------- Output -----------
        System.out.println("Sum: " + sum);


        /* This block initializes the array
   and assigns default values to each element. */
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }


    }
}