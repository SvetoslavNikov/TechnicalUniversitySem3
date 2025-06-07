package Java.LEETCODE.monolithicStack;

import java.util.*;

public class DailyTemperatures {
/*
Given an array temps[] that represents the daily temps,
return an array answer[] such that answer[i] is the number of days you
have to wait after the i-th day to get a warmer temperature.
If there is no future day for which this is possible, put 0 instead.

int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
int[] output = {1, 1, 4, 2, 1, 1, 0, 0};

 */
        public static int[] dailyTemperatures(int[] temps) {
            int[] result = new int[temps.length];
            Arrays.fill(result, 0);
            
            Stack<Integer> stack = new Stack<>();
            
            for(int i = 0; i<temps.length;i++){

                while(!stack.isEmpty() && temps[i]> temps[stack.peek()]){
                    result[stack.peek()] = i - stack.peek();
                    stack.pop();
                }

                stack.push(i);
            }

            return result;
        }

}
























