package Java.LEETCODE.monolithicStack;
import java.util.*;
public class test1 {

    public test1() {
    }

    /*
        You’re given an array heights[] representing the heights of people in a queue (from front to back).
         For each person, count how many people they can "see" to their right.
        A person can see another if everyone in between is shorter than both of them.\

        int[] heights =
        {10, 6, 8, 5, 11, 9};

        [3, 1, 2, 1, 1, 0]
         */
    public static int[] solution(int[] arr){
        /*
        create a stack for indexes of elements;
        where every element will be smaller than the last one;
        //so when the new element is bigger or equal to top of the stack
        //we subtract the indexes and that is the number of people the top of stack can see;

        create result arr same length + fill with 0;

        iterate through every element
        while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
            result[stack.peek()] = i - stack.pop();
        }

        stack.push()

         */
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();
        int count = 0;

        //n-1 cus the last element is always 1
        for (int i = 0; i < n-1; i++) {


            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                int idx = stack.pop();
                result[idx] = i - idx;  // distance from popped person to current person
            }




            stack.push(i);
        }

        while(!stack.isEmpty()){
            result[stack.peek()] = arr.length-1-stack.peek();
            stack.pop();
        }
        // For any remaining indexes in stack, no one taller or equal to right,
        // result stays 0 by default.

        return result;
    }

    public static void main(String[] args) {
        int[][] testCases = {
                {10, 6, 8, 5, 11, 9},
                {5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5}
        };

        for (int[] test : testCases) {
            System.out.println("Input: " + Arrays.toString(test));

            int[] yourResult = solution(test);
            System.out.println("Your version (distance): " + Arrays.toString(yourResult));


        }
    }
}
