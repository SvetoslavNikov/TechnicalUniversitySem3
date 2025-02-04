package learning.algorithms.university.sorting;

import java.util.Arrays;

public class RadixSort {
    // A utility function to get the maximum value in an array
    private static int getMax(int[] arr) {
        int a = 23;
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Performs counting sort on arr[] based on the digit represented by exp
    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // Output array
        int[] count = new int[10]; // Count array for digits (0-9)

        // Count occurrences of each digit
        for (int num : arr) {
            count[(num / exp) % 10]++;
        }

        // Update count[i] to store the actual position of the digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy the output array back to arr[]
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main function to sort an array using Radix Sort
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Perform counting sort for each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Driver method to test Radix Sort
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

