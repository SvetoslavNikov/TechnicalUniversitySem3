package javaLU.LinearDataStructures.Article.CollectionsTesting;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sety {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);  // Unpredictable order hashcode(), [1, 3, 2]
        System.out.println(hashSet);


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);  // Sorted order: [1, 2, 3]
        System.out.println(treeSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);  // Insertion order: [3, 1, 2]
        System.out.println(linkedHashSet);
    }
}
