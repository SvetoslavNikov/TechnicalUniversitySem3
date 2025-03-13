package Java.G_Lambdas_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestClass7 {
    public static void main(String[] args) {
        System.out.println("TestClass7 in G_Lambdas_Streams folder");
//Function<T, R> (transforms T → R)
//Predicate<T> (returns boolean)
//Consumer<T> (performs an action)
//Supplier<T> (provides values)

        Predicate<Integer> isBiggerThen5 = a -> a > 5;
        System.out.println(Arrays.asList(1,2,5,6,7).stream()
                .filter(isBiggerThen5)
                .collect(Collectors.toList()));//6,7

        Consumer<String> print = a -> System.out.println(a);
        print.accept("GOsho");

        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);
        System.out.println("Random: " + randomNumberSupplier.get());

        Function<Integer, Integer> square = a -> a * a;
        Function<Integer,Integer> minus = a -> a-1;
        Function<Integer,Integer> squareMinus = square.andThen(minus);
        System.out.println(squareMinus.apply(5));//24

        List<Integer> ls = Arrays.asList(1,2,3,4,5,6);

        System.out.println(ls.stream()
                .map(squareMinus)//[0, 3, 8, 15, 24, 35]
                .collect(Collectors.toList()));

        List<Integer> filtered = ls.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> mapped = ls.stream()
                .map(a -> a*2)
                .collect(Collectors.toList());

        int reduced = ls.stream()
                .reduce(0, (a,b)-> a+b);

        System.out.println(filtered);
        System.out.println(mapped);
        System.out.println(reduced);



        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordCount);
        // Output: {orange=1, banana=2, apple=3}


        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Map<Integer, Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println(frequency);
        // Output: {1=1, 2=2, 3=3, 4=4}
    }
}
