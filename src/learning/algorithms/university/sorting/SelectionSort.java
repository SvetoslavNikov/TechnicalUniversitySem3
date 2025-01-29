package learning.algorithms.university.sorting;






        public class SelectionSort {
        /**
         * Sorts an array using the selection sort algorithm.
         * Time Complexity: O(n^2)
         * Space Complexity: O(1)
         *
         * @param arr The array to be sorted
         */
        public static void selectionSort(int[] arr) {
        // Get the length of the array
        int n = arr.length;

        // Iterate through the array from 0 to n-1
        for (int i = 0; i < n - 1; i++) {
        // Assume the current index contains the minimum value
        int minIndex = i;

        // Find the minimum element in the unsorted portion of the array
        for (int j = i + 1; j < n; j++) {
        // If we find a smaller element, update minIndex
        if (arr[j] < arr[minIndex]) {
        minIndex = j;
        }
        }

        // Swap the found minimum element with the first element of the unsorted portion
        if (minIndex != i) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        }
        }
        }

        /**
         * Utility method to print an array
         *
         * @param arr The array to be printed
         */
        public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        }

        /**
         * Main method to demonstrate the selection sort algorithm
         */
        public static void main(String[] args) {
        // Example usage
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
        }
        }
