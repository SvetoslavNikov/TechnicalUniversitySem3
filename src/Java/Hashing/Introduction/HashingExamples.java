package Java.Hashing.Introduction;

import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingExamples {

    // 1. Basic HashMap usage
    public static void hashMapExample() {
        System.out.println("=== HashMap Example ===");
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 5);
        map.put("banana", 3);
        map.put("orange", 8);

        System.out.println("apple count: " + map.get("apple"));
        System.out.println("HashMap contents: " + map);

        // Show hash codes
        System.out.println("Hash code of 'apple': " + "apple".hashCode());
        System.out.println("Hash code of 'banana': " + "banana".hashCode());
    }

    // 2. Custom hash function implementation
    public static class SimpleHashTable {
        private static final int SIZE = 10;
        private String[] table;

        public SimpleHashTable() {
            table = new String[SIZE];
        }

        // Simple hash function using modulo
        private int hash(String key) {
            return Math.abs(key.hashCode()) % SIZE;
        }

        public void put(String key, String value) {
            int index = hash(key);
            // Simple linear probing for collision resolution
            while (table[index] != null && !table[index].startsWith(key + ":")) {
                index = (index + 1) % SIZE;
            }
            table[index] = key + ":" + value;
        }

        public String get(String key) {
            int index = hash(key);
            while (table[index] != null) {
                if (table[index].startsWith(key + ":")) {
                    return table[index].substring(key.length() + 1);
                }
                index = (index + 1) % SIZE;
            }
            return null;
        }

        public void display() {
            System.out.println("Hash Table Contents:");
            for (int i = 0; i < SIZE; i++) {
                System.out.println("Index " + i + ": " + table[i]);
            }
        }
    }

    // 3. Cryptographic hashing example
    public static void cryptographicHashExample() {
        System.out.println("\n=== Cryptographic Hashing ===");

        String[] inputs = {"hello", "Hello", "hello world", "password123"};

        for (String input : inputs) {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                byte[] hashBytes = md.digest(input.getBytes());

                // Convert to hexadecimal
                StringBuilder hexString = new StringBuilder();
                for (byte b : hashBytes) {
                    String hex = Integer.toHexString(0xff & b);
                    if (hex.length() == 1) {
                        hexString.append('0');
                    }
                    hexString.append(hex);
                }

                System.out.println("Input: '" + input + "'");
                System.out.println("SHA-256: " + hexString.toString());
                System.out.println();

            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }

    // 4. Custom hashCode() implementation
    public static class Student {
        private String name;
        private int id;
        private String email;

        public Student(String name, int id, String email) {
            this.name = name;
            this.id = id;
            this.email = email;
        }

        @Override
        public int hashCode() {
            // Combine hash codes of fields
            int result = 17; // Prime number
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + id;
            result = 31 * result + (email != null ? email.hashCode() : 0);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Student student = (Student) obj;
            return id == student.id &&
                    Objects.equals(name, student.name) &&
                    Objects.equals(email, student.email);
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', id=" + id + ", email='" + email + "'}";
        }
    }

    // 5. Hash collision demonstration
    public static void collisionExample() {
        System.out.println("=== Hash Collision Example ===");

        // These strings have the same hash code in Java
        String str1 = "Aa";
        String str2 = "BB";

        System.out.println("String 1: '" + str1 + "' hashCode: " + str1.hashCode());
        System.out.println("String 2: '" + str2 + "' hashCode: " + str2.hashCode());
        System.out.println("Collision: " + (str1.hashCode() == str2.hashCode()));

        // HashMap still works correctly despite collision
        HashMap<String, String> map = new HashMap<>();
        map.put(str1, "Value for Aa");
        map.put(str2, "Value for BB");

        System.out.println("HashMap with colliding keys:");
        System.out.println("map.get('" + str1 + "'): " + map.get(str1));
        System.out.println("map.get('" + str2 + "'): " + map.get(str2));
    }

    // 6. Performance comparison
    public static void performanceExample() {
        System.out.println("\n=== Performance Comparison ===");

        // Create large dataset
        HashMap<Integer, String> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        int size = 100000;

        // Fill data structures
        for (int i = 0; i < size; i++) {
            hashMap.put(i, "Value" + i);
            arrayList.add("Value" + i);
        }

        // Measure HashMap lookup
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            hashMap.get(size - 1); // Lookup last element
        }
        long hashMapTime = System.currentTimeMillis() - startTime;

        // Measure ArrayList search
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.indexOf("Value" + (size - 1)); // Search for last element
        }
        long arrayListTime = System.currentTimeMillis() - startTime;

        System.out.println("HashMap lookup time: " + hashMapTime + "ms");
        System.out.println("ArrayList search time: " + arrayListTime + "ms");
        System.out.println("HashMap is " + (arrayListTime / (double) hashMapTime) + "x faster");
    }

    public static void main(String[] args) {
        // Run all examples
        hashMapExample();

        System.out.println("\n=== Custom Hash Table ===");
        SimpleHashTable customTable = new SimpleHashTable();
        customTable.put("name", "John");
        customTable.put("age", "25");
        customTable.put("city", "New York");
        customTable.display();
        System.out.println("Retrieved name: " + customTable.get("name"));

        cryptographicHashExample();

        System.out.println("=== Custom Object Hashing ===");
        Student s1 = new Student("Alice", 123, "alice@email.com");
        Student s2 = new Student("Alice", 123, "alice@email.com");
        Student s3 = new Student("Bob", 456, "bob@email.com");

        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        // Using custom objects in HashMap
        HashMap<Student, String> studentGrades = new HashMap<>();
        studentGrades.put(s1, "A");
        studentGrades.put(s3, "B");
        System.out.println("Grade for s1: " + studentGrades.get(s1));
        System.out.println("Grade for s2: " + studentGrades.get(s2)); // Should be same as s1

        collisionExample();
        performanceExample();
    }
}