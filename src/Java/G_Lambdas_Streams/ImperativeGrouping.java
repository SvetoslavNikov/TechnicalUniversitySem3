package Java.G_Lambdas_Streams;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + ":" + age;
    }
}

public class ImperativeGrouping {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30)
        );

        Map<Integer, List<Person>> ageGroups = new HashMap<>();

        for (Person p : persons) {
            if (!ageGroups.containsKey(p.age)) {
                ageGroups.put(p.age, new ArrayList<Person>());
            }
            ageGroups.get(p.age).add(p);

        }


        // Functional grouping: using streams and Collectors.groupingBy
        Map<Integer, List<Person>> groupByAge = persons.stream()
                .collect(Collectors.groupingBy(p -> p.age));

        System.out.println("Functional: " + groupByAge);
    }

}





