package javaLU.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Quicksort {
    public static List<Integer> sortList(List<Integer> ls) {
        System.out.println("Current ls state:" + ls);

        while (ls.size() > 1) {
            int pivot = ls.get(ls.size() - 1);
            for (int j = 0, i = -1; j < ls.size(); j++) {
                if (ls.get(j) > pivot) {
                    continue;
                } else {
                    if (i != j) {
                        i++;
                        int temp = ls.get(i);
                        ls.set(i, ls.get(j));
                        ls.set(j, temp);
                    }
                }
            }

            int pivotidx = ls.indexOf(pivot);
            List<Integer> ls1 = new ArrayList<>();
            for (int i = 0; i < pivotidx; i++) {
                ls1.add(ls.get(i));
            }
            Quicksort.sortList(ls1);

            List<Integer> ls2 = new ArrayList<>();
            for (int i = ls.size() - 1; i > pivotidx; i--) {
                ls2.add(ls.get(i));
            }
            Quicksort.sortList(ls2);

            for (int i = 0; i < ls1.size(); i++) {
                ls.set(i, ls1.get(i));
            }
            for (int i = ls2.size() - 1, j = ls.size() - 1; i > 0; i--, j--) {
                ls.set(j, ls2.get(i));
            }

        }

        // divide the array in two parts
        // one with the elements on the one side of the pivot,
        // other with the elements on the other side of the pivot
        // quicksort them and repeat the same process till the array is with length 1
        // after that collect everything


        System.out.println("Current ls state:" + ls);
        return ls;
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            ls.add(rand.nextInt(1, 10));
        }
        Quicksort.sortList(ls);

    }
}

