package javaLU.IteratorsAndComparators.Comparators;

import java.util.Comparator;

public class EmployeeFUllComparator implements Comparator<Employee> {
    
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.age == o2.age){
            if(o1.salary == o2.salary){
                return 0;
            } else if (o1.salary > o2.salary){
                return 1;
            } else {
                return -1;
            }
         } else if (o1.age < o2.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
