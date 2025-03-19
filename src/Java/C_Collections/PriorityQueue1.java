package Java.C_Collections;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {

        //By default, a PriorityQueue in Java is a Min-Heap,
        //meaning the smallest element is removed first.

        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a,b) -> a - b);
        pq1.add(30);
        pq1.offer(20);
        pq1.add(40);
        pq1.offer(10);

        //without comparator
        //[30]
        //[20, 30]
        //[20, 30, 40]
        //[10, 20, 40, 30]

        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());


        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        pq.add(30);
        pq.offer(20);
        pq.add(40);
        pq.offer(10);

        //without comparator
        //[30]
        //[20, 30]
        //[20, 30, 40]
        //[10, 20, 40, 30]

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
