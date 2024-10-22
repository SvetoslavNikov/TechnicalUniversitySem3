package javaLU.Hashfunctions.PersonClass;

public class Person {
    private String name;
    private int age;

    // Default constructor (no parameters)
    public Person() {
        this.name = "Unknown"; // Set default values
        this.age = 0;
    }

    // Constructor with parameters to initialize all variables
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age; // Example hashCode implementation
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
