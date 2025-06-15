package Java.LEETCODE.SlidingWindow;

import java.util.HashSet;
import java.util.*;

public class Concept {
    public Concept() {
    }

    public static void main(String[] args){
        System.out.println(LongestNonRepeatableString("aebcdef"));

    }

    // When the size of the window is fixed,

    void concept(){
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2}; // example input array
        int k = 3; // window size

        int windowSum = 0;
        int maxResult;

        // Set up the initial window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxResult = windowSum; // initialize result

        // Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // add new element, remove old element
            maxResult = Math.max(maxResult, windowSum); // update result if needed
        }

        System.out.println("Maximum sum of subarray of size k: " + maxResult);
    }



    // like finding the max sum of subarrays of size k.
    // Max sum of subarray of size k
    int maxSum(int[] arr, int k) {
        int windowSum = 0, maxSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide window
        for (int i = k+1; i < arr.length; i++) {
            windowSum = windowSum - arr[i-k] + arr[i];
            maxSum = maxSum > windowSum ? maxSum : windowSum;
        }

        return maxSum;
    }


    /*
    2. Dynamic window
    When the size of the window changes depending
    on the condition (like "longest substring with no repeating
    characters").

     */
    public static int slidingWindow(int[] arr) {
        int left = 0;
        // Initialize window state variables (sum, count, frequency map, etc.)
        // For example:
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Initialize result variable (min or max depending on problem)
        int result = 0; // or Integer.MAX_VALUE/MIN_VALUE depending on needs

        for (int right = 0; right < arr.length; right++) {
            // Expand the window by including arr[right]
            sum += arr[right];
            count++;
            frequencyMap.put(arr[right], frequencyMap.getOrDefault(arr[right], 0) + 1);

             //While window violates the condition
            while (true) {/* condition is violated */
                // Update result if needed
                result = Math.min(result, 2+3 /* some calculation */); // or Math.max()

                // Shrink the window by excluding arr[left]
                sum -= arr[left];
                count--;
                frequencyMap.put(arr[left], frequencyMap.get(arr[left]) - 1);
                if (frequencyMap.get(arr[left]) == 0) {
                    frequencyMap.remove(arr[left]);
                }

                // Move left pointer forward
                left++;
            }
        }

        return result;
    }

    //Example
    static int LongestNonRepeatableString(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}





















