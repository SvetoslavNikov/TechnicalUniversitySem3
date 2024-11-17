package javaLU.IteratorsAndComparators.Comparators;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Employee implements Comparable<Employee>{
    String name;
    int age;
    String department;
    public double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o1) {
        return this.age - o1.age;
    }

    @Override
    public String toString() {
        return name + " (" + department + ", Age: " + age + ", Salary: $" + salary + ")";
    }

    //testing set workflow
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public static void main(String[] args) {
        Employee a1 = new Employee("Svetoslav", 35,"Kaufland", 6000);
        Employee a2 = new Employee("Bvetoslav", 35,"AKaufland", 5000);
        Employee a3 = new Employee("Aetoslav", 45,"BKaufland", 8000);
        Employee a4 = new Employee("Aetoslav", 45,"BKaufland", 8000);

        Set<Employee> set2 = new TreeSet<>();
        set2.add(a1);
        set2.add(a2);
        set2.add(a3);
        set2.add(a4);

        Set<Employee> set1 = new HashSet<>();
        set1.add(a1);
        set1.add(a2);
        set1.add(a3);
        set1.add(a4);

        Set<Employee> set3 = new LinkedHashSet<>();
        set3.add(a1);
        set3.add(a2);
        set3.add(a3);
        set3.add(a4);
        
        System.out.println(a1.compareTo(a2));
        EmployeeFUllComparator comparator = new EmployeeFUllComparator();
        System.out.println(comparator.compare(a1,a2));
    }
}

