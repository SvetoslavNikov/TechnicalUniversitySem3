package Java.J_Design_Patterns.Strategy;

import java.util.Arrays;
import java.util.Random;

public class SortingStrategyExercise {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10000); // Adjust size for faster/slower test

        DataSorter bubbleSorter = new DataSorter(new BubbleSort());
        DataSorter quickSorter = new DataSorter(new QuickSort());
        DataSorter mergeSorter = new DataSorter(new MergeSort());

        measure("Bubble Sort", bubbleSorter, array);
        measure("Quick Sort", quickSorter, array);
        measure("Merge Sort", mergeSorter, array);
    }

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(10000);
        return arr;
    }

    private static void measure(String name, DataSorter sorter, int[] array) {
        long time = sorter.measurePerformance(array);
        System.out.println(name + " took " + time / 1_000_000.0 + " ms");
         System.out.println("Sorted: " + Arrays.toString(sorter.sort(array)));
    }
}

interface SortingStrategy {
    int[] sort(int[] arr);
}

class DataSorter {
    private SortingStrategy sortingStrategy;

    public DataSorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public int[] sort(int[] arr) {
        return sortingStrategy.sort(arr);
    }

    public long measurePerformance(int[] arr) {
        long start = System.nanoTime();
        sortingStrategy.sort(arr.clone());
        return System.nanoTime() - start;
    }
}

class BubbleSort implements SortingStrategy {
    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }
}

class MergeSort implements SortingStrategy {
    @Override
    public int[] sort(int[] arr) {
        int[] sorted = arr.clone();
        mergeSort(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++) leftArray[i] = arr[left + i];
        for (int j = 0; j < rightArray.length; j++) rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) arr[k++] = leftArray[i++];
            else arr[k++] = rightArray[j++];
        }

        while (i < leftArray.length) arr[k++] = leftArray[i++];
        while (j < rightArray.length) arr[k++] = rightArray[j++];
    }
}

class QuickSort implements SortingStrategy {
    @Override
    public int[] sort(int[] arr) {
        int[] sorted = arr.clone();
        quickSort(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }

        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}
