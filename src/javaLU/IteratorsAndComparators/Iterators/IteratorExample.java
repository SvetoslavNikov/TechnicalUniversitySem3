package javaLU.IteratorsAndComparators.Iterators;


import javaLU.IteratorsAndComparators.Comparators.Employee;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Alice", 25, "HR", 5000),
                new Employee("Bob", 30, "IT", 70000),
                new Employee("Charlie", 35, "Finance", 60000)
        ));

        // Using an iterator to traverse and remove employees with salary < 60000
        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.salary < 60000) {
                iterator.remove(); // Safe removal
            }
        }

        System.out.println("Filtered Employees: " + employees);


    }
}
