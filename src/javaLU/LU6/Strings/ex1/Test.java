package javaLU.LU6.Strings.ex1;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        str2 = "we changed";
        String str3 = new String("Hello");
        //new указва,
        // че задължително трябва да се задели нова памет за обекта.
        if(str == str2){
            System.out.println("wtf" + str);
        }

        if(str2 == str3){
            System.out.println("OMFG");
        }

        System.out.println(str);
        System.out.println(str2);

        String splitMe = "1,2,3,4,5,6";
        String[] splited = splitMe.split(",");

        String numbers = "1,2,3,4,5";

        //ArrayList<Integer> integerList = Arrays.stream(numbers.split(","))
        //.map(Integer::parseInt)
        //.collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> nums = Arrays.stream(splited)
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toCollection(ArrayList::new));

        //\n

        /*for (int i = 0; i < text.length(); i++) {
            if(check(text)){
                for (int j = i; j > 0; j++) {
                }
            }
        }*/
        String text = "Hello, this is the first line.\n" +
                "Here is the second line.\n" +
                "This is the third line.\n" +
                "Finally, this is the fourth line.";
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder(text);
        for (int i = 0; i < check(text); i++) {
            a.append(text.charAt(i));
        }
        System.out.println(String.valueOf(a));




        ArrayList<String> linesOfText = Arrays.stream(text.split("\n")).collect(Collectors.toCollection(ArrayList::new));

    }

    public static int check(String text){
        Pattern pattern = Pattern.compile("\\n|\\r\\n");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            return matcher.start();
        }
        return 0;
    }
}
