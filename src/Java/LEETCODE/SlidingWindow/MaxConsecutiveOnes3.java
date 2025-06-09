package Java.LEETCODE.SlidingWindow;

public class MaxConsecutiveOnes3 {
    /*
    Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    Output: 6
    Explanation: Flip 2 zeros at indices 5 and 4 → [1,1,1,0,0,1,1,1,1,1] → max length = 6
     */


    //sliding window

    //that slides and checks if there are more then k zeros in the window.

    //if there are it removes the most left element of the window until there are not

    //then it again expands the window to the right
    public static int solution(int[] arr, int k){
        int maxLength = 0;
        int left = 0;

        int count0 = 0;
        int arrLength = 0;
        for(int i = 0; i<arr.length;i++){
            arrLength ++;
            if(arr[i] == 0){
                count0 ++;
                while(count0 > k){
                    if(arr[left] == 0) {
                        count0--;
                    }
                    left ++;
                    arrLength --;
                }
            }




            maxLength = Math.max(maxLength, arrLength);
        }



        return maxLength;
    }

    public static void main(String[] args){
        System.out.println(solution(new int[]{0, 0, 1, 1, 1, 0, 0},2));

    }
}
