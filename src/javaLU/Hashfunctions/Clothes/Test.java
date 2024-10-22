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


    }
}
