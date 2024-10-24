package javaLU.LinearDataStructures.Article.LinkedList;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Methods {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("A");
        ls.add("B");
        ls.push("Pushing");//adds at the beginning Stack
        ls.offer("Offering");//adds at last Queue
        System.out.println(ls);

        ls.pop(); //removes the first Stack
        ls.poll();//removes the first Queue
        System.out.println(ls);

        /*
poll():
Behavior: Retrieves and removes the head of the list (first element).
          Returns null if the list is empty.
Use Case: When using LinkedList as a queue.

pop():
Behavior: Removes and returns the first element of the list.
          Throws NoSuchElementException if the list is empty.
Use Case: When using LinkedList as a stack.*/




    }
}





