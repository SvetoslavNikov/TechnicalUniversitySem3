package Java.C_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.offer(1);
        deque1.offer(2);
        deque1.offer(3);
        System.out.println(deque1);
        //[1, 2, 3]

        deque1.offerFirst(4);
        deque1.offerFirst(5);
        deque1.offerFirst(6);
        System.out.println(deque1);

        //[6, 5, 4, 1, 2, 3]
        deque1.offerLast(7);
        deque1.offerLast(8);
        deque1.offerLast(9);
        System.out.println(deque1);
        //[6, 5, 4, 1, 2, 3, 7, 8, 9]

        deque1.pollFirst();
        deque1.pollLast();//null if empty



    }
}
