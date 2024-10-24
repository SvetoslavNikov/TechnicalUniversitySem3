package javaLU.LinearDataStructures.Article.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Methods {
    public static void main(String[] args) {
        /* Queue/*
    -offer(T) – добавя елемент на края на опашката
    -peek() – връща елемент от началото на опашката без да го премахва
    -poll() – връща елемент от началото на опашката като го премахва
    -contains(T) -проверява дали даден елемент се съдържа в опашката
    -clear() – премахва всички елементи от опашката
    Нека разгледаме горния пример реализиран с опашка и сравним резултатите.
        */

        Queue<Integer> que = new LinkedList<>();

        que.add(4);//add to the end
        que.offer(5);//add to the end
        que.add(6);
        System.out.println(que);

        System.out.println(que.peek());//first element
        System.out.println(que.poll());//removes first element
        System.out.println(que.contains(23));
        que.clear();

        /*
    queue.offer("A")
    [A] [ ] [ ] [ ] [ ] <- Add "A" to the queue
    queue.offer("B")
    [A] [B] [ ] [ ] [ ] <- Add "B" to the queue

    queue.poll()
    [ ] [B] [ ] [ ] [ ] <- Remove "A" from the queue
    queue.poll()
    [ ] [ ] [] [ ] [ ] <- Remove "B" from the queue     */

        System.out.println("");

        PriorityQueue<Integer> nums = new PriorityQueue<>();
        nums.offer(1);
        nums.offer(2);
        nums.offer(3);
        nums.offer(4);
        System.out.println(nums);

    }
}
