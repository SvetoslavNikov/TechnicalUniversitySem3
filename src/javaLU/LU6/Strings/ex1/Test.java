package javaLU.LU6.Strings.ex1;

import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        //new указва,
        // че задължително трябва да се задели нова памет за обекта.
        if(str == str2){
            System.out.println("wtf");
        }

        if(str2 == str3){
            System.out.println("OMFG");
        }

    }
}
