package Java.LEETCODE;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {

        int a  = 5;
        int b = 5/2;
        System.out.println(b);
        String s = "are be";
        if(s.charAt(2) == s.charAt(5)){
            System.out.println("are be eto fgo");
        }

        System.out.println(isValid("{}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            }
            else if(s.charAt(i) == '{'){
                stack.push('}');
            }
            else if(s.charAt(i) == '['){
                stack.push(']');
            } else if(stack.empty()){
                return false;
            } else {
                if(s.charAt(i) != stack.peek()){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }

    public static int BinarySearch(int[] nums, int target) {

        int l = 0;
        int r = nums.length/2;

        while(l < r){
            if(target > nums[r]){
                l = r;
                r = r*2;
            }
            if(target < nums[r]){
                r = r/2;
            }

            if(target == nums[r]){
                return r;
            }
        }

        return -1;
    }



}
