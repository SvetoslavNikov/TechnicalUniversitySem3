package LeetCode;

public class Palindrom {
    /*
    Given an integer x, return true if x is a palindrome and false otherwise.
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

     */
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int current = x;
        String xs = String.valueOf(x);
        int i = (int) Math.pow(10,xs.length());


        while(true){
            reverse = (current/i)*i;
            current = current - i;
            if(i==1){
                break;
            }
            i = i/10;
        }

        return reverse == x;

    }
}
