package learning.algorithms.neetCode.GroupAnagrams;

import java.util.*;

public class Solution2 {
    //O(m*nlogn)

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
        //accepted
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);//O(nlogn)
            map.putIfAbsent(Arrays.toString(chars) ,new ArrayList<>());
            map.get(Arrays.toString(chars)).add(strs[i]);
        } //O(m*nlogn)

        System.out.println(Arrays.toString(strs));
        return new ArrayList<>(map.values());
    }
}
