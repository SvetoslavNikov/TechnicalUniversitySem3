package Java.C_Collections;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
            System.out.println("Current stack: " + stack + "Next to go: " + stack.peek());
        }

        //[1, 2, 3, 4, 5]
        //5
        //Current stack: [1, 2, 3, 4]Next to go: 4
        //4
        //Current stack: [1, 2, 3]Next to go: 3
        //3
        //Current stack: [1, 2]Next to go: 2
    }
}
