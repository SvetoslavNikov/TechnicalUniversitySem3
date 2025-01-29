package learning.algorithms.university.dataStructures.QueueStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class exploringDeque {

        public static void main(String[] args) {
            Deque<Integer> stack = new ArrayDeque<>();
            stack.offer(1);
            System.out.println(stack);
            stack.offer(2);
            System.out.println(stack);
            stack.offer(3);
            System.out.println(stack);
            stack.offer(4);
            System.out.println(stack);
            stack.offer(5);
            int size = stack.size();
            for (int i = 0; i < size+1; i++) {
                System.out.println(stack.poll());
                System.out.println(stack);
            }


    }
//offer() / offerFirst() / offerLast(): Return boolean – true if the element was added successfully,
// false if it couldn't be added (e.g., if the queue or deque is full).

//poll() / pollFirst() / pollLast(): Return the element (E) removed from the front or back of the queue/deque,
// or null if the structure is empty.

//peek() / peekFirst() / peekLast(): Return the element (E) at the front or back of the queue/deque
// without removing it, or null if the structure is empty.
}
