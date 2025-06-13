package Java.A_Syntax.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTesting {
    public static void main(String[] args){
        //Options to create a stream
        List<Integer> nums = List.of(1,2,3,4,5);
        nums.stream();

        int[] nums2 = {1,2,3};
        Arrays.stream(nums2);

        Stream<String> stream = Stream.of("Java", "Python", "Go");

        //Conversions
        String[] cities = {"Paris", "Berlin", "Madrid", "Rome"};
        cities = Arrays.stream(cities)
                .map(s->s.toUpperCase())
                .toArray(size -> new String[size]);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenNums = Arrays.stream(numbers).filter(i -> i%2 == 0).toArray();
        System.out.println(Arrays.toString(evenNums));


        evenNums = Arrays.stream(evenNums).map(i -> i*2).toArray();
        System.out.println(Arrays.toString(evenNums));

        String[] cities2 = {"Paris", "London", "Paris", "Berlin", "Amsterdam", "Berlin"};

        List<String> cities3 = Arrays.stream(cities2).sorted()
                .distinct()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(cities3);

        long citiesCount = Arrays.stream(cities2)
                .distinct()
                .filter(s -> s.contains("a"))
                .count();

        System.out.println(citiesCount);


    }
}
