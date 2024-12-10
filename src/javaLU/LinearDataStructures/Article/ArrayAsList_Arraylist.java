package javaLU.LinearDataStructures.Article;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList_Arraylist {
    public static void main(String[] args) {
        //List<String> ls = new ArrayList<>("Ivan", "Gosho","Marin"); NO
        List<String> immutableList = Arrays.asList("Ivan", "Gosho","Marin");

        //immutableList.add("Maritime"); //.UnsupportedOperationException
        //immutableList.remove(0); //.UnsupportedOperationException
        immutableList.set(0,"No element");

        List<String> mutableList = new ArrayList<>(Arrays.asList("Ivan", "Gosho","Marin"));
        mutableList.add("Homicide");

        System.out.println(mutableList);

    }
}
