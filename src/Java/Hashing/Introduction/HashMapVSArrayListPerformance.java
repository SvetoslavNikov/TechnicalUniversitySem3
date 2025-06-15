package Java.Hashing.Introduction;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapVSArrayListPerformance {
    public static void main(String[] args) {
        performanceExample();
    }

    public static void performanceExample() {
        System.out.println("\n=== Performance and Memory Comparison ===");

        HashMap<Integer, String> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        int size = 100000;

        // Measure memory before filling HashMap
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest garbage collection before measurement
        long beforeMemoryHashMap = runtime.totalMemory() - runtime.freeMemory();

        // Measure filling HashMap
        long startFillingTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            hashMap.put(i, "Value" + i);
        }
        long hashMapFillTime = System.currentTimeMillis() - startFillingTime;

        // Measure memory after filling HashMap
        runtime.gc();
        long afterMemoryHashMap = runtime.totalMemory() - runtime.freeMemory();
        long hashMapMemoryUsed = afterMemoryHashMap - beforeMemoryHashMap;

        // Measure memory before filling ArrayList
        runtime.gc();
        long beforeMemoryArrayList = runtime.totalMemory() - runtime.freeMemory();

        // Measure filling ArrayList
        startFillingTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add("Value" + i);
        }
        long arrayListFillTime = System.currentTimeMillis() - startFillingTime;

        // Measure memory after filling ArrayList
        runtime.gc();
        long afterMemoryArrayList = runtime.totalMemory() - runtime.freeMemory();
        long arrayListMemoryUsed = afterMemoryArrayList - beforeMemoryArrayList;

        // Measure HashMap lookup (get last element 1000 times)
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            hashMap.get(size - 1);
        }
        long hashMapLookupTime = System.currentTimeMillis() - startTime;

        // Measure ArrayList search (indexOf last element 1000 times)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.indexOf("Value" + (size - 1));
        }
        long arrayListSearchTime = System.currentTimeMillis() - startTime;

        // Print results
        System.out.println("HashMap filling 100k elements time: " + hashMapFillTime + " ms");
        System.out.println("ArrayList filling 100k elements time: " + arrayListFillTime + " ms");
        System.out.println("ArrayList filling is " + ((double) hashMapFillTime/arrayListFillTime) + "x faster");

        System.out.println();

        System.out.println("HashMap lookup time (1000 times): " + hashMapLookupTime + " ms");
        System.out.println("ArrayList search time (1000 times): " + arrayListSearchTime + " ms");
        System.out.println("HashMap lookup is " + (arrayListSearchTime / (double) hashMapLookupTime) + "x faster");

        System.out.println();

        System.out.println("HashMap memory used: " + (hashMapMemoryUsed / 1024) + " KB");
        System.out.println("ArrayList memory used: " + (arrayListMemoryUsed / 1024) + " KB");
    }
}
