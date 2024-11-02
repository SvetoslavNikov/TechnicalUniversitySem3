package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    
    public static int roman(String s){
        Map<Character, Integer> romanToIntMap = new HashMap<>();

        // Populate the map with Roman numeral values
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        char[] arr = s.toCharArray();// XIV
        int num = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int current = romanToIntMap.get(arr[i]);

                int next = romanToIntMap.get(arr[i + 1]);

            if(current > next){
                num +=current;

            } else{
                num += next - current;
                i++;
            }
        }
        System.out.println(num);
        return num;

    }

    public static void main(String[] args) {
        roman("MCMXCIVI");
    }
}
