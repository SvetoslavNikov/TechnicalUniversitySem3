package javaLU.LinearDataStructures.Article.CollectionsTesting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapy {
    public static void main(String[] args) {
        /*Map<Integer, String> map1 = new HashMap<>();
        //Hashmap makes a map of key value pairs. Every pair is stored at the index of the hashcode from the key.

        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3,"Three");
        map1.put(0,"Zero");
        System.out.println(map1);
        //{0=Zero, 1=One, 2=Two, 3=Three}*/
        //O(n)

        /*Map<String, String> map1 = new TreeMap<>();
        map1.put("Adam", "One");
        map1.put("Bob", "Two");
        map1.put("Daniel","Three");
        map1.put("CacaoMan","Zero");
        System.out.println(map1);*/
        //orders numbers 1 - 10, A-Z, for object it uses the comparable method or custom Comparator
        //O(log n)

        /*Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3,"Three");
        map1.put(0,"Zero");
        System.out.println(map1);*/
        //{1=One, 2=Two, 3=Three, 0=Zero}
        //it is just storing them in the input order
        //O(n)




    }
}
