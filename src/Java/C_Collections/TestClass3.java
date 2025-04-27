package Java.C_Collections;

import java.util.*;

public class TestClass3 {
    public static void main(String[] args) {
        String[] strs = new String[]{"act","pots","tops","cat","stop","hat"};
        groupAnagrams(strs);



    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String,List<String>> map = new HashMap<>();


        for(int i = 0; i<strings.length; i++){
            String current = strings[i];
            for(int j = i+1; j<strings.length-1; j++){
                if(areAnagrams(current, strings[j])){
                    if(map.containsKey(current)){
                        map.get(current).add(strings[j]);
                    } else {
                        map.put(current, new ArrayList<>(List.of(current)));
                    }
                }
            }
        }

        List<List<String>> ls = new ArrayList<>();
        for(String key: map.keySet()){
            ls.add(map.get(key));
        }


        return ls;

    }

    //O(n),O(n)
    public static boolean areAnagrams(String s1, String s2){
        if(s1 == null || s2 == null){
            return false;
        }

        if(s1.length() != s2.length()){
            return false;
        }

        Map<Character,Integer> chars = new HashMap<>();

        for(int i = 0; i<s1.length(); i++){
            char current = s1.charAt(i);
            if(chars.containsKey(current)){
                chars.put(current, chars.get(current)+1);
            } else {
                chars.put(current, 1);
            }
        }

        for(int i = 0; i<s2.length(); i++){
            char current = s2.charAt(i);
            if(chars.containsKey(current) &  chars.get(current) > 0){
                chars.put(current, chars.get(current)-1);
            } else {
                return false;
            }
        }

        return true;
    }
}
