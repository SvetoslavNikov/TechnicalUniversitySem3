package javaLectures.String;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "hi";
        String b = a.concat(" there");
        System.out.println(a);
        System.out.println(b);

        System.out.println(a.getBytes());//hexadecimal address
        System.out.println(Arrays.toString(a.getBytes()));
        //104,105 - the ASCII value of 'h' and 'i';

        //every  char is 2 bytes
        //get bytes returns an array of bytes
        //toString works with all primitive data types

        System.out.println(a.hashCode());
        System.out.println(a.replace("hi", "HELLOO"));// the reference stays the SAME!
        System.out.println(a.hashCode());

        int[] arrint = {1,2,3,4};
        System.out.println(arrint);//returns the hexadecimal representation of an adress



    }
}
