package learning.algorithms.neetCode.ValidAnagram;

import java.util.HashMap;
import java.util.Stack;

public class Solution1 {

    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> schars = new HashMap<>();

        for (char c : s.toCharArray()){
            if(schars.containsKey(c)){
                schars.replace(c, schars.get(c)+1);
            } else {
                schars.put(c,1);
            }
        }

        for(char c: t.toCharArray()){
            if(schars.containsKey(c) && schars.get(c) > 1){
                schars.replace(c, schars.get(c)-1);
            } else if(schars.containsKey(c) && schars.get(c) == 1){
                schars.remove(c);
            }
            else {
                return false;
            }
        }

        if(schars.isEmpty()){
            return true;
        }
        return false;
    }

}
