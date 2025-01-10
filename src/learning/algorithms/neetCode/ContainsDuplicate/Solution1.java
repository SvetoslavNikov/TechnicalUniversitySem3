package learning.algorithms.neetCode.ContainsDuplicate;

public class Solution1 {
    //Time complexity: O(n^2)
    //Space complexity: O(1)
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
