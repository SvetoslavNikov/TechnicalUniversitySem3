package Java.LEETCODE.prefix;

import java.util.Arrays;

//0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
//index 4 is the sum of all 4 nums before it
//0, 1, 3, 6, 10, 15, 21, 28, 36, 45,
public class Concept {
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i = 0; i<arr.length ; i ++){
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<arr.length ; i ++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();


        for(int i = 1; i<arr.length ; i ++){
            arr[i] = arr[i-1]+i;
        }


        for(int i = 0; i<arr.length ; i ++){
            System.out.print(arr[i]+", ");
        }

        System.out.println();
    }
}
