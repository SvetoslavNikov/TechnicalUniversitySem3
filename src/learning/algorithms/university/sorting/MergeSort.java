package learning.algorithms.university.sorting;


import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // Base case: already sorted
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);  // Recursively sort left half
        mergeSort(right); // Recursively sort right half
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge elements in sorted order
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }

        // Copy remaining elements
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 5, 2, 7, 4, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
    }
}
