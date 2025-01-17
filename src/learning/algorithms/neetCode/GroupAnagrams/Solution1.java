package learning.algorithms.neetCode.GroupAnagrams;

import java.util.*;

public class Solution1 {
    //O(m^2)*O(n) groupAnagrams
    //m number of strings
    //n the longest string isAnagram

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));

        //accepted
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        //anagrams are just two strings with same letters in different order
        List<List<String>> ls = new LinkedList<>();
        ls.add(new ArrayList<>(List.of(strs[0])));

        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < ls.size(); j++) {
                if (isAnagrams(ls.get(j).get(0), strs[i])) {
                    ls.get(j).add(strs[i]);
                    break;
                }
                if(j == ls.size()-1){
                        ls.add(new ArrayList<>(List.of(strs[i])));
                        break;
                }
            }
        }
        //O(m^2)*O(n) worst case


        return ls;
    }

    public static boolean isAnagrams(String s1, String s2){
        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();
        HashMap<Character, Integer> myMap = new HashMap<>();


        if(s1.length() != s2.length()){
            return false;
        }

        if(s1 == s2){
            return true;
        }

        for (int i = 0; i < charS1.length; i++) {
            char key = charS1[i];
            if(myMap.containsKey(key)){
                myMap.replace(key,myMap.get(key)+1);
            } else {
                myMap.put(key, 1);
            }
        }
        //O(n)

        for (int i = 0; i < charS2.length; i++) {
            char key = charS2[i];
            if(myMap.containsKey(key)){
                int times = myMap.get(key);
                if(times > 1){
                    myMap.replace(key, times-1);
                } else {
                    myMap.remove(key);
                }
            }
        }
        //O(n)

        if(myMap.isEmpty()){
            return true;
        } else {
            return false;
        }


    }
}
