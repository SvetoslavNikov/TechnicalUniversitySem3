package javaLU.Hashfunctions.Clothes;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Clothes jacket = new Clothes("jacket", "L", 43);
        Clothes shirt = new Clothes("shirt", "M", 10);

        System.out.println(jacket.hashCode());
        System.out.println(shirt.hashCode());
        System.out.println(jacket.equals(shirt));

        String key1 = jacket.getType();
        HashMap<String, Clothes> map = new HashMap<>();
        map.put(key1, jacket);
        map.put(shirt.getType(), shirt);

        System.out.println(map);
        System.out.println(map.get(key1));
        System.out.println(map.isEmpty());

        System.out.println("jeans");
        Jeans j1 = new Jeans("blue","M",10);
        Jeans j2 = new Jeans("blue","M",10);
        Jeans j3 = new Jeans();

        System.out.println(j1.hashCode());
        System.out.println(j2.hashCode());

        System.out.println(j1.getSize().hashCode());
        System.out.println(j2.getSize().hashCode());
        System.out.println(j3.getSize().hashCode());
        j2 = j1;

        System.out.println(j1.equals(j2));
        System.out.println(j1.equals(null));






    }
}
