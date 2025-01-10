package learning.algorithms.neetCode.ContainsDuplicate;

import java.util.Arrays;

public class Solution2 {
    //Time complexity: O(n log n)
    //Space complexity: O(1) or O(n) depending on the sorting algo
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);//O(n log n)
        for(int i = 1; i < nums.length; i++) {//O(n)
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;

    }
}
