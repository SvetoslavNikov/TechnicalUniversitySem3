package learning.algorithms.university.sorting.sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements to the right to create the correct position for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Insert key at the correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7};
        insertionSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

