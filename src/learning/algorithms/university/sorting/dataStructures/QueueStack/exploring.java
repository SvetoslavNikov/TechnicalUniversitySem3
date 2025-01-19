package learning.algorithms.university.sorting.dataStructures.QueueStack;

import java.util.*;

public class exploring {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        System.out.println(queue);
        queue.offer(2);
        System.out.println(queue);
        queue.offer(3);
        System.out.println(queue);
        queue.offer(4);
        System.out.println(queue);


//        int size = queue.size();
//        for (int i = 0; i < size+1; i++) {
//            System.out.println(queue.poll());
//            System.out.println(queue);
//
//        }



        System.out.println(queue); // Prints: [1, 2, 3, 4]

        // Poll (remove) elements from the queue
        System.out.println(queue.poll()); // Prints: 1 (First element removed)
        System.out.println(queue);        // Prints: [2, 3, 4]

        System.out.println(queue.poll()); // Prints: 2
        System.out.println(queue);        // Prints: [3, 4]

        System.out.println(queue.poll()); // Prints: 3
        System.out.println(queue);        // Prints: [4]

        System.out.println(queue.poll()); // Prints: 4
        System.out.println(queue);        // Prints: []

        System.out.println(queue.poll()); // Prints: null (Queue is empty)
        System.out.println(queue);        // Prints: []


    }
}

