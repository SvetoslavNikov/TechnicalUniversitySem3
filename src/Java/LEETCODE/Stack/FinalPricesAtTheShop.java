package Java.LEETCODE.Stack;

import java.util.Stack;

public class FinalPricesAtTheShop {
    //1475

    public int[] finalPrices(int[] prices) {
        //i = ith item and its price


        // so the i-th element receives a sdiscount of the next smaller element

        //j > i
        //prices[j] <= prices[i]

        int[] result = prices.clone();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<prices.length;i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                result[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }
        return result;
    }
}
