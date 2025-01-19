package learning.algorithms.university.sorting.dataStructures.QueueStack;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(11);
        System.out.println(queue);
        queue.offer(2);
        System.out.println(queue);
        queue.offer(333);
        System.out.println(queue);
        queue.offer(4);
        System.out.println(queue);
        queue.offer(5);
        System.out.println(queue);
        queue.offer(66);
        System.out.println(queue);

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println(queue);
            System.out.println(queue.poll());
        }
    }
}

/*
        [11]
        [11, 2]
        [11, 2, 333]
        [11, 2, 333, 4]
        [11, 2, 333, 4, 5]
        [11, 2, 333, 4, 5, 66]
        [11, 2, 333, 4, 5, 66]
        11
        [2, 333, 4, 5, 66]
        2
        [333, 4, 5, 66]
        333
        [4, 5, 66]
        4
        [5, 66]
        5
        [66]
        66

 */