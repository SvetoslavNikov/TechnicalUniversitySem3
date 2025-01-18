package learning.algorithms.neetCode.topKFrequentElement;

import java.sql.Array;
import java.util.*;

public class Solution1 {
    //not accepted
    public static void main(String[] args) {
        int[] nums = {1,7};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (k == 0) {
            return new int[1];
        }


        //Input: nums = [1,2,2,3,3,3], k = 2
        //Output: [2,3]

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            map.putIfAbsent(key, 0);
            map.replace(key, map.get(key) + 1);
        }//O(n)

        // 3 -> 3,
        // 1 -> 1,
        // 2 -> 2

        int[] repetitions = new int[nums.length+1];//2

        for (int num : map.keySet()) {
            int repeated = map.get(num);
            repetitions[repeated] = num;
        }//O(n)

        int[] resultarr = new int[k];
        int j = resultarr.length - 1;

        for (int i = repetitions.length - 1; i > 0; i--) {
            if (j < 0) {
                break;
            } else if (repetitions[i] != 0) {
                resultarr[j] = repetitions[i];
                j--;
            }
        }//O(n)


        return resultarr;
    }
}
