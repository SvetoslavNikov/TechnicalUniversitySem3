package LeetCode;

public class Palindrom {
    /*
    Given an integer x, return true if x is a palindrome and false otherwise.
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

     */

    //method1 for negative number can be palindrome
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int current = x;
        int num;
        while(true){
            num = current%10;
            reverse += num;
            reverse *= 10;
            current /= 10;
            if(current < 10 && current >-10) {
             reverse += current;
             break;
            }
        }
        return reverse == x;

    }

//method2 for negative number can't be palindrome
    public boolean isPalindrome1(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
