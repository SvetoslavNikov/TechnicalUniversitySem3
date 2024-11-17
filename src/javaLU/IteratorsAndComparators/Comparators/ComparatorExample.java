package javaLU.IteratorsAndComparators.Comparators;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Charlie", 35, "Finance", 60000),
                new Employee("Alice", 55, "HR", 5000),
                new Employee("Bob", 30, "IT", 3000)

        ));

        Comparator<Employee> bySalary = (a,b) -> {
            if(a.salary>b.salary){
                return 1;
            } else if (a.salary == b.salary) {
                return 0;
            } else {
                return -1;
            }

        };

        Comparator<Employee> byAge = Comparator.comparingInt(a -> a.age);

        employees.sort(bySalary);
        System.out.println("BY SALARY: \n" + employees);

        employees.sort(byAge);
        System.out.println("BY AGE: \n" + employees);

        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("BY NAME: \n" + employees);

    }
}
