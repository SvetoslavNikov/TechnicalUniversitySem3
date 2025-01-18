package learning.algorithms.neetCode.topKFrequentElement;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {

    }

    //Input: nums = [1,2,2,3,3,3], k = 2
    //map[
    // 3 -> 3,
    // 1 -> 1,
    // 2 -> 2
    // ]
    //Output: [2,3]
    public int[] topKFrequent(int[] nums, int k) {
        if(k == 0){
            return new int[1];
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            map.putIfAbsent(key, 0);
            map.replace(key, map.get(key)+1);
        }

        // 3 -> 3,
        // 1 -> 1,
        // 2 -> 2

        int[] arr = new int[k];

        for(int num:map.keySet()){
            int repeated = map.get(num);

        }


        return null;
    }
}
