package javaLectures.hashcodeTest;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding equals() to compare name and age for equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Check if they are the same reference
        if (obj == null || getClass() != obj.getClass()) return false;// Check if obj is null or of a different class
        Person person = (Person) obj;// Cast to Person
        return age == person.age && Objects.equals(name, person.name);  // Compare name and age
    }

    // Overriding hashCode() to generate a hash based on name and age
    @Override
    public int hashCode() {
        return Objects.hash(name, age);  // Generate hash code based on name and age
    }

    // Getters (optional, for accessing fields outside the class)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString() for easy display of Person objects
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
