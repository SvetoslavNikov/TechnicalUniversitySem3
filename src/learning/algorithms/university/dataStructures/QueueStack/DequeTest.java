package learning.algorithms.university.dataStructures.QueueStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);
        stack.push(3);
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        stack.push(5);
        System.out.println(stack);
        int size = stack.size();
        for (int i = 0; i < size+1; i++) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
