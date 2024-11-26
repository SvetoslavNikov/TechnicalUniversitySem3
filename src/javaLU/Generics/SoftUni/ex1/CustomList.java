package javaLU.Generics.SoftUni.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable> {
    private List<T> ls = new ArrayList<T>();

    public CustomList() {
    }

    public void add(T element) {
        ls.add(element);
    }

    public T remove(int index) {
        return ls.remove(index);
    }

    public boolean contains(T element) {
        return ls.contains(element);
    }

    public void swap(int idx1, int idx2) {
        System.out.println("before: " + ls);
        T element1 = ls.get(idx1);
        T element2 = ls.get(idx2);
        ls.remove(idx1);
        ls.add(idx1, element2);
        ls.remove(idx2);
        ls.add(idx2, element1);
        System.out.println("After:" + ls);
    }

    //public List<T> sort(){
        //List<Integer>
        //return ;
   // }

    public static void main(String[] args) {
        CustomList<Integer> ls = new CustomList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.swap(2, 4);
        ls.swap(4, 3);
        ls.swap(0, 4);
        ls.swap(2, 3);
    }
}
