package javaLU.Hashfunctions.Clothes;

import javaLU.Hashfunctions.Clothes.Clothes;

public class TestHashcodes {
    public static void main(String[] args) {
        Clothes jacket = new Clothes();
        Clothes shirt = new Clothes();
        System.out.println("Jacket hashcode: " + jacket.hashCode());
        System.out.println("Shirt hashcode: " + shirt.hashCode());
        System.out.println(shirt.equals(jacket));

        Clothes tshirt = shirt;
        System.out.println("Tshirt hashcode: " + tshirt.hashCode());
        System.out.println(tshirt.equals(shirt));

        //predefined hashcode method in String objects
        String s1 = new String("ivan");
        String s2 = new String("ivan");//we use new to explicitly say to allocate new memory for the same input,
        //otherwise s2 will just refer to the memory address of s1

        System.out.println("The s1 hashCode is: " + s1.hashCode());
        System.out.println("The s1 hashCode is: " + s2.hashCode());
        System.out.println(shirt);
        System.out.println(jacket);

        Clothes tanktop = new Clothes("tanktop","L",3);
        Object obj = new Object();

        try {

            System.out.println(tanktop.equals(obj));
            System.out.println(shirt.equals(jacket));
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
