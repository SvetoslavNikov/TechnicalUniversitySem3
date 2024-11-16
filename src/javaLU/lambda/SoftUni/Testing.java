package javaLU.lambda.SoftUni;

import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        //ex1
        List<String> nums = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            nums.add(String.valueOf(i));
        }
        nums.add("51");
        System.out.println(nums);
        nums.removeIf(e -> e.contains("1"));
        System.out.println(nums);

        //ex2
        Factorial factorialN = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorialN.factorial(3));
    }
}
