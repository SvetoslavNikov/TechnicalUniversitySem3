package Java.C_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(4);
        ;
        System.out.println(queue);
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.poll());
            System.out.println(queue);
            System.out.println("Next to go: " +  queue.peek());
        }

        Queue<Integer> queue1 = new LinkedList<>();

        queue1.offer(1);
        queue1.offer(2);

        queue1.poll();

    }
}
