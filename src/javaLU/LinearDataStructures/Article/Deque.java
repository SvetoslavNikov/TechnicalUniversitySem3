package javaLU.LinearDataStructures.Article;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        java.util.Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        System.out.println(deque.poll());
        System.out.println(deque.pop());
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        java.util.Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.push(1);
        deque1.push(2);
        deque1.push(3);
        deque1.push(4);
        System.out.println(deque1.poll());
        System.out.println(deque1.pop());
        System.out.println(deque1);
        System.out.println(deque1.peek());
        System.out.println(deque1.peekFirst());
        System.out.println(deque1.peekLast());
    }

}
