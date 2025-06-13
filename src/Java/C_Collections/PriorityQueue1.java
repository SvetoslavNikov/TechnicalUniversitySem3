package Java.C_Collections;

import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {

        //By default, a PriorityQueue in Java is a Min-Heap,
        //meaning the smallest element is removed first.

        // Create a min-heap PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements (add or offer) SAME
        pq.offer(10);
        pq.add(5);

        // Poll (remove & return smallest)
        int smallest = pq.poll(); // null if empty

        // Max-heap example
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Heapify an unsorted array efficiently (O(n)):
        int[] arr = {4, 1, 7, 3, 8};
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        PriorityQueue<Integer> minheap = new PriorityQueue<>(list);
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        maxheap.addAll(list);
        //O(n)

        int i = 0;
        while(!minheap.isEmpty()){
            arr[i++] = minheap.poll();
        }
        //polling all elements - O(nlogn)

        i = 0;
        while(!maxheap.isEmpty()){
            arr[i++] = maxheap.poll();
        }

    }

}
