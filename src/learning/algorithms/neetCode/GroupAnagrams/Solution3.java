package learning.algorithms.neetCode.GroupAnagrams;

import java.util.*;

public class Solution3 {
    //O(m*n)
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
        //accepted
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            int[] count = new int[26];//so this array represents the alphabet where count[1] = 3 means 3 times 'b'
            for(char c: chars){
                count[c -'a']++;

            }
            String key = new String(Arrays.toString(count));

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(strs[i]);
        }//O(m*n*26) -> O(m*n)
        System.out.println(map.keySet());// [1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0], .....

        System.out.println(Arrays.toString(strs));
        return new ArrayList<>(map.values());
    }
}
