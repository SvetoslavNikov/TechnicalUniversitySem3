package Java.G_Lambdas_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList(
                "apple", "banana", "avocado", "blueberry", "cherry", "apricot", "carrot"
        );

        Map<String, Long> fruitCount = fruits.stream()
                .collect(Collectors.groupingBy(
                        a -> String.valueOf(a.charAt(0)), Collectors.counting()));

        System.out.println(fruitCount);


        List<Employee> employees = Arrays.asList(
                new Employee("John", "HR"),
                new Employee("Alice", "IT"),
                new Employee("Bob", "HR"),
                new Employee("Eve", "IT"),
                new Employee("Charlie", "Sales"),
                new Employee("David", "IT")
        );
        Map<String, Long> groupsSize = employees.stream()
                .collect(Collectors.groupingBy(
                        a -> a.department, Collectors.counting()));
        System.out.println(groupsSize);

        Map<String, List<Employee>> departmentMap = employees.stream()
                .collect(Collectors.groupingBy(
                        a-> a.department
                ));

        for (String department : departmentMap.keySet()){
            System.out.print(department + " - ");
            for (Employee e: departmentMap.get(department)){
                System.out.print(e.name + " ");
            }
            System.out.println();
        }
        System.out.println(departmentMap);




















    }
}
