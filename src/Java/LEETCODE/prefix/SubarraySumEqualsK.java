package Java.LEETCODE.prefix;

import java.util.*;

public class SubarraySumEqualsK {
    public static void main(String[] args){
        System.out.println(subarraySum2(new int[]{1,1,1},2));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        //take the first element check if there is subarray that equals k, then move to
        for(int i = 1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
//1,2,3
// nums[i] - nums[j] j=0->i-1
//is a single number an array i think not?
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == k){
                count++;
            }
            for(int j = 0; j < i; j++){
                if(nums[i]-nums[j] == k){
                    count++;
                }
            }
        }

        return count;
    }

    public static int subarraySum2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        int sum = 0;
        map.put(0, 1);


        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                count ++;
            }
            map.put(sum, map.getOrDefault(sum, 0));
        }




        return count;
    }


}






