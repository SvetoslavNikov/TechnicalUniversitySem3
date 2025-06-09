package Java.LEETCODE.SlidingWindow;

import java.util.HashSet;

public class MinimumWindowSubstring {

    /*
    Given two strings s and t, return the minimum window substring of s such that every character
    in t (including duplicates)
     is included in the window. If no such substring exists, return "".
    Input:
        s = "ADOBECODEBANC"
        t = "ABC"

    Output:
        "BANC"
     */

    static String solution(String s, String t){

        //window 0 to every char in the arr.
        //Result is stored in String result; int result length

        //when we find the first substring we start removing the most left elements until
        //the substring is invalid

        //then we continue to expand to right the window until its valid again
        //compare the new window length
        //remove the most left until is invalid and repeat

        //easy to implement

        return s;
    }
}
