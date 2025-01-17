package learning.algorithms.neetCode.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {

        int[] nums= {-18,12,3,0};
        int target= -6;
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int answer[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsValue(target - nums[i])) {
                answer[1] = i;
                answer[0] = target-nums[i];
                break;
            } else {
                numsMap.put(i, nums[i]);
            }
        }

        for (int idx: numsMap.keySet()){
            if(numsMap.get(idx) == answer[0]){
                answer[0] = idx;
                break;
            }
        }

        return answer;
    }
}
