package learning.algorithms.university.sorting.dataStructures.QueueStack;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExploringPriorityQueue {

    public static void main(String[] args) {
        // Using a PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue); // Prints the internal order of elements in the PriorityQueue

        // Poll (remove) elements from the queue
        System.out.println(queue.poll()); // Removes the smallest element (1)
        System.out.println(queue);        // Prints: [2, 4, 3] (remaining elements in priority order)

        System.out.println(queue.poll()); // Removes the next smallest element (2)
        System.out.println(queue);        // Prints: [3, 4]

        System.out.println(queue.poll()); // Removes the next smallest element (3)
        System.out.println(queue);        // Prints: [4]

        System.out.println(queue.poll()); // Removes the next smallest element (4)
        System.out.println(queue);        // Prints: []

        System.out.println(queue.poll()); // Prints: null (Queue is empty)
        System.out.println(queue);        // Prints: []
    }
}
