package learning.algorithms.university.sorting.dataStructures.QueueStack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListStack {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();

        queue.push(11);
        System.out.println(queue);
        queue.push(2);
        System.out.println(queue);
        queue.push(333);
        System.out.println(queue);
        queue.push(4);
        System.out.println(queue);
        queue.push(5);
        System.out.println(queue);
        queue.push(66);
        System.out.println(queue);

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(queue);
            System.out.println(queue.poll());
        }
    }
}
