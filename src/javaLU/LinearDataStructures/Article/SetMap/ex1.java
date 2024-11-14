package javaLU.LinearDataStructures.Article.SetMap;

import java.util.*;

public class ex1 {
    //softuni exercise from Set Maps Advanced
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<Character, Integer> ch = new TreeMap<>();
        char[] arr = scan.nextLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if(ch.containsKey(arr[i])){
                int count = ch.get(arr[i]);
                ch.replace(arr[i],count,count+1);
            } else {
                ch.put(arr[i],1);
            }
        }
        for (Character charr : ch.keySet()){
            System.out.println(charr + ": " + ch.get(charr));
        }

    }
}
