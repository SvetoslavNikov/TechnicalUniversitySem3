package Java.LEETCODE.SortingAlgorithms;

import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {15, 3, 8, 6, 9, 12, 1, 7, 14, 2, 11, 5, 10, 4, 13, 0};

        mergeSort(arr);
        System.out.println(java.util.Arrays.toString(arr)); // [1, 2, 3, 5, 8]
    }
    public static void mergeSort(int[] arr){
        if(arr.length < 2 )return;

        int mid = arr.length /2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);

        System.out.println("Dividing: " + Arrays.toString(arr));
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
        System.out.println("Merged:   " + Arrays.toString(arr));

    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int a = 0;
        int l = 0;
        int r = 0;

//        System.out.println("Merging: " + Arrays.toString(left) + " + " + Arrays.toString(right));
        while(l<left.length && r<right.length){
            if(left[l]<= right[r]){
                arr[a] = left[l];
                a++;
                l++;
            } else {
                arr[a] = right[r];
                r++;
                a++;
            }
        }

        while(l<left.length){
            arr[a] = left[l];
            a++;
            l++;
        }

        while(r<right.length){
            arr[a] = right[r];
            a++;
            r++;
        }


    }

}
