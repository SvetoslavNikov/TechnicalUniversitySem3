package javaLU.IteratorsAndComparators.Iterators;

class Employee {
    String name;
    int age;
    String department;
    double salary;

    Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ", Age: " + age + ", Salary: $" + salary + ")";
    }
}
