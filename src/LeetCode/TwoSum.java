package LeetCode;

import java.util.*;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    */

    public static int[] method1(int[] arr, int target) {
        //O(n^2)
        int b = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    a = arr[i];
                    b = arr[j];
                }
            }

        }
        return new int[]{a, b};
    }

    public static int[] method2(int[] arr, int target) {
        //O(n)
        int b = 0;
        int a = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
            //3,2,4
            //3 - 0
            //2 -

        }
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i]) && map.get(target - arr[i]) != i){
                //containsKey calculates the Hashcode of the Key, so it directly goes the right bucket(linked-list) of K,V pairs and search for matching key.
                //in the worst case when there n collisions due to identical hashcode this algo also goes to O(n^2), but its highly unlikely.
                a = i;
                b = map.get(target-arr[i]);
                break;
            }
        }
        return new int[]{a, b};

    }


    public static void main(String[] args) {
        int[] arr = method2(new int[]{3,2,4}, 7);
        System.out.println(arr[0] + " " + arr[1]);

        HashMap<Integer,Integer> intmap = new HashMap<>();
        intmap.put(1,1);
        intmap.put(1,2);
        //System.out.println(intmap.get(1));
    }
}





