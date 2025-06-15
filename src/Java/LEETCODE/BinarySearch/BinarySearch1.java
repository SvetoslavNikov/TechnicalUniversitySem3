package Java.LEETCODE.BinarySearch;

public class BinarySearch1 {
    public static void main(String[] args){
        int[] nums = new int[1_000_000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        int index = binarySearch(nums, 123456);
        System.out.println("Found at index: " + index);
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length - 1;

        int steps = 0;
        while(left <= right){
            int mid = left + (right - left) / 2;
            System.out.println("Step " + (++steps) + ": left=" + left + ", right=" + right + ", mid=" + mid);


            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid]<target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}
