package Java.LEETCODE.prefix;

class NumArray {
    private int[] prefix;

    public NumArray(int[] nums) {
        for(int i = 1; i < nums.length;i++){
            nums[i] = nums[i-1] + nums[i];
        }

        prefix = nums;
    }

    public int sumRange(int left, int right) {
        return left > 0 ? prefix[right] - prefix[left-1] : prefix[right];
    }
}
