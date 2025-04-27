package Java.C_Collections;
import java.util.*;

import java.util.Arrays;

public class Solution {

    public int longestConsecutive(int[] nums) {
        // Debugging: Print the input array
        System.out.println("Input array: " + Arrays.toString(nums));

        // Edge case: if the array is empty, return 0
        if (nums.length == 0) {
            System.out.println("Array is empty, returning 0.");
            return 0;
        }

        // Sort the array
        Arrays.sort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));

        int[] repeating = new int[nums.length];
        int startIdx = 0;

        // Track consecutive sequences
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i] - 1) {
                repeating[startIdx]++;
            } else if (nums[i] != nums[i - 1]) {  // Don't count duplicates
                startIdx++;
                repeating[startIdx]= 1;
            }
            // Debugging: print the current repeating array
            System.out.println("Repeating array at index " + i + ": " + Arrays.toString(repeating));
        }

        // Find the maximum consecutive sequence length
        int max = repeating[0];  // Assume the first element is the max
        for (int i = 1; i < repeating.length; i++) {
            if (repeating[i] > max) {
                max = repeating[i];  // Update max if a larger element is found
            }
        }

        // Debugging: print the final max
        System.out.println("Max consecutive length: " + max);

        return max + 1; // Add 1 to include the first element in the sequence
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums1));

        int[] nums2 = {0, 0, 1, 2, 3, 4};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums2));

        int[] nums3 = {1, 2, 0, 1};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums3));

        int[] nums4 = {1};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums4));

        int[] nums5 = {};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums5));
    }
}

