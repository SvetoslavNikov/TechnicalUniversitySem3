package javaLU.LinearDataStructures.Article.CollectionsTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collections {
    public static <Set> void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ArrayList<Integer> arrls = new ArrayList<>();
        arrls.add(1);
        arrls.add(2);
        /*
        * ArrayList is a dynamic arr
        * LinkedList implements double linked list meaning every node contains
            reference to the previous and the next node
        *
        * */
        int[] arr = {2,3};
        List<String> strls = Arrays.stream(arr)
                .mapToObj(e -> Integer.toString(e)).collect(Collectors.toList());
        for (int a : arr){
            System.out.println(a);
        }

        Arrays.setAll(arr, i -> arr[i]*2);
        //i - is the index
        //if we write i -> i*2 it will store index*2 value at the index
        for (int a : arr){
            System.out.println(a);
        }


        //2
        List<String> words = Arrays.asList("a", "bb", "ccc", "dddd");
        List<String> filtered =  words.stream().filter(n -> n.length()<=3).collect(Collectors.toList());
        //3
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n*n)
                .collect((Collectors.toList()));

        //List<String> names = Arrays.asList("John", "D.", "RockNRoll");
        //List<String> correctedName = names.stream().map(e -> e + "Y").collect(Collectors.toList());
        //List<String> correctedName = names.stream().filter(e -> e.contains("n")).collect(Collectors.toList());
        //List<String> correctedName = names.stream().collect(Collectors.toList());

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> reverseOrder = names.stream().collect(Collectors.toList());
        /* Stream processing here */
// Output should be: ["Charlie", "Bob", "Alice"]

        for (String s: reverseOrder){
            System.out.println(s);
        }





    }
}
