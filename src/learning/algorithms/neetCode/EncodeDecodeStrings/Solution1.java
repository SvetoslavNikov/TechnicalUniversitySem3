package learning.algorithms.neetCode.EncodeDecodeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {
        List<String> ls1 = Arrays.asList("neet", "code", "love", "you");
        List<String> ls = new ArrayList<>();

        // Test case with a non-empty list
        System.out.println(encode(ls1));
        System.out.println(decode(encode(ls1)));

        // Test case with an empty list
        System.out.println(encode(ls));   // Should print an empty string
        System.out.println(decode(encode(ls)));  // Should print an empty list
    }

    public static String encode(List<String> strs) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            str.append(strs.get(i));
            if (i != strs.size() - 1) {
                str.append(' '); // Add space between elements, except after the last one
            }
        }

        return str.toString();
    }

    public static List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();  // Return an empty list for an empty string
        }

        return Arrays.stream(str.split(" ")).collect(Collectors.toList());
    }
}
